package io.cyb3rwarri0r8.commumod.items;

import io.cyb3rwarri0r8.commumod.lib.Reference;
import io.cyb3rwarri0r8.commumod.main;
import net.minecraft.item.ItemHoe;

/**
 * Created by noah on 5/18/14.
 */
public class ItemAradactiteHoe extends ItemHoe {
    public ItemAradactiteHoe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("aradactiteHoe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
    }
}
