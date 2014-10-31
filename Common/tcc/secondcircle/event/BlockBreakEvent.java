//Thank you to MrArcane111 for having an Enchantments Mod on GitHub that I could Copy/Paste from.

package com.tcc.secondcircle.event;

import com.tcc.secondcircle.enchantment.ModEnchantments;
import com.tcc.secondcircle.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWood;
import net.minecraft.client.particle.EffectRenderer;
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
    int fortuneLevel = 0;
    int fireToolLevel = 0;

	// Misc.
    @SubscribeEvent
    public void onBlockBreak(BlockEvent.HarvestDropsEvent event)
    {
        Block block = event.block;
        if(!event.world.isRemote && event.harvester != null)
        {
            EntityPlayer player = event.harvester;
            if(!event.world.isRemote && player.inventory.getCurrentItem() != null)
            {
                ItemStack heldItem = player.inventory.getCurrentItem();
                if(EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, heldItem) > 0)
                {
                    fortuneLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, heldItem);
                }
                else
                {
                    fortuneLevel = 0;
                }
                if(EnchantmentHelper.getEnchantmentLevel(ModEnchantments.firetool.effectId, heldItem) > 0)
                {
                    fireToolLevel = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.firetool.effectId, heldItem);
                }
                else
                {
                    fireToolLevel = 0;
                }
            }
        }
        if (fireToolLevel == 1)
        {
            //Will remove these references, once I figure how to implement furnaceRecipes
            if (block == Blocks.iron_ore && event.harvester.canHarvestBlock(block))
            {
                if(fireToolLevel == 1)
                {
                    event.drops.clear();
                    event.drops.add(new ItemStack(Items.iron_ingot, 1, 0));
                    if(fortuneLevel >= 1)
                    {
                        int foCount = event.world.rand.nextInt(fortuneLevel);
                        for (int i = 0; i < foCount; ++i)
                        {
                            event.drops.add(new ItemStack(Items.iron_ingot, 1, 0));
                        }
                    }
                }
                event.dropChance = 1.0F;
            }
            if (block == Blocks.gold_ore && event.harvester.canHarvestBlock(block))
            {
                if(fireToolLevel == 1)
                {
                    event.drops.clear();
                    event.drops.add(new ItemStack(Items.gold_ingot, 1, 0));
                    if(fortuneLevel >= 1)
                    {
                        int foCount = event.world.rand.nextInt(fortuneLevel);
                        for (int i = 0; i < foCount; ++i)
                        {
                            event.drops.add(new ItemStack(Items.gold_ingot, 1, 0));
                        }
                    }
                }
                event.dropChance = 1.0F;
            }
            if (block == Blocks.sand && event.harvester.canHarvestBlock(block))
            {
                if(fireToolLevel == 1)
                {
                    event.drops.clear();
                    event.drops.add(new ItemStack(Blocks.glass, 1, 0));
                    if(fortuneLevel >= 1)
                    {
                        int foCount = event.world.rand.nextInt(fortuneLevel);
                        for (int i = 0; i < foCount; ++i)
                        {
                            event.drops.add(new ItemStack(Blocks.glass, 1, 0));
                        }
                    }
                }
                event.dropChance = 1.0F;
            }
            if (block == Blocks.log | block == Blocks.log2 && event.harvester.canHarvestBlock(block))
            {
                if(fireToolLevel == 1)
                {
                    event.drops.clear();
                    event.drops.add(new ItemStack(Items.coal, 1, 1));
                    if(fortuneLevel >= 1)
                    {
                        int foCount = event.world.rand.nextInt(fortuneLevel);
                        for (int i = 0; i < foCount; ++i)
                        {
                            event.drops.add(new ItemStack(Items.coal, 1, 1));
                        }
                    }
                }
                event.dropChance = 1.0F;
            }
            if (block == Blocks.clay && event.harvester.canHarvestBlock(block))
            {
                if(fireToolLevel == 1)
                {
                    event.drops.clear();
                    event.drops.add(new ItemStack(Items.brick, 4, 0));
                    if(fortuneLevel >= 1)
                    {
                        int foCount = event.world.rand.nextInt(fortuneLevel);
                        for (int i = 0; i < foCount; ++i)
                        {
                            event.drops.add(new ItemStack(Items.brick, 1, 0));
                        }
                    }
                }
                event.dropChance = 1.0F;
            }
            if (block == Blocks.stone | block == Blocks.cobblestone && event.harvester.canHarvestBlock(block))
            {
                if(fireToolLevel == 1)
                {
                    event.drops.clear();
                    event.drops.add(new ItemStack(Blocks.stone, 1, 0));
                }
                event.dropChance = 1.0F;
            }
        }
    }
}