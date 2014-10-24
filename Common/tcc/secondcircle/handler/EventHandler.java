package com.tcc.secondcircle.handler;

import com.tcc.secondcircle.client.handler.KeyInputEventHandler;
import com.tcc.secondcircle.event.*;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public class EventHandler {
    public static void init() {
        MinecraftForge.EVENT_BUS.register(new SecondCircleEvent());
        MinecraftForge.EVENT_BUS.register(new ArmorEvent());
        MinecraftForge.EVENT_BUS.register(new BatKillEvent());
        FMLCommonHandler.instance().bus().register(new AchievementPortalEvent());
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
    }
}
