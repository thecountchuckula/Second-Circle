package com.tcc.secondcircle.block;


import com.tcc.secondcircle.init.ModBlocks;
import com.tcc.secondcircle.reference.Names;
import com.tcc.secondcircle.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import java.util.Random;



public class BlockFire extends Block
{
    public BlockFire() {
        super(Material.fire);
        this.setBlockName(Names.Blocks.FIRE);
        this.setBlockTextureName(Names.Blocks.FIRE);
        this.setCreativeTab(null);
        this.setHardness(0.0F);
        this.setLightLevel(1.0F);
        this.setStepSound(soundTypeWood);
        this.disableStats();
    }
    public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_)
    {
        p_149670_5_.setFire(p_149670_1_.rand.nextInt(10));
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    public int getRenderType()
    {
        return 1;
    }
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }
    public boolean func_149698_L()
    {
        return false;
    }
    public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_)
    {
        return World.doesBlockHaveSolidTopSurface(p_149742_1_, p_149742_2_, p_149742_3_ - 1, p_149742_4_);
    }
    public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_)
    {
        if (p_149726_1_.getBlock(p_149726_2_, p_149726_3_ -1, p_149726_4_) == Blocks.nether_brick) {
            if (p_149726_1_.getBlock(p_149726_2_ + 1, p_149726_3_ - 1, p_149726_4_) == Blocks.nether_brick) {
                if (p_149726_1_.getBlock(p_149726_2_, p_149726_3_ - 1, p_149726_4_ + 1) == Blocks.nether_brick) {
                    if (p_149726_1_.getBlock(p_149726_2_ - 1, p_149726_3_ - 1, p_149726_4_) == Blocks.nether_brick) {
                        if (p_149726_1_.getBlock(p_149726_2_, p_149726_3_ - 1, p_149726_4_ - 1) == Blocks.nether_brick) {
                            if (p_149726_1_.getBlock(p_149726_2_ + 1, p_149726_3_ - 1, p_149726_4_ + 1) == Blocks.nether_brick) {
                                if (p_149726_1_.getBlock(p_149726_2_ + 1, p_149726_3_ - 1, p_149726_4_ + 1) == Blocks.nether_brick) {
                                    if (p_149726_1_.getBlock(p_149726_2_ - 1, p_149726_3_ - 1, p_149726_4_ - 1) == Blocks.nether_brick) {
                                        if (p_149726_1_.getBlock(p_149726_2_ - 1, p_149726_3_ - 1, p_149726_4_ - 1) == Blocks.nether_brick) {
                                            if (p_149726_1_.getBlock(p_149726_2_ - 1, p_149726_3_ - 1, p_149726_4_ + 2) == Blocks.nether_brick) {
                                                if (p_149726_1_.getBlock(p_149726_2_, p_149726_3_ - 1, p_149726_4_ + 2) == Blocks.nether_brick) {
                                                    if (p_149726_1_.getBlock(p_149726_2_ + 1, p_149726_3_ - 1, p_149726_4_ + 2) == Blocks.nether_brick) {
                                                        if (p_149726_1_.getBlock(p_149726_2_ - 2, p_149726_3_ - 1, p_149726_4_ + 1) == Blocks.nether_brick) {
                                                            if (p_149726_1_.getBlock(p_149726_2_ - 2, p_149726_3_ - 1, p_149726_4_) == Blocks.nether_brick) {
                                                                if (p_149726_1_.getBlock(p_149726_2_ - 2, p_149726_3_ - 1, p_149726_4_ - 1) == Blocks.nether_brick) {
                                                                    if (p_149726_1_.getBlock(p_149726_2_ + 1, p_149726_3_ - 1, p_149726_4_ - 2) == Blocks.nether_brick) {
                                                                        if (p_149726_1_.getBlock(p_149726_2_, p_149726_3_ - 1, p_149726_4_ - 2) == Blocks.nether_brick) {
                                                                            if (p_149726_1_.getBlock(p_149726_2_ - 1, p_149726_3_ - 1, p_149726_4_ - 2) == Blocks.nether_brick) {
                                                                                if (p_149726_1_.getBlock(p_149726_2_ + 2, p_149726_3_ - 1, p_149726_4_ + 1) == Blocks.nether_brick) {
                                                                                    if (p_149726_1_.getBlock(p_149726_2_ + 2, p_149726_3_ - 1, p_149726_4_) == Blocks.nether_brick) {
                                                                                        if (p_149726_1_.getBlock(p_149726_2_ + 2, p_149726_3_ - 1, p_149726_4_ - 1) == Blocks.nether_brick) {
                                                                                            //Layer 1
                                                                                            p_149726_1_.setBlock(p_149726_2_ + 1, p_149726_3_, p_149726_4_ + 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ + 1, p_149726_3_, p_149726_4_, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ + 1, p_149726_3_, p_149726_4_ - 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_ + 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_, p_149726_3_, p_149726_4_ - 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ - 1, p_149726_3_, p_149726_4_ + 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ - 1, p_149726_3_, p_149726_4_, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ - 1, p_149726_3_, p_149726_4_ - 1, ModBlocks.portal);
                                                                                            //Layer 2
                                                                                            p_149726_1_.setBlock(p_149726_2_ + 1, p_149726_3_ + 1, p_149726_4_ + 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ + 1, p_149726_3_ + 1, p_149726_4_, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ + 1, p_149726_3_ + 1, p_149726_4_ - 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_, p_149726_3_ + 1, p_149726_4_ + 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_, p_149726_3_ + 1, p_149726_4_, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_, p_149726_3_ + 1, p_149726_4_ - 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ - 1, p_149726_3_ + 1, p_149726_4_ + 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ - 1, p_149726_3_ + 1, p_149726_4_, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ - 1, p_149726_3_ + 1, p_149726_4_ - 1, ModBlocks.portal);
                                                                                            //Layer 3
                                                                                            p_149726_1_.setBlock(p_149726_2_ + 1, p_149726_3_ + 2, p_149726_4_ + 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ + 1, p_149726_3_ + 2, p_149726_4_, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ + 1, p_149726_3_ + 2, p_149726_4_ - 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_, p_149726_3_ + 2, p_149726_4_ + 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_, p_149726_3_ + 2, p_149726_4_, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_, p_149726_3_ + 2, p_149726_4_ - 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ - 1, p_149726_3_ + 2, p_149726_4_ + 1, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ - 1, p_149726_3_ + 2, p_149726_4_, ModBlocks.portal);
                                                                                            p_149726_1_.setBlock(p_149726_2_ - 1, p_149726_3_ + 2, p_149726_4_ - 1, ModBlocks.portal);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else
        {
            p_149726_1_.setBlockToAir(p_149726_2_, p_149726_3_, p_149726_4_);
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + Names.Blocks.FIRE);
    }
    /**
    * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
    */
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
}
