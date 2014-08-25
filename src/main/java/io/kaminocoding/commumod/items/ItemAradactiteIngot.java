package io.kaminocoding.commumod.items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.Item;

/**
 * Created by noah on 5/18/14.
 */
public class ItemAradactiteIngot extends Item {
    public ItemAradactiteIngot()
    {
        super();
        setUnlocalizedName("aradactiteIngot");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
    }
}
