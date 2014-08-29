package io.kaminocoding.commumod.items;


import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by noah on 8/23/14.
 */
public class ItemRubyArmor extends ItemArmor {

    public ItemRubyArmor(ArmorMaterial material, int armorType, String name) {
        super(material, 0, armorType);
        setCreativeTab(main.modTab);
        setUnlocalizedName(name);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ModItems.rubyHelmet || stack.getItem() == ModItems.rubyChestplate || stack.getItem() == ModItems.rubyBoots) {
            return Reference.MODID + ":" + "models/armor/rubyarmor_1.png";
        } else if (stack.getItem() == ModItems.rubyLeggings) {
            return Reference.MODID + ":" + "models/armor/rubyarmor_2.png";
        } else {
            System.out.println("Error: Texture not found!");
            return null;
        }
    }

}
