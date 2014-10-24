package com.tcc.secondcircle.event;


import com.tcc.secondcircle.handler.AchievementHandler;
import com.tcc.secondcircle.reference.Reference;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.EntityLiving;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;


public class SecondCircleEvent {
    @SubscribeEvent
    public void playerJumping(LivingEvent.LivingJumpEvent event) {
        int direction = event.entity.worldObj.rand.nextInt(4);
        if (event.entity.dimension == -2 && direction == 0)
        {
            event.entity.motionX = 1.5731572;
        }
        else if (event.entity.dimension == -2 && direction == 1)
        {
            event.entity.motionX = -1.5731572;
        }
        else if (event.entity.dimension == -2 && direction == 2)
        {
            event.entity.motionY = 1.5731572;
        }
        else if (event.entity.dimension == -2 && direction == 3)
        {
            event.entity.motionZ = 1.5731572;
        }
        else if (event.entity.dimension == -2 && direction == 4)
        {
            event.entity.motionZ = -1.5731572;
        }
        else
        {
            return;
        }
    }
    @SubscribeEvent
    public void playerFalling(LivingFallEvent.LivingUpdateEvent event)
    {
        if (event.entity.dimension == -2 && event.entity.motionY < 0)
        {
            event.entity.fallDistance = 0;
        }
    }
}
