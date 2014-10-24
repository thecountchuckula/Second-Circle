package com.tcc.secondcircle.event;

import com.tcc.secondcircle.handler.AchievementHandler;
import com.tcc.secondcircle.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class BatKillEvent {
    public int batkill = 1001;
	@SubscribeEvent
	public void onBatKill(LivingDropsEvent event) {
		// algorithm by Pahimar
		event.drops.clear();
		if (event.source.getDamageType().equals("player")) {
			EntityPlayer player = (EntityPlayer) event.source.getEntity();

			if (event.entityLiving instanceof EntityBat) {
                batkill = batkill -1;
                LogHelper.info((batkill - 1) + "/1000 Bats Left to Kill");
                if(batkill == 1)
                {
                    player.addStat(AchievementHandler.secondCircleBat, batkill);
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

					EntityPlayer player = (EntityPlayer) event.source.getEntity();
					if (event.entityLiving instanceof EntityBat) {
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