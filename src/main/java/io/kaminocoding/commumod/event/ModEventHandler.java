package io.kaminocoding.commumod.event;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.event.entity.player.PlayerEvent;

import java.util.Random;

/**
 * Created by noah on 9/2/14.
 */
public class ModEventHandler
{
    public static Random rand;
    public static String brothersName = "Adm_seakiller";

    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.HIGHEST, receiveCanceled = true)
    public void onEvent(PlayerEvent.NameFormat event)
    {
        if(event.username == brothersName)
        {
            event.displayname = event.username + " the dude";
        }

    }


}
