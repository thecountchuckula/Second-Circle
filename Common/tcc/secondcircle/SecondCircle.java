package com.tcc.secondcircle;

import com.tcc.secondcircle.client.handler.KeyInputEventHandler;
import com.tcc.secondcircle.enchantment.ModEnchantments;
import com.tcc.secondcircle.event.SecondCircleEvent;
import com.tcc.secondcircle.handler.ConfigurationHandler;
import com.tcc.secondcircle.handler.EventHandler;
import com.tcc.secondcircle.init.ModBlocks;
import com.tcc.secondcircle.init.ModItems;
import com.tcc.secondcircle.init.Recipes;
import com.tcc.secondcircle.proxy.IProxy;
import com.tcc.secondcircle.reference.Reference;
import com.tcc.secondcircle.utility.LogHelper;
//import com.tcc.secondcircle.world.WorldGeneratorPortal;
import com.tcc.secondcircle.world.WorldProviderSC;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.DimensionManager;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class SecondCircle
{
    @Mod.Instance(Reference.MOD_ID)
    public static SecondCircle instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        com.tcc.secondcircle.handler.ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        FMLCommonHandler.instance().bus().register(new EventHandler());

        proxy.registerKeyBindings();

        ModItems.init();
        ModBlocks.init();
        ModEnchantments.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        EventHandler.init();
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipes.init();
        LogHelper.info("Initialization Complete!");
        DimensionManager.registerProviderType(Reference.DIM_ID, WorldProviderSC.class, false);
        DimensionManager.registerDimension(Reference.DIM_ID, Reference.DIM_ID);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }

}
