package com.endergriefer.jamoa.items;


import com.endergriefer.jamoa.help.Reference;
import com.endergriefer.jamoa.jamoa;
import net.minecraft.item.Item;

public class ItemSuperbiumIngot extends Item {

    public ItemSuperbiumIngot()
    {
        super();
        setUnlocalizedName("superbiumIngot");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);

    }

}
