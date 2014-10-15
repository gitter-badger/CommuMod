package io.kaminocoding.commumod.food_items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

/**
 * Created by noah on 10/12/14.
 */
public class ItemAppleBlock extends ItemFood
{
    public ItemAppleBlock(int hunger, float saturation, boolean isWolfFood)
    {
        super(hunger, saturation, isWolfFood);
        setUnlocalizedName("appleBlock");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);

    }

    @Override
    public IIcon getIcon(ItemStack stack, int pass) {
        return super.getIcon(stack, pass);
    }
}
