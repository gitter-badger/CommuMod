package io.kaminocoding.commumod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import io.kaminocoding.commumod.help.RegisterHelper;
import io.kaminocoding.commumod.items.ModItems;
import io.kaminocoding.commumod.main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by noah on 5/14/14.
 */
public class ModBlocks {
    public static Block superbiumOre;
    public static Block superbiumBlock;
    // Aradactite
    public static Block aradactiteOre;
    public static Block aradactiteBlock;
    // Superbium TNT
    public static Block superbiumTNT;
    // Miner shack
    public static Block minerShack;
    // Superbium torch
    public static Block superbiumTorch;

    // Ruby
    public static Block rubyOre;
    public static Block rubyBlock;

    public static Block purifier_idle;
    public static Block purifier_active;

    //Waterdactite
    public static Block cobaltOre;

    /**************************************************************************************
    ************************Water/Liquid blocks********************************************/
    public static Fluid pureWater;
    private static Block pureWaterBlock;


    public static void loadBlocks()
    {
        //Load all necessary blocks here...
        superbiumOre = new BlockSuperbiumOre();
        RegisterHelper.registerBlock(superbiumOre);
        // ******************************************************************************
        superbiumBlock = new BlockSuperbiumBlock(Material.rock);
        RegisterHelper.registerBlock(superbiumBlock);
        GameRegistry.addRecipe(new ItemStack(superbiumBlock, 1), new Object[]{
                "XXX",
                "XXX",
                "XXX",
                'x', ModItems.superbiumIngot
        });
        // ******************************************************************************
        //Aradactite
        aradactiteOre = new BlockAradactiteOre();
        RegisterHelper.registerBlock(aradactiteOre);
        // Aradactite block
        aradactiteBlock = new BlockAradactiteBlock(Material.anvil);
        RegisterHelper.registerBlock(aradactiteBlock);
        GameRegistry.addRecipe(new ItemStack(aradactiteBlock, 1), new Object[]{
                "XXX",
                "XXX",
                "XXX",
                'x', ModItems.aradactiteIngot
        });
        // Superbium TNT
        superbiumTNT = new BlockSuperbiumTNT();
        RegisterHelper.registerBlock(superbiumTNT);
        GameRegistry.addRecipe(new ItemStack(superbiumTNT, 2), new Object[]{
                "XYX",
                "YZY",
                "XYX",
                'x', ModItems.superbiumDust, 'y', Items.stick, 'z', Items.gunpowder
        });
        // Instant structures generation
        minerShack = new BlockMinerShack(Material.rock);
        RegisterHelper.registerBlock(minerShack);
        // ******************************************************************************
        // Superbium torch
        superbiumTorch = new BlockSuperbiumTorch();
        RegisterHelper.registerBlock(superbiumTorch);
        GameRegistry.addRecipe(new ItemStack(superbiumTorch, 4), new Object[]{
                "   ",
                " Y ",
                " X ",
                'y', ModItems.superbiumDust, 'x', Items.stick
        });
        // ******************************************************************************
        // Ruby ore
        rubyOre = new BlockRubyOre(Material.rock);
        RegisterHelper.registerBlock(rubyOre);

        rubyBlock = new BlockRuby(Material.rock);
        RegisterHelper.registerBlock(rubyBlock);
        GameRegistry.addRecipe(new ItemStack(rubyBlock,1), new Object[]{
                "XXX",
                "XXX",
                "XXX",
                'x', ModItems.ruby
        });

//        purifier_idle = new BlockPurifier_idle(false);
//        RegisterHelper.registerBlock(purifier_idle);
//
//        purifier_active = new BlockPurifier_active(false);
//        RegisterHelper.registerBlock(purifier_active);

        cobaltOre = new BlockCobaltOre(Material.rock);
        RegisterHelper.registerBlock(cobaltOre);

        purifier_idle = new BlockPurifier(false).setBlockName("purifierIdle").setCreativeTab(main.modTab);
        RegisterHelper.registerBlock(purifier_idle);



        purifier_active = new BlockPurifier(true).setBlockName("purifierActive");
        RegisterHelper.registerBlock(purifier_active);




    }


}
