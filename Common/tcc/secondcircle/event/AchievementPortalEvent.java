package com.tcc.secondcircle.event;

import com.tcc.secondcircle.enchantment.ModEnchantments;
import com.tcc.secondcircle.handler.AchievementHandler;
import com.tcc.secondcircle.reference.Reference;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;

public class AchievementPortalEvent
{
    // Gives Achievement secondcircleportal when travelling to DIM -2
    @SubscribeEvent
    public void portalAchievement(PlayerEvent.PlayerChangedDimensionEvent event)
    {
        if(event.toDim == Reference.DIM_ID)
        {
            event.player.addStat(AchievementHandler.secondCirclePortal, 1);
        }
    }
}
