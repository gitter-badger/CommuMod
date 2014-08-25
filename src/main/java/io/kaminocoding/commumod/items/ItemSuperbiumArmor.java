package io.kaminocoding.commumod.items;


import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;


/**
 * Created by noah on 5/14/14.
 */
public class ItemSuperbiumArmor extends ItemArmor {
    public ItemSuperbiumArmor(ArmorMaterial material, int armorType, String name) {
        super(material, 0, armorType );

        setCreativeTab(main.modTab);
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

                LivingEvent.LivingUpdateEvent event = new LivingEvent.LivingUpdateEvent(player);
                MinecraftForge.EVENT_BUS.post(event);

            }

            if (itemStack.getItem() == ModItems.superbiumChestPlate){
                if (player.capabilities.allowFlying == false){
                    player.capabilities.allowFlying = true;
                }
            }

        }

    }

}
// || = or