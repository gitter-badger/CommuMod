package com.endergriefer.jamoa;

import com.endergriefer.jamoa.blocks.ModBlocks;
import com.endergriefer.jamoa.items.ModItems;
import com.endergriefer.jamoa.world.jamoaworld;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = jamoa.MODID, version = jamoa.VERSION)
public class jamoa
{
    public static final String MODID = "endergriefer_jamoa";
    public static final String VERSION = "1.0";
    // Create a new creative tab
    public static CreativeTabs jamoaTab = new CreativeTabsJamoa("jamoaTab");
    

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        // some example code
        ModBlocks.loadBlocks();
        ModItems.loadItems();
        jamoaworld.mainRegistry();

    }
    public void init(FMLInitializationEvent event)
    {
        LanguageRegistry.instance().addStringLocalization("itemGroup.jamoaTab", "en_US", "JAMOA");

    }

}