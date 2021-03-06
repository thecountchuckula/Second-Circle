package com.tcc.secondcircle.enchantment;

import com.tcc.secondcircle.reference.Names;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class EnchantmentHelm extends Enchantment {

	public EnchantmentHelm(int par1, int par2) {
		super(par1, par2, EnumEnchantmentType.armor_head);
        this.setName(Names.Enchantments.NV);
	}
    public int getMinEnchantability(int par1)
    {
        return 10 * par1;
    }
    public int getMaxLevel()
    {
        return 1;
    }

}
