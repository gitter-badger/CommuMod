package io.cyb3rwarri0r8.commumod.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import io.cyb3rwarri0r8.commumod.config.ConfigHandler;
import io.cyb3rwarri0r8.commumod.help.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by noah on 8/30/14.
 */
public class ModGuiConfig extends GuiConfig
{


    public ModGuiConfig(GuiScreen parentScreen)
    {
        super(parentScreen,
                new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MODID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
    }
}
