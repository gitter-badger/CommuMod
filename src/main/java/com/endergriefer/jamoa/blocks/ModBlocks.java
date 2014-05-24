package com.endergriefer.jamoa.blocks;

import com.endergriefer.jamoa.help.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by noah on 5/14/14.
 */
public class ModBlocks {
    public static Block superbiumOre;
    public static Block superbiumBlock;
    // Aradactite
    public static Block aradactiteOre;

    public static void loadBlocks()
    {
        //Load all necessary blocks here...
        superbiumOre = new BlockSuperbiumOre();
        RegisterHelper.registerBlock(superbiumOre);
        // ******************************************************************************
        superbiumBlock = new BlockSuperbiumBlock(Material.rock);
        RegisterHelper.registerBlock(superbiumBlock);
        // ******************************************************************************
        //Aradactite
        aradactiteOre = new BlockAradactiteOre();
        RegisterHelper.registerBlock(aradactiteOre);

    }

}
