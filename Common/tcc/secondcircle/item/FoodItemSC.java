package com.tcc.secondcircle.item;

import com.tcc.secondcircle.creativetab.CreativeTabSC;
import com.tcc.secondcircle.reference.Names;
import com.tcc.secondcircle.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodItemSC extends ItemFood
{
    // A placeholder item for the Second Circle Creative Tab icon.
    public FoodItemSC(int healAmount, float saturationModifier, boolean isWolfsFavoriteMeat, boolean alwaysEdible, String unlocalizedName) {
        super(healAmount, saturationModifier, isWolfsFavoriteMeat);

        if (alwaysEdible) {
            this.setAlwaysEdible();
        }
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabSC.SC_TAB);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
