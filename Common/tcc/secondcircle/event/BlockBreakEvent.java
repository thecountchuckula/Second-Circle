//Thank you to MrArcane111 for having an Enchantments Mod on GitHub that I could Copy/Paste from.

package com.tcc.secondcircle.event;

import com.tcc.secondcircle.enchantment.ModEnchantments;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;

import java.util.ArrayList;


public class BlockBreakEvent {
	// Booleans
	boolean isFireTool = false;

	// Integers
    int fortuneLevel;
    int fireToolLevel;

	// Misc.
    @SubscribeEvent
    public void onBlockBreak(BlockEvent.HarvestDropsEvent event)
    {
        Block block = event.block;
        if(event.harvester.inventory.getCurrentItem().getItem() != null)
        {
            EntityPlayer player = event.harvester;
            ItemStack heldItem = player.inventory.getCurrentItem();
            fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, heldItem);
            fireToolLevel = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.firetool.effectId, heldItem);
        }
        else
        {
            fortuneLevel = 0;
            fireToolLevel = 0;
        }
        ArrayList<FurnaceRecipes> furnaceRecipes;

        if (!event.world.isRemote && fireToolLevel > 0) {
            if (block == Blocks.iron_ore)
            {
                GenerateLootList(event.drops,
                        Items.iron_ingot,
                        fortuneLevel,
                        fireToolLevel,
                        event.world);
                event.dropChance = 1.0F;
                return;
            }
        }

    }
    private void GenerateLootList
            (ArrayList<ItemStack> dList,
             Item dItem,
             int fLevel,
             int fTLevel,
             World world)
    {
        int foCount = 0;
        if(fLevel >= 0 && fTLevel > 0)
        {
            foCount = world.rand.nextInt(fLevel);
            dList.clear();
            ItemStack drops = new ItemStack(dItem, 1, 0);
            dList.add(drops);
            if(fLevel > 0) {
                for (int i = 0; i < foCount; ++i) {
                    ItemStack fodrops = new ItemStack(dItem, 2, 0);
                    dList.add(fodrops);
                }
            }
        }
    }
}