package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.blocks.ModBlocks;
import common.endergriefer.jamoa.help.RegisterHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by noah on 5/14/14.
 */
public class ModItems {


    public static Item superbiumIngot;
    public static Item blockSuperbium;

    //Add Tools
    public static Item superbiumPick;
    public static Item superbiumAxe;
    public static Item superbiumShovel;
    public static Item superbiumHoe;
    public static Item superbiumSword;

    public static Item superbiumHelmet;
    public static Item superbiumChestPlate;
    public static Item superbiumLeggings;
    public static Item superbiumBoots;
    // Add dust that is returned when mined out
    public static Item superbiumDust;
    //Tool material
    static Item.ToolMaterial myToolMaterial = EnumHelper.addToolMaterial("myToolMaterial", 2, 1200, 8, 10.0F, 50);
    static ItemArmor.ArmorMaterial superbiumArmorMaterial = EnumHelper.addArmorMaterial("myArmorMaterial", 30, new int[]{3,6,5,3}, 30);

    //===================================================================================
    //Aradactite
    // Aradactite Material
    static Item.ToolMaterial aradactiteToolMaterial = EnumHelper.addToolMaterial("aradactiteToolMaterial", 3, 800, 5, 6.0F, 30);
    static ItemArmor.ArmorMaterial aradactiteArmorMaterial = EnumHelper.addArmorMaterial("aradactiteArmorMaterial", 25, new int[]{2,4,3,3}, 15);
    // =================================
    public static Item aradactiteIngot;
    // --------------------------------
    public static Item aradactitePick;
    public static Item aradactiteAxe;
    public static Item aradactiteShovel;
    public static Item aradactiteHoe;
    public static Item aradactiteSword;
    // --------------------------------
    // Armor
    public static Item aradactiteHelmet;
    public static Item aradactiteChestplate;
    public static Item aradactiteLeggings;
    public static Item aradactiteBoots;
    // ==================================================================================
    // Ruby
    public static Item ruby;
    static Item.ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("rubyToolMaterial",3,1800,5.0F,8.25F,100);
    public static Item rubyPick;
    public static Item rubyAxe;
    public static Item rubyShovel;
    public static Item rubyHoe;
    public static Item rubySword;

