package com.tcc.secondcircle.proxy;

import com.tcc.secondcircle.client.settings.Keybindings;
import com.tcc.secondcircle.entity.*;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.*;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);

    }
    @Override
    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityVampire.class, new RenderVampire(new ModelBiped(), 0.25F));
        RenderingRegistry.registerEntityRenderingHandler(EntityScarecrow.class, new RenderScarecrow(new ModelBiped(), 0.25F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwister.class, new RenderTwister(new ModelTwister(), 0.25F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMunchkin.class, new RenderMunchkin(new ModelMunchkin(), 0.25F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGoodWitch.class, new RenderGoodWitch(new ModelBiped(), 0.25F));

    }
}
