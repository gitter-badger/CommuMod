package io.cyb3rwarri0r8.commumod.items;


import io.cyb3rwarri0r8.commumod.lib.Reference;

/**
 * Created by noah on 5/16/14.
 */
public class ItemBlockSuperbium extends net.minecraft.item.Item {
    public ItemBlockSuperbium()
    {
        super();
        setUnlocalizedName("itemSuperbiumBlock");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));

    }
}
