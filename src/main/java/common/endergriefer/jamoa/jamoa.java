package common.endergriefer.jamoa;

import common.endergriefer.jamoa.blocks.ModBlocks;
import common.endergriefer.jamoa.entity.EntityMiner;
import common.endergriefer.jamoa.food_items.foodItems;
import common.endergriefer.jamoa.help.jamoaEventHandler;
import common.endergriefer.jamoa.items.ModItems;
import common.endergriefer.jamoa.proxy.proxyCommon;
import common.endergriefer.jamoa.world.jamoaworld;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.common.config.Configuration;
import java.util.Random;


@Mod(modid = jamoa.MODID, version = jamoa.VERSION, guiFactory = "com.endergriefer.jamoa.ModGuiFactory")




public class jamoa
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

    @SidedProxy(clientSide="common.endergriefer.jamoa.proxy.proxyClient", serverSide="common.endergriefer.jamoa.proxy.proxyCommon")
    public static proxyCommon proxy;

    public static final String MODID = "endergriefer_jamoa";
    public static final String VERSION = "1.1.1";
    // Create a new creative tab
    public static CreativeTabs jamoaTab = new CreativeTabsJamoa("jamoaTab");

    public static Configuration configFile;

    public static int myConfigInt = 32;

    public static String myConfigString = "Hello World";

    public static boolean myConfigBool = false;


    @Mod.Instance(MODID)
    public static jamoa instance;


    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        // some example code
        ModBlocks.loadBlocks();
        ModItems.loadItems();
        foodItems.loadFood();
        jamoaworld.mainRegistry();
        registerEntity(EntityMiner.class, "miner");


        proxy.registerRenderers();
        proxy.registerEntitySpawn();

        configFile = new Configuration(event.getSuggestedConfigurationFile());
        syncConfig();

    }



    public void init(FMLInitializationEvent event)
    {
        LanguageRegistry.instance().addStringLocalization("itemGroup.jamoaTab", "en_US", "JAMOA");
        EntityRegistry.addSpawn(EntityMiner.class,4,0,5,EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.extremeHills});
        MinecraftForge.EVENT_BUS.register(new jamoaEventHandler());
        FMLCommonHandler.instance().bus().register(instance);

    }


    public static void syncConfig() {
        myConfigInt = configFile.getInt("My Config Integer", Configuration.CATEGORY_GENERAL, myConfigInt, 0, Integer.MAX_VALUE, "An Integer!");
        myConfigString = configFile.getString("My Config String", Configuration.CATEGORY_GENERAL, myConfigString, "A String!");
        myConfigBool = configFile.getBoolean("My Config Bool", Configuration.CATEGORY_GENERAL, myConfigBool, "A Boolean!");

        if(configFile.hasChanged())
            configFile.save();
    }


}