package io.kaminocoding.commumod.items;


import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.Item;

/**
 * Created by noah on 6/13/14.
 */
public class ItemRuby extends Item {

    public ItemRuby()
    {
        super();
        setUnlocalizedName("ruby");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);

    }

}
