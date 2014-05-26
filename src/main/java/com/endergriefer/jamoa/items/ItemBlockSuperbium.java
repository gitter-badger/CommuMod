package com.endergriefer.jamoa.items;

import com.endergriefer.jamoa.help.Reference;

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
