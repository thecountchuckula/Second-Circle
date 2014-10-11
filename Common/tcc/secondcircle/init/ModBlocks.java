package com.tcc.secondcircle.init;

import com.tcc.secondcircle.block.BlockPortal;
import com.tcc.secondcircle.block.BlockSC;
import com.tcc.secondcircle.reference.Names;
import com.tcc.secondcircle.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockSC portal = new BlockPortal();

    public static void init()
    {
        GameRegistry.registerBlock(portal, Names.Blocks.PORTAL);
    }
}
