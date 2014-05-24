package com.endergriefer.jamoa.world;

import com.endergriefer.jamoa.blocks.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * Created by noah on 5/14/14.
 */
public class WorldGenjamoa implements IWorldGenerator
{
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case -1:
                generateNether(world, rand, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, rand, chunkX*16, chunkZ*16);
        }
    }

    private void generateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
        for(int i = 0; i < 10; i++) {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(40);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModBlocks.superbiumOre, 5)).generate(world, rand, randPosX, randPosY, randPosZ);
        }

        for (int j = 0; j < 25; j++) {
            int randPosX = chunkX + rand.nextInt(12);
            int randPosY = rand.nextInt(80);
            int randPosZ = chunkZ + rand.nextInt(12);

            (new WorldGenMinable(ModBlocks.aradactiteOre, 8)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
    }


    private void generateNether(World world, Random rand, int i, int j)
    {

    }

}
