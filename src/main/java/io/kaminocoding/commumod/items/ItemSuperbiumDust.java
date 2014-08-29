package io.kaminocoding.commumod.items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.ItemRedstone;

/**
 * Created by noah on 5/16/14.
 */
public class ItemSuperbiumDust extends ItemRedstone {
    public ItemSuperbiumDust()
    {
        super();
        setUnlocalizedName("superbiumDust");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);


    }
}
