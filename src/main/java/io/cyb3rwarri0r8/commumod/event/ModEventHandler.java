package io.cyb3rwarri0r8.commumod.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.cyb3rwarri0r8.commumod.items.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;

/**
 * Created by noah on 9/2/14.
 */
public class ModEventHandler
{

    @SubscribeEvent
    public void onLivingUpdateEvent(LivingEvent.LivingUpdateEvent event)
    {
        if (event.entityLiving != null)
        {
            if(event.entityLiving instanceof EntityPlayer)
            {
                EntityPlayer player = ((EntityPlayer)event.entityLiving);
                if(player.inventory.armorItemInSlot(2) == null && player.capabilities.isCreativeMode == false){
                    if(player.capabilities.allowFlying == true){
                        player.capabilities.allowFlying = false;
                    }
                }else if(player.capabilities.isCreativeMode == false && player.inventory.armorItemInSlot(2).getItem()  != ModItems.superbiumChestPlate){
                    if(player.capabilities.allowFlying == true){
                        player.capabilities.allowFlying = false;
                    }
                }
            }
        }
    }






/*    private static String friendsUsername = configHandler.friendUserName;
    private static String friendsNickname = configHandler.friendNickName;

    public static Random rand;

    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.HIGHEST, receiveCanceled = true)
    public void onPlayerUpdate(PlayerEvent.NameFormat event)
    {
        System.out.println("Registering player name format changes");
        if( event.username == friendsUsername)
        {
           event.displayname = friendsUsername + friendsNickname;
        }
    }*/

}
