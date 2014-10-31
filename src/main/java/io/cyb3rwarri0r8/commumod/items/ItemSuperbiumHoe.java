package io.cyb3rwarri0r8.commumod.items;

import io.cyb3rwarri0r8.commumod.help.Reference;
import io.cyb3rwarri0r8.commumod.main;
import net.minecraft.item.ItemHoe;

/**
 * Created by noah on 5/27/14.
 */
public class ItemSuperbiumHoe extends ItemHoe {
    public ItemSuperbiumHoe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("superbiumHoe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
    }
}
