package io.kaminocoding.commumod;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import io.kaminocoding.commumod.blocks.ModBlocks;
import io.kaminocoding.commumod.config.configHandler;
import io.kaminocoding.commumod.entity.EntityAradactiteGolem;
import io.kaminocoding.commumod.entity.EntityMiner;
import io.kaminocoding.commumod.entity.EntitySuperbiumGolem;
import io.kaminocoding.commumod.event.ModEventHandler;
import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.items.ModItems;
import io.kaminocoding.commumod.proxy.proxyCommon;
import io.kaminocoding.commumod.world.modWorld;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

import java.util.Random;
//TODO Add aradactite and superbium golems

@Mod(modid = io.kaminocoding.commumod.help.Reference.MODID, version = io.kaminocoding.commumod.help.Reference.VERSION, guiFactory = Reference.GuiFactoryClass)



public class main
{

    public static void registerEntity(Class entityClass, String name)
    {

        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        long seed = name.hashCode();
        Random rand = new Random(seed);
        int primaryColor = rand.nextInt() * 16777215;
        int secondaryColor = rand.nextInt() * 16777215;

        EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
        EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));

    }



    @SidedProxy(clientSide="io.kaminocoding.commumod.proxy.proxyClient", serverSide="io.kaminocoding.commumod.proxy.proxyCommon")
    public static proxyCommon proxy;

    // Create a new creative tab
    public static CreativeTabs modTab = new CreativeTabsCommuMod("modTab");
    // Configuration file
    public static Configuration configFile;


    @Mod.Instance(Reference.MODID)
    public static main instance;


    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        //TODO Finish the superbium golem
        configFile = new Configuration(event.getSuggestedConfigurationFile());

        ModBlocks.loadBlocks();
        ModItems.loadItems();
        modWorld.initWorldGen();
        registerEntity(EntityMiner.class, "miner");
        registerEntity(EntitySuperbiumGolem.class, "superbiumGolem");
        registerEntity(EntityAradactiteGolem.class, "aradactiteGolem");
        configHandler.init(configFile.getConfigFile());


        proxy.registerRenderers();
        proxy.registerEntitySpawn();
        proxy.registerTileEntities();
        proxy.registerNetwork();


    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

//        NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
        LanguageRegistry.instance().addStringLocalization("itemGroup.modTab", "en_US", "CommuMod");
        EntityRegistry.addSpawn(EntityMiner.class, 2, 1, 3, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.extremeHills});


    }

    @Mod.EventHandler
    public void load(FMLPostInitializationEvent event)
    {

        MinecraftForge.EVENT_BUS.register(new ModEventHandler());
        FMLCommonHandler.instance().bus().register(new ModEventHandler());

    }


}