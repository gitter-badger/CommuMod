package io.kaminocoding.commumod.items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
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
