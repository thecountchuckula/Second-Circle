package com.tcc.secondcircle.enchantment;

import com.tcc.secondcircle.reference.Names;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class EnchantmentTool extends Enchantment {
    public EnchantmentTool(int par1, int par2) {
        super(par1, par2, EnumEnchantmentType.digger);
        this.setName(Names.Enchantments.FT);
    }
    public int getMinEnchantability(int par1)
    {
        return 30 * par1;
    }
    public int getMaxLevel()
    {
        return 1;
    }

    /**
     * Determines if the enchantment passed can be applied together with this enchantment.
     */
    public boolean canApplyTogether(Enchantment p_77326_1_)
    {
        return super.canApplyTogether(p_77326_1_) && p_77326_1_.effectId != silkTouch.effectId;
    }

}
