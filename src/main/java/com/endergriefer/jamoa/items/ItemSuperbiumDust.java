package com.endergriefer.jamoa.items;

import com.endergriefer.jamoa.help.Reference;
import com.endergriefer.jamoa.jamoa;

/**
 * Created by noah on 5/16/14.
 */
public class ItemSuperbiumDust extends net.minecraft.item.Item {
    public ItemSuperbiumDust()
    {
        super();
        setUnlocalizedName("superbiumDust");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
    }
}
