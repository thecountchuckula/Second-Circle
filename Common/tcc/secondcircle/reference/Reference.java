package com.tcc.secondcircle.reference;

import net.minecraft.util.ResourceLocation;

public class Reference
{
    public static final String MOD_ID = "SecondCircle";
    public static final String MOD_NAME = "Second Circle";
    public static final String VERSION = "1.7.10-0.0.2.0";
    public static final String CLIENT_PROXY_CLASS = "com.tcc.secondcircle.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.tcc.secondcircle.proxy.ServerProxy";
    public static final String GUI_FACTORY_CLASS = "com.tcc.secondcircle.client.gui.GuiFactory";

    //Resources
    public static final ResourceLocation SOUNDDIR = new ResourceLocation(Reference.MOD_ID + ":" + "sounds/");
    public static final ResourceLocation MODELDIR = new ResourceLocation(Reference.MOD_ID + ":" + "models/");
    public static final ResourceLocation TEXTUREDIR = new ResourceLocation(Reference.MOD_ID + ":" + "textures/");
    public static final ResourceLocation LANGDIR = new ResourceLocation(Reference.MOD_ID + ":" + "lang/");

    public static final int DIM_ID = -2;

    //ArmorEnchants
    public static final int nightvisionID = 10;
    public static final int angelwingsID = 11;
    public static final int jumpingID = 12;
    public static final int swiftnessID = 13;
    //ToolEnchants
    public static final int firetoolID = 14;
}
