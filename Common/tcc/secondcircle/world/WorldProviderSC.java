package com.tcc.secondcircle.world;

import com.tcc.secondcircle.reference.Reference;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderSC extends WorldProvider {
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.hell, 0.1F);
        this.dimensionId = Reference.DIM_ID;
    }
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderSC(worldObj, worldObj.getSeed(), false);
    }

    @Override
    public String getDimensionName() {
        return "Second Circle";
    }
}
