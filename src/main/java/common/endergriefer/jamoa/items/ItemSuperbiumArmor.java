package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;


/**
 * Created by noah on 5/14/14.
 */
public class ItemSuperbiumArmor extends ItemArmor {
    public ItemSuperbiumArmor(ArmorMaterial material, int armorType, String name) {
        super(material, 0, armorType );

        setCreativeTab(jamoa.jamoaTab);
        setUnlocalizedName(name);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));


    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ModItems.superbiumHelmet || stack.getItem() == ModItems.superbiumChestPlate || stack.getItem() == ModItems.superbiumBoots) {
            return Reference.MODID + ":" + "/models/armor/superbiumarmor_1.png";
        }else if(stack.getItem() == ModItems.superbiumLeggings) {
            return Reference.MODID + ":" + "/models/armor/superbiumarmor_2.png";
        }else {
            System.out.println("Error: Texture not found! Check spelling!");
            return null;
        }
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        super.onArmorTick(world, player, itemStack);
        {
            if (itemStack.getItem() == ModItems.superbiumBoots && itemStack.getItem() == ModItems.superbiumChestPlate && itemStack.getItem() == ModItems.superbiumHelmet && itemStack.getItem() == ModItems.superbiumLeggings) {

                player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 6, 4));

            }

        }
            if (player.capabilities.allowFlying == false) {
                player.capabilities.allowFlying = true;
            }
        }


    

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
// || = or