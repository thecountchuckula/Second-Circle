package com.tcc.secondcircle.creativetab;

import com.tcc.secondcircle.init.ModItems;
import com.tcc.secondcircle.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabSC
{
    public static final CreativeTabs SC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {

        @Override

        public Item getTabIconItem()
        {
            return ModItems.scicon;
        }
    };
}
