package com.tcc.secondcircle.handler;

import com.tcc.secondcircle.init.ModBlocks;
import com.tcc.secondcircle.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.List;

public class CraftingHandler
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.igniter), "  n", " q ", " d ", 'n', Items.nether_star, 'q', Items.quartz, 'd', Items.diamond);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.igniter), " s ", "sss", " s ", 's', "stickWood"));
        GameRegistry.addSmelting(new ItemStack(ModItems.rawbat, 1, 0), new ItemStack(ModItems.cookedbat, 1, 0), 0.35F);
    }
}
