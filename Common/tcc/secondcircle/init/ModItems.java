package com.tcc.secondcircle.init;

import com.tcc.secondcircle.item.*;
import com.tcc.secondcircle.reference.Names;
import com.tcc.secondcircle.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemSC igniter = new ItemIgniter();
    public static final ItemSC scicon = new SCIcon();
    public static final ItemBatMeat rawbat = new ItemBatMeat(2, 0.3F, true, false, Names.Items.RAWBAT);
    public static final ItemBatMeat cookedbat = new ItemBatMeat(7, 0.9F, false, false, Names.Items.COOKEDBAT);
    public static final ItemSC rock = new ItemRock();

    public static void preInit()
    {
        GameRegistry.registerItem(igniter, Names.Items.IGNITER);
        GameRegistry.registerItem(scicon, Names.Items.SCICON);
        GameRegistry.registerItem(rawbat, Names.Items.RAWBAT);
        GameRegistry.registerItem(cookedbat, Names.Items.COOKEDBAT);
        GameRegistry.registerItem(rock, Names.Items.ROCK);
    }
}
