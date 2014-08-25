package io.kaminocoding.commumod.help;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.kaminocoding.commumod.items.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;


/**
 * Created by noah on 7/5/14.
 */
public class jamoaEventHandler {

    @SubscribeEvent
    public void onLivingUpdateEvent(LivingEvent.LivingUpdateEvent event)
    {
        if (event.entityLiving != null)
        {
            if(event.entityLiving instanceof EntityPlayer)
            {
                EntityPlayer player = ((EntityPlayer)event.entityLiving);
                if(player.inventory.armorItemInSlot(2) == null){
                    if(player.capabilities.allowFlying == true){
                        player.capabilities.allowFlying = false;
                    }
                }else if(player.inventory.armorItemInSlot(2).getItem()  != ModItems.superbiumChestPlate){
                    if(player.capabilities.allowFlying == true){
                        player.capabilities.allowFlying = false;
                    }
                }
            }
        }
    }


}
