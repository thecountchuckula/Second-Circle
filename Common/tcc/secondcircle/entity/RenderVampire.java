package com.tcc.secondcircle.entity;

import com.tcc.secondcircle.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderVampire extends RenderBiped {
    private static final ResourceLocation textureLocation = new ResourceLocation(Reference.MOD_ID + ":" + "models/entityvampire.png");
    public RenderVampire(ModelBiped model, float shadowSize) {

        super(model, shadowSize);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return textureLocation;
    }
}
