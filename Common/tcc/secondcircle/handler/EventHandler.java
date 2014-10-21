package com.tcc.secondcircle.handler;

import com.tcc.secondcircle.event.ArmorEvent;
import com.tcc.secondcircle.event.SecondCircleEvent;
import net.minecraftforge.common.MinecraftForge;

public class EventHandler {
    public static void init() {
        MinecraftForge.EVENT_BUS.register(new SecondCircleEvent());
        MinecraftForge.EVENT_BUS.register(new ArmorEvent());


    }
}
