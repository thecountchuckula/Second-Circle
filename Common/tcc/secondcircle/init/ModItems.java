package com.tcc.secondcircle.init;

import com.tcc.secondcircle.item.ItemBatMeat;
import com.tcc.secondcircle.item.ItemIgniter;
import com.tcc.secondcircle.item.ItemSC;
import com.tcc.secondcircle.item.SCIcon;
import com.tcc.secondcircle.reference.Names;
import com.tcc.secondcircle.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemSC igniter = new ItemIgniter();
    public static final ItemSC scicon = new SCIcon();
    public static final ItemBatMeat rawbat = new ItemBatMeat(2, 0.3F, true, false, Names.Items.RAWBAT);
    public static final ItemBatMeat cookedbat = new ItemBatMeat(7, 0.9F, false, false, Names.Items.COOKEDBAT);

    public static void init()
    {
        GameRegistry.registerItem(igniter, Names.Items.IGNITER);
        GameRegistry.registerItem(scicon, Names.Items.SCICON);
        GameRegistry.registerItem(rawbat, Names.Items.RAWBAT);
        GameRegistry.registerItem(cookedbat, Names.Items.COOKEDBAT);
    }
}
