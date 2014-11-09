package com.tcc.secondcircle.handler;

import com.tcc.secondcircle.client.handler.KeyInputEventHandler;
import com.tcc.secondcircle.entity.EntityVampire;
import com.tcc.secondcircle.event.*;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;

public class EventHandler {
    public static void init() {
        MinecraftForge.EVENT_BUS.register(new SecondCircleEvent());
        MinecraftForge.EVENT_BUS.register(new ArmorEvent());
        MinecraftForge.EVENT_BUS.register(new BlockBreakEvent());
        MinecraftForge.EVENT_BUS.register(new BatKillEvent());
        MinecraftForge.EVENT_BUS.register(new VampireSummonEvent());
        FMLCommonHandler.instance().bus().register(new AchievementPortalEvent());
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
    }
}
