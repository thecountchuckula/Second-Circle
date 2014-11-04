package com.tcc.secondcircle.item;

import com.tcc.secondcircle.init.ModBlocks;
import com.tcc.secondcircle.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class ItemIgniter extends ItemSC
{
    public ItemIgniter()
    {
        super();
        this.setMaxDamage(64);
        this.setMaxStackSize(1);
        this.setUnlocalizedName(Names.Items.IGNITER);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        if (p_77648_7_ == 0)
        {
            --p_77648_5_;
        }

        if (p_77648_7_ == 1)
        {
            ++p_77648_5_;
        }

        if (p_77648_7_ == 2)
        {
            --p_77648_6_;
        }

        if (p_77648_7_ == 3)
        {
            ++p_77648_6_;
        }

        if (p_77648_7_ == 4)
        {
            --p_77648_4_;
        }

        if (p_77648_7_ == 5)
        {
            ++p_77648_4_;
        }

        if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_))
        {
            return false;
        }
        else
        {
            if ((p_77648_3_.isAirBlock(p_77648_4_, p_77648_5_, p_77648_6_)) && p_77648_2_.dimension > -3 && p_77648_2_.dimension < 0)
            {
                p_77648_3_.playSoundEffect((double)p_77648_4_ + 0.5D, (double)p_77648_5_ + 0.5D, (double)p_77648_6_ + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
                p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, ModBlocks.fire);
            }
            else
            {
                p_77648_3_.playSoundEffect((double)p_77648_4_ + 0.5D, (double)p_77648_5_ + 0.5D, (double)p_77648_6_ + 0.5D, "mob.wither.spawn", 1.0F, itemRand.nextFloat() * 0.4F + 4.0F);
                p_77648_2_.addChatMessage(new ChatComponentTranslation(Names.Chat.PORTALFAIL));
            }

            p_77648_1_.damageItem(1, p_77648_2_);
            return true;
        }
    }
}