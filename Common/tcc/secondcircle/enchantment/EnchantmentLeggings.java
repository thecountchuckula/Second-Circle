package com.tcc.secondcircle.enchantment;

import com.tcc.secondcircle.reference.Names;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class EnchantmentLeggings extends Enchantment {

	public EnchantmentLeggings(int par1, int par2) {
		super(par1, par2, EnumEnchantmentType.armor_legs);
		this.setName(Names.Enchantments.JUMP);
	}
    public int getMinEnchantability(int par1)
    {
        return 10 * par1;
    }
    public int getMaxLevel()
    {
        return 4;
    }

}
