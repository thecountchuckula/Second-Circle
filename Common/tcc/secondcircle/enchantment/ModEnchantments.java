package com.tcc.secondcircle.enchantment;

import com.tcc.secondcircle.reference.Reference;
import net.minecraft.enchantment.Enchantment;


public class ModEnchantments
{
    public static Enchantment nightvision;
	public static Enchantment angelwings;
	public static Enchantment jumping;
	public static Enchantment swiftness;
    public static Enchantment firetool;
	
    public static void preInit() {
        defEnchantment();
        initGameRegistry();
        initLanguageRegistry();
    }

    public static void defEnchantment() {
    	nightvision = new EnchantmentHelm(Reference.nightvisionID, 2);
    	angelwings = new EnchantmentChestplate(Reference.angelwingsID, 2);
    	jumping = new EnchantmentLeggings(Reference.jumpingID, 2);
        swiftness = new EnchantmentBoots(Reference.swiftnessID, 2);
        firetool = new EnchantmentTool(Reference.firetoolID, 2);
    }

    public static void initGameRegistry() {

    }

    public static void initLanguageRegistry() {
    	
    }

}
