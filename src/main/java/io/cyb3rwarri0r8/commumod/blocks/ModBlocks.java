package io.cyb3rwarri0r8.commumod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import io.cyb3rwarri0r8.commumod.fluids.ModFluids;
import io.cyb3rwarri0r8.commumod.help.RegisterHelper;
import io.cyb3rwarri0r8.commumod.items.ModItems;
import io.cyb3rwarri0r8.commumod.main;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

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
    // Hydrogen TNT
    public static Block hydrogenTNT;
    // Miner shack
    public static Block minerShack;
    // Superbium torch
    public static Block superbiumTorch;

    // Ruby
    public static Block rubyOre;
    public static Block rubyBlock;

    public static Block purifier_idle;
    public static Block purifier_active;

    //Cobalt
    public static Block cobaltOre;

    public static Block appleBlock;

    public static Material materialRetaw = new MaterialLiquid(MapColor.blueColor);



    /**************************************************************************************
    ************************Water/Liquid blocks********************************************/
    public static Block pureWaterBlock;
    public static Block retawBlock;

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



        cobaltOre = new BlockCobaltOre(Material.rock);
        RegisterHelper.registerBlock(cobaltOre);

        purifier_idle = new BlockPurifier(false).setBlockName("purifierIdle").setCreativeTab(main.modTab);
        RegisterHelper.registerBlock(purifier_idle);
        GameRegistry.addRecipe(new ItemStack(purifier_idle,1), new Object[]{
                "XXX",
                "X X",
                "XXX",
                'x', ModItems.cobaltIngot
        });



        purifier_active = new BlockPurifier(true).setBlockName("purifierActive");
        RegisterHelper.registerBlock(purifier_active);

        appleBlock = new BlockOfApple();
        RegisterHelper.registerBlock(appleBlock);
        GameRegistry.addRecipe(new ItemStack(appleBlock,1), new Object[]{
                "XXX",
                "XXX",
                "XXX",
                'x', Items.apple
        });

        hydrogenTNT = new BlockHydrogenTNT();
        RegisterHelper.registerBlock(hydrogenTNT);
        GameRegistry.addRecipe(new ItemStack(hydrogenTNT,1), new Object[]{
                "XYX",
                "YXY",
                "XYX",
                'x', ModItems.enderDust, 'y', Blocks.sand
        });

        pureWaterBlock = new BlockPureWater(ModFluids.pureWater, Material.water);
        RegisterHelper.registerBlock(pureWaterBlock);

        retawBlock = new BlockRetaw(ModFluids.retaw, materialRetaw);
        RegisterHelper.registerBlock(retawBlock);


    }



}
