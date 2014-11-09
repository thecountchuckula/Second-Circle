package com.tcc.secondcircle.init;

import com.tcc.secondcircle.block.*;
import com.tcc.secondcircle.reference.Names;
import com.tcc.secondcircle.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockSC portal = new BlockPortal();
    public static final Block fire = new BlockFire();

    public static void preInit()
    {
        GameRegistry.registerBlock(portal, Names.Blocks.PORTAL);
        GameRegistry.registerBlock(fire, Names.Blocks.FIRE);
    }
}
