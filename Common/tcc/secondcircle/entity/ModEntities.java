package com.tcc.secondcircle.entity;


import com.tcc.secondcircle.SecondCircle;
import com.tcc.secondcircle.reference.Names;
import cpw.mods.fml.common.network.internal.EntitySpawnHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenPlains;

import java.util.Random;

public class ModEntities {
    public static void preInit() {
        registerEntity(EntityVampire.class, Names.Entities.VAMPIRE);
        for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++)
        {
            if (BiomeGenBase.getBiomeGenArray()[i] != null)
            {
                EntityRegistry.addSpawn(EntityVampire.class, 10, 4, 4, EnumCreatureType.monster, BiomeGenBase.getBiome(i));
            }
        }
        registerEntity(EntityMunchkin.class, Names.Entities.MUNCHKIN);
        for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++)
        {
            if (BiomeGenBase.getBiomeGenArray()[i] != null)
            {
                EntityRegistry.addSpawn(EntityMunchkin.class, 10, 4, 4, EnumCreatureType.monster, BiomeGenBase.getBiome(i));
            }
        }
        registerEntity(EntityScarecrow.class, Names.Entities.SCARECROW);
        for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++)
        {
            if (BiomeGenBase.getBiomeGenArray()[i] != null)
            {
                EntityRegistry.addSpawn(EntityScarecrow.class, 10, 4, 4, EnumCreatureType.monster, BiomeGenBase.getBiome(i));
            }
        }
        registerEntity(EntityTwister.class, Names.Entities.TWISTER);
        EntityRegistry.addSpawn(EntityTwister.class, 10, 4, 4, EnumCreatureType.monster, BiomeGenBase.plains);

        registerEntity(EntityGoodWitch.class, Names.Entities.GOODWITCH);
        for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++)
        {
            if (BiomeGenBase.getBiomeGenArray()[i] != null)
            {
                EntityRegistry.addSpawn(EntityGoodWitch.class, 10, 4, 4, EnumCreatureType.monster, BiomeGenBase.getBiome(i));
            }
        }
    }


    public static void registerEntity(Class entityClass, String name) {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        long seed = name.hashCode();
        Random rand = new Random(seed);
        int primaryColor = rand.nextInt() * 16777215;
        int secondaryColor = rand.nextInt() * 16777215;

        EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
        EntityRegistry.registerModEntity(entityClass, name, entityID, SecondCircle.instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
    }

}
