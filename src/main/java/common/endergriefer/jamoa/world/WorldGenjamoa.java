package common.endergriefer.jamoa.world;

import common.endergriefer.jamoa.blocks.ModBlocks;
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
                generateSurface(world, rand, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
        for(int i = 0; i < 2; i++) {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(60);
            int randPosZ = chunkZ + rand.nextInt(16);

            new WorldGenMinable(ModBlocks.superbiumOre, 15).generate(world, rand, randPosX, randPosY, randPosZ);
        }

        for (int j = 0; j < 2; j++) {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(256);
            int randPosZ = chunkZ + rand.nextInt(16);

            new WorldGenMinable(ModBlocks.aradactiteOre, 30).generate(world, rand, randPosX, randPosY, randPosZ);
        }
    }


    private void generateNether(World world, Random rand, int i, int j)
    {

    }

}
