package common.endergriefer.jamoa.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by noah on 5/14/14.
 */
public class jamoaworld {

    public static void mainRegistry()
    {
        initWorldGen();
    }
    public static void initWorldGen()
    {
        registerWorldGen(new WorldGenjamoa(), 1);
    }

    public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability)
    {
        GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
    }
}
