package com.tcc.secondcircle.event;

import com.tcc.secondcircle.entity.EntityVampire;
import com.tcc.secondcircle.handler.AchievementHandler;
import com.tcc.secondcircle.init.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class BatKillEvent{


    @SubscribeEvent
	public void onBatKill(LivingDropsEvent event) {
		// algorithm by Pahimar
        World world = event.entityLiving.worldObj;
		if (event.source.getDamageType().equals("player")) {
			EntityPlayer player = (EntityPlayer) event.source.getEntity();

            if (event.entityLiving instanceof EntityBat) {
                event.drops.clear();
                int meat = ((EntityBat) event.entityLiving).worldObj.rand.nextInt(2);
                if (meat < 2)
                {
                    event.entityLiving.dropItem(ModItems.rawbat, 1);

                }

                
				if (event.lootingLevel == 0) {
					int gold = event.entityLiving.worldObj.rand.nextInt(6);

					if (gold < 1) {
						event.entityLiving.dropItem(Items.gold_nugget, 1);
					}
				}
				if (event.lootingLevel == 1) {
					int gold = event.entityLiving.worldObj.rand.nextInt(5);

					if (gold < 1) {
						event.entityLiving.dropItem(Items.gold_nugget, 1);
					}
				}
				if (event.lootingLevel == 2) {
					int gold = event.entityLiving.worldObj.rand.nextInt(4);

					if (gold < 1) {
						event.entityLiving.dropItem(Items.gold_nugget, 1);
					}
				}
				if (event.lootingLevel >= 3) {
					int gold = event.entityLiving.worldObj.rand.nextInt(3);

					if (gold < 1) {
						event.entityLiving.dropItem(Items.gold_nugget, 1);
					}
				}
			}
		}

		if (event.source.getSourceOfDamage() instanceof EntityArrow) {
			if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity != null) {
				if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity instanceof EntityPlayer) {

                    event.drops.clear();

					EntityPlayer player = (EntityPlayer) event.source.getEntity();
					if (event.entityLiving instanceof EntityBat) {
                        int meat = ((EntityBat) event.entityLiving).worldObj.rand.nextInt(2);
                        if(meat < 2)
                        {
                            event.entityLiving.dropItem(ModItems.rawbat, 1);

                        }
                        player.addStat(AchievementHandler.secondCircleBat, 1);
						if (event.lootingLevel == 0) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(6);

							if (gold < 1) {
								event.entityLiving.dropItem(
                                        Items.gold_nugget, 1);
							}
						}
						if (event.lootingLevel == 1) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(5);

							if (gold < 1) {
								event.entityLiving.dropItem(
                                        Items.gold_nugget, 1);
							}
						}
						if (event.lootingLevel == 2) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(4);

							if (gold < 1) {
								event.entityLiving.dropItem(
                                        Items.gold_nugget, 1);
							}
						}
						if (event.lootingLevel >= 3) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(3);

							if (gold < 1) {
								event.entityLiving.dropItem(
                                        Items.gold_nugget, 1);
							}
						}
					}
				}
			}
		}
	}
}