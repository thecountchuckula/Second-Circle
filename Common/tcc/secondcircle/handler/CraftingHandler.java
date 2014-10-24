package com.tcc.secondcircle.handler;

import com.tcc.secondcircle.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.inventory.ICrafting;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingHandler
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.igniter), "  n", " q ", " d ", 'n', Items.nether_star, 'q', Items.quartz, 'd', Items.diamond);
    }

}
