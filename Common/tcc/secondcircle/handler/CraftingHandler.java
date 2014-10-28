package com.tcc.secondcircle.handler;

import com.tcc.secondcircle.init.ModBlocks;
import com.tcc.secondcircle.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
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
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.fire), "stickWood", new ItemStack(ModItems.igniter)));
    }
    public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
        for (int i = 0; i < craftMatrix.getSizeInventory(); i++) {
            if (craftMatrix.getStackInSlot(i) != null) {
                ItemStack j = craftMatrix.getStackInSlot(i);
                if (j.getItem() != null && j.getItem() == ModItems.igniter) {
                    ItemStack k = new ItemStack(ModItems.igniter, 2, (j.getItemDamage() + 1));
                    if (k.getItemDamage() >= k.getMaxDamage()) {
                        k.stackSize--;
                    }
                    craftMatrix.setInventorySlotContents(i, k);
                }
            }
        }
    }
}
