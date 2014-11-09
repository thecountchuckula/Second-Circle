package com.tcc.secondcircle.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class VampireSummonEvent {
    @SubscribeEvent
    public void onBatKil (LivingDeathEvent event) {

        World world = event.entity.worldObj;
        if (event.source.getDamageType().equals("player")) {

            if (event.entityLiving instanceof EntityBat) {
                //Insert Code to spawn VampireBoss on bat death.
            }
        }

    }
}
