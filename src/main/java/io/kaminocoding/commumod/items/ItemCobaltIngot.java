package io.kaminocoding.commumod.items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.Item;

/**
 * Created by noah on 9/28/14.
 */
public class ItemCobaltIngot extends Item {
    public ItemCobaltIngot()
    {
        super();
        setUnlocalizedName("cobaltIngot");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
    }
}
