package com.endergriefer.jamoa.items;

import com.endergriefer.jamoa.help.Reference;
import com.endergriefer.jamoa.jamoa;
import net.minecraft.item.ItemSpade;

/**
 * Created by noah on 5/18/14.
 */
public class ItemAradactiteShovel extends ItemSpade {
    public ItemAradactiteShovel(ToolMaterial material) {
        super(material);
        setUnlocalizedName("aradactiteShovel");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
    }
}
