package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

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
}
// || = or