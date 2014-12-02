package io.cyb3rwarri0r8.commumod.items;

import io.cyb3rwarri0r8.commumod.lib.Reference;
import io.cyb3rwarri0r8.commumod.main;
import net.minecraft.item.Item;

/**
 * Created by noah on 9/28/14.
 */
public class ItemCobaltIngot extends Item {
    //TODO Add a texture for the cobalt ingot
    public ItemCobaltIngot()
    {
        super();
        setUnlocalizedName("cobaltIngot");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
    }
}
