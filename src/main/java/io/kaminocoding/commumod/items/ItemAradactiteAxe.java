package io.kaminocoding.commumod.items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.ItemAxe;

/**
 * Created by noah on 5/18/14.
 */
public class ItemAradactiteAxe extends ItemAxe {
    public ItemAradactiteAxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("aradactiteAxe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
    }
}
