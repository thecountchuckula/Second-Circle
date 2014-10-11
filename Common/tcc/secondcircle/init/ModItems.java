package com.tcc.secondcircle.init;

import com.tcc.secondcircle.item.ItemIgniter;
import com.tcc.secondcircle.item.ItemSC;
import com.tcc.secondcircle.item.SCIcon;
import com.tcc.secondcircle.reference.Names;
import com.tcc.secondcircle.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemSC igniter = new ItemIgniter();
    public static final ItemSC scicon = new SCIcon();

    public static void init()
    {
        GameRegistry.registerItem(igniter, Names.Items.IGNITER);
        GameRegistry.registerItem(scicon, Names.Items.SCICON);
    }
}