    public static void loadItems()
    {
        //Load all necessary items
        superbiumIngot = new ItemSuperbiumIngot();
        RegisterHelper.registerItem(superbiumIngot);
        //*******************************************************************************
        superbiumDust = new ItemSuperbiumDust();
        RegisterHelper.registerItem(superbiumDust);
        GameRegistry.addSmelting(superbiumDust, new ItemStack(superbiumIngot), 400F);
        // ******************************************************************************
        // First Pick
        superbiumPick = new ItemSuperbiumPick(myToolMaterial);
        RegisterHelper.registerItem(superbiumPick);
        //Recipe
        GameRegistry.addRecipe(new ItemStack(superbiumPick), new Object[]
                {
                        "XXX",
                        " Y ",
                        " Y ",
                        'X', superbiumIngot, 'Y', Items.stick,
                });

        // ******************************************************************************
        // First Axe
        superbiumAxe = new ItemSuperbiumAxe(myToolMaterial);
        RegisterHelper.registerItem(superbiumAxe);
        //Recipe
        GameRegistry.addRecipe(new ItemStack(superbiumAxe), new Object[]
                {
                        "XX ",
                        "XY ",
                        " Y ",
                        'X', superbiumIngot, 'Y', Items.stick,
                });

        // ******************************************************************************
        // First Sword
        superbiumSword = new ItemSuperbiumSword(myToolMaterial);
        RegisterHelper.registerItem(superbiumSword);
        // Recipe
        GameRegistry.addRecipe(new ItemStack(superbiumSword), new Object[]
                {
                        " X ",
                        " X ",
                        " Y ",
                        'X', superbiumIngot, 'Y', Items.stick,
                });
        //*******************************************************************************
        superbiumShovel = new ItemSuperbiumShovel(myToolMaterial);
        RegisterHelper.registerItem(superbiumShovel);
        RegisterHelper.regToolRecipe(superbiumShovel, superbiumIngot, Items.stick, "shovel");
        // ******************************************************************************
        superbiumHoe = new ItemSuperbiumHoe(myToolMaterial);
        RegisterHelper.registerItem(superbiumHoe);
        RegisterHelper.regToolRecipe(superbiumHoe, superbiumIngot, Items.stick, "hoe");
        //Armor
        superbiumHelmet = new ItemSuperbiumArmor(superbiumArmorMaterial, 0, "superbiumHelmet");
        RegisterHelper.registerItem(superbiumHelmet);
        RegisterHelper.regArmorRecipe(superbiumHelmet, superbiumIngot, "helmet");
        // ******************************************************************************
        superbiumChestPlate = new ItemSuperbiumArmor(superbiumArmorMaterial, 1, "superbiumChestplate");
        RegisterHelper.registerItem(superbiumChestPlate);
        RegisterHelper.regArmorRecipe(superbiumChestPlate, superbiumIngot, "chestplate");
        // ******************************************************************************
        superbiumLeggings = new ItemSuperbiumArmor(superbiumArmorMaterial, 2, "superbiumLeggings");
        RegisterHelper.registerItem(superbiumLeggings);
        RegisterHelper.regArmorRecipe(superbiumLeggings, superbiumIngot, "leggings");
        // ******************************************************************************
        superbiumBoots = new ItemSuperbiumArmor(superbiumArmorMaterial, 3, "superbiumBoots");
        RegisterHelper.registerItem(superbiumBoots);
        RegisterHelper.regArmorRecipe(superbiumBoots, superbiumIngot, "boots");
        // Superbium block
        // ******************************************************************************
        blockSuperbium = new ItemBlockSuperbium();
        RegisterHelper.registerItem(blockSuperbium);
        // ******************************************************************************
        //Aradactite blocks
        //=================
        //aradactite ore
        aradactiteIngot = new ItemAradactiteIngot();
        RegisterHelper.registerItem(aradactiteIngot);
        GameRegistry.addSmelting(ModBlocks.aradactiteOre, new ItemStack(aradactiteIngot), 10);
        // Aradactite tools
        aradactitePick = new ItemAradactitePick(aradactiteToolMaterial);
        RegisterHelper.registerItem(aradactitePick);
        GameRegistry.addRecipe(new ItemStack(aradactitePick), new Object[]
                {
                        "XXX",
                        " Y ",
                        " Y ",
                        'X', aradactiteIngot, 'Y', Items.stick,
                });
        // ******************************************************************************
        aradactiteAxe = new ItemAradactiteAxe(aradactiteToolMaterial);
        RegisterHelper.registerItem(aradactiteAxe);
        GameRegistry.addRecipe(new ItemStack(aradactiteAxe), new Object[]
                {
                        "XX ",
                        "XY ",
                        " Y ",
                        'X', aradactiteIngot, 'Y', Items.stick,
                });
        // ******************************************************************************
        aradactiteShovel = new ItemAradactiteShovel(aradactiteToolMaterial);
        RegisterHelper.registerItem(aradactiteShovel);
        GameRegistry.addRecipe(new ItemStack(aradactiteShovel), new Object[]{
                " X ",
                " Y ",
                " Y ",
                'X', aradactiteIngot, 'Y', Items.stick,
        });
        // ******************************************************************************
        aradactiteHoe = new ItemAradactiteHoe(aradactiteToolMaterial);
        RegisterHelper.registerItem(aradactiteHoe);
        GameRegistry.addRecipe(new ItemStack(aradactiteHoe), new Object[]{
                "XX ",
                " Y ",
                " Y ",
                'X', aradactiteIngot, 'Y', Items.stick,
        });
        // ******************************************************************************
        aradactiteSword = new ItemAradactiteSword(aradactiteToolMaterial);
        RegisterHelper.registerItem(aradactiteSword);
        GameRegistry.addRecipe(new ItemStack(aradactiteSword), new Object[]{
                " X ",
                " X ",
                " Y ",
                'X', aradactiteIngot, 'Y', Items.stick,
        });
        // Aradactite Armor
        aradactiteHelmet = new ItemAradactiteArmor(aradactiteArmorMaterial, 0, "aradactiteHelmet");
        RegisterHelper.registerItem(aradactiteHelmet);
        RegisterHelper.regArmorRecipe(aradactiteHelmet, aradactiteIngot, "helmet");
        // ******************************************************************************
        aradactiteChestplate = new ItemAradactiteArmor(aradactiteArmorMaterial, 1, "aradactiteChestplate");
        RegisterHelper.registerItem(aradactiteChestplate);
        RegisterHelper.regArmorRecipe(aradactiteChestplate, aradactiteIngot, "chestplate");
        // ******************************************************************************
        aradactiteLeggings = new ItemAradactiteArmor(aradactiteArmorMaterial, 2, "aradactiteLeggings");
        RegisterHelper.registerItem(aradactiteLeggings);
        RegisterHelper.regArmorRecipe(aradactiteLeggings, aradactiteIngot, "leggings");
        // ******************************************************************************
        aradactiteBoots = new ItemAradactiteArmor(aradactiteArmorMaterial, 3, "aradactiteBoots");
        RegisterHelper.registerItem(aradactiteBoots);
        RegisterHelper.regArmorRecipe(aradactiteBoots, aradactiteIngot, "boots");
        // ==============================================================================
        // ******************************************************************************
        // Ruby items
        ruby = new ItemRuby();
        RegisterHelper.registerItem(ruby);
        // Ruby tools
        rubyPick = new ItemRubyPickaxe(rubyToolMaterial);
        RegisterHelper.registerItem(rubyPick);
        RegisterHelper.regToolRecipe(rubyPick,ruby,Items.stick,"pickaxe");

        rubyAxe = new ItemRubyAxe(rubyToolMaterial);
        RegisterHelper.registerItem(rubyAxe);
        RegisterHelper.regToolRecipe(rubyAxe,ruby,Items.stick,"axe");

        rubyShovel = new ItemRubyShovel(rubyToolMaterial);
        RegisterHelper.registerItem(rubyShovel);
        RegisterHelper.regToolRecipe(rubyShovel,ruby,Items.stick,"shovel");

        rubyHoe = new ItemRubyHoe(rubyToolMaterial);
        RegisterHelper.registerItem(rubyHoe);
        RegisterHelper.regToolRecipe(rubyHoe,ruby,Items.stick,"hoe");

        rubySword = new ItemRubySword(rubyToolMaterial);
        RegisterHelper.registerItem(rubySword);
        RegisterHelper.regToolRecipe(rubySword,ruby,Items.stick,"sword");


    }

}
