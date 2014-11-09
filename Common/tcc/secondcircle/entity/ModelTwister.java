package com.tcc.secondcircle.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelTwister extends ModelBase
{
    //fields
    ModelRenderer Layer01;
    ModelRenderer Layer02;
    ModelRenderer Layer03;
    ModelRenderer Layer04;
    ModelRenderer Layer05;
    ModelRenderer Layer06;
    ModelRenderer Layer07;
    ModelRenderer Layer08;
    ModelRenderer Layer09;
    ModelRenderer Layer10;
    ModelRenderer Layer11;
    ModelRenderer Layer12;
    ModelRenderer Layer13;

    public ModelTwister()

    {
        textureWidth = 64;
        textureHeight = 32;
        Layer01 = new ModelRenderer(this, 0, 0);
        Layer01.addBox(-2F, 20F, -2F, 4, 4, 4);
        Layer01.setRotationPoint(0F, 0F, 0F);
        Layer01.setTextureSize(64, 32);
        Layer01.mirror = true;
        setRotation(Layer01, 0F, 0F, 0F);
        Layer02 = new ModelRenderer(this, 0, 0);
        Layer02.addBox(2F, 15F, 2F, 4, 4, 4);
        Layer02.setRotationPoint(0F, 0F, 0F);
        Layer02.setTextureSize(64, 32);
        Layer02.mirror = true;
        setRotation(Layer02, 0F, 0F, 0F);
        Layer03 = new ModelRenderer(this, 0, 0);
        Layer03.addBox(4F, 10F, -3F, 4, 4, 4);
        Layer03.setRotationPoint(0F, 0F, 0F);
        Layer03.setTextureSize(64, 32);
        Layer03.mirror = true;
        setRotation(Layer03, 0F, 0F, 0F);
        Layer04 = new ModelRenderer(this, 0, 0);
        Layer04.addBox(2F, 5F, -8F, 4, 4, 4);
        Layer04.setRotationPoint(0F, 0F, 0F);
        Layer04.setTextureSize(64, 32);
        Layer04.mirror = true;
        setRotation(Layer04, 0F, 0F, 0F);
        Layer05 = new ModelRenderer(this, 0, 0);
        Layer05.addBox(-3F, 0F, -10F, 4, 4, 4);
        Layer05.setRotationPoint(0F, 0F, 0F);
        Layer05.setTextureSize(64, 32);
        Layer05.mirror = true;
        setRotation(Layer05, 0F, 0F, 0F);
        Layer06 = new ModelRenderer(this, 0, 0);
        Layer06.addBox(-9F, -5F, -7F, 4, 4, 4);
        Layer06.setRotationPoint(0F, 0F, 0F);
        Layer06.setTextureSize(64, 32);
        Layer06.mirror = true;
        setRotation(Layer06, 0F, 0F, 0F);
        Layer07 = new ModelRenderer(this, 0, 0);
        Layer07.addBox(-10F, -10F, -2F, 4, 4, 4);
        Layer07.setRotationPoint(0F, 0F, 0F);
        Layer07.setTextureSize(64, 32);
        Layer07.mirror = true;
        setRotation(Layer07, 0F, 0F, 0F);
        Layer08 = new ModelRenderer(this, 0, 0);
        Layer08.addBox(-7F, -15F, 4F, 4, 4, 4);
        Layer08.setRotationPoint(0F, 0F, 0F);
        Layer08.setTextureSize(64, 32);
        Layer08.mirror = true;
        setRotation(Layer08, 0F, 0F, 0F);
        Layer09 = new ModelRenderer(this, 0, 0);
        Layer09.addBox(-1F, -20F, 6F, 4, 4, 4);
        Layer09.setRotationPoint(0F, 0F, 0F);
        Layer09.setTextureSize(64, 32);
        Layer09.mirror = true;
        setRotation(Layer09, 0F, 0F, 0F);
        Layer10 = new ModelRenderer(this, 0, 0);
        Layer10.addBox(4F, -25F, 3F, 4, 4, 4);
        Layer10.setRotationPoint(0F, 0F, 0F);
        Layer10.setTextureSize(64, 32);
        Layer10.mirror = true;
        setRotation(Layer10, 0F, 0F, 0F);
        Layer11 = new ModelRenderer(this, 0, 0);
        Layer11.addBox(6F, -30F, -3F, 4, 4, 4);
        Layer11.setRotationPoint(0F, 0F, 0F);
        Layer11.setTextureSize(64, 32);
        Layer11.mirror = true;
        setRotation(Layer11, 0F, 0F, 0F);
        Layer12 = new ModelRenderer(this, 0, 0);
        Layer12.addBox(2F, -35F, -10F, 4, 4, 4);
        Layer12.setRotationPoint(0F, 0F, 0F);
        Layer12.setTextureSize(64, 32);
        Layer12.mirror = true;
        setRotation(Layer12, 0F, 0F, 0F);
        Layer13 = new ModelRenderer(this, 0, 0);
        Layer13.addBox(-4F, -40F, -12F, 4, 4, 4);
        Layer13.setRotationPoint(0F, 0F, 0F);
        Layer13.setTextureSize(64, 32);
        Layer13.mirror = true;
        setRotation(Layer13, 0F, 0F, 0F);
    }

    public int func_78104_a()
    {
        return 8;
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Layer01.render(f5);
        Layer02.render(f5);
        Layer03.render(f5);
        Layer04.render(f5);
        Layer05.render(f5);
        Layer06.render(f5);
        Layer07.render(f5);
        Layer08.render(f5);
        Layer09.render(f5);
        Layer10.render(f5);
        Layer11.render(f5);
        Layer12.render(f5);
        Layer13.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
