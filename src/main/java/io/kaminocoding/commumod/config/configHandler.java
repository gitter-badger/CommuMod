package io.kaminocoding.commumod.config;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.kaminocoding.commumod.help.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by noah on 8/30/14.
 */
public class configHandler
{
    public static Configuration configuration;
    public static Boolean testValue = false;

    public static void init(File configFile)
    {


        boolean configValue = false;
        if(configuration == null){
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MODID))
        {
            loadConfiguration();
        }
    }
}
