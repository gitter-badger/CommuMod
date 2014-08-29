package io.kaminocoding.commumod.world;


import cpw.mods.fml.common.IWorldGenerator;
import io.kaminocoding.commumod.blocks.ModBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * Created by noah on 5/14/14.
 */
public class WorldGenMod implements IWorldGenerator
{
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case -1:
                generateNether(world, rand, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, rand, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
        for(int i = 0; i < 4; i++) {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(60);
            int randPosZ = chunkZ + rand.nextInt(16);

            new WorldGenMinable(ModBlocks.superbiumOre, 15).generate(world, rand, randPosX, randPosY, randPosZ);
        }

        for (int j = 0; j < 4; j++) {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(256);
            int randPosZ = chunkZ + rand.nextInt(16);

            new WorldGenMinable(ModBlocks.aradactiteOre, 30).generate(world, rand, randPosX, randPosY, randPosZ);
        }

        for (int r = 0; r < 4; r++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(56);
            int randPosZ = chunkZ + rand.nextInt(16);

            new WorldGenMinable(ModBlocks.rubyOre, 30).generate(world, rand, randPosX, randPosY, randPosZ);
        }


    }

    private void generate(World world, Random random, int x, int y, int z)
    {

    }


    private void generateNether(World world, Random rand, int i, int j)
    {

    }

}
