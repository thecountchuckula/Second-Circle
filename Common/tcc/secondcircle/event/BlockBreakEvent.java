//Thank you to MrArcane111 for having an Enchantments Mod on GitHub that I could Copy/Paste from.

package com.tcc.secondcircle.event;

import com.tcc.secondcircle.enchantment.ModEnchantments;
import com.tcc.secondcircle.init.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.event.world.BlockEvent;


public class BlockBreakEvent {

    int fortuneLevel = 0;
    int fireToolLevel = 0;

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.HarvestDropsEvent event) {
        Block block = event.block;
        if (!event.world.isRemote && event.harvester != null) {
            EntityPlayer player = event.harvester;
            if (!event.world.isRemote && player.inventory.getCurrentItem() != null) {
                ItemStack heldItem = player.inventory.getCurrentItem();
                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, heldItem) > 0) {
                    fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, heldItem);
                } else {
                    fortuneLevel = 0;
                }
                if (EnchantmentHelper.getEnchantmentLevel(ModEnchantments.firetool.effectId, heldItem) > 0) {
                    fireToolLevel = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.firetool.effectId, heldItem);
                } else {
                    fireToolLevel = 0;
                }
            }
        }
        if (fireToolLevel == 1) {
            Item dropItem = null;
            Item smeltResult = null;
            for (int dropScan = 0; dropScan < event.drops.size(); dropScan++) {
                dropItem = (event.drops.get(dropScan).getItem());
                if (FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(dropItem)) != null) {
                    smeltResult = FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(dropItem)).getItem();
                    event.drops.remove(new ItemStack(event.drops.get(dropScan).getItem()));
                    event.drops.add(dropScan, new ItemStack(smeltResult));
                    if (event.drops.get(dropScan).getItem() == Items.brick) {
                        event.drops.add(new ItemStack(smeltResult, 3, 0));
                    }
                    if (fortuneLevel >= 1 && block != Blocks.stone && block != Blocks.cobblestone) {
                        int foCount = event.world.rand.nextInt(fortuneLevel);
                        for (int i = 0; i < foCount; ++i) {
                            event.drops.add(new ItemStack(smeltResult));
                        }
                    }
                }
            }
        }
        if (block == Blocks.glass | block == Blocks.stained_glass && !event.isSilkTouching)
        {
            int shards = 1;
            event.drops.clear();
            event.drops.add(new ItemStack(ModItems.glassshard, shards, 0));
            if (fortuneLevel >= 1) {
                int fshards = fortuneLevel;
                event.drops.add(new ItemStack(ModItems.glassshard, (event.world.rand.nextInt(fshards)), 0));
            }
        }
        if (block == Blocks.stained_glass_pane | block == Blocks.glass_pane && !event.isSilkTouching)
        {
            int shards = 1;
            event.drops.clear();
            event.drops.add(new ItemStack(ModItems.glassshard, shards, 0));

        }
    }
}