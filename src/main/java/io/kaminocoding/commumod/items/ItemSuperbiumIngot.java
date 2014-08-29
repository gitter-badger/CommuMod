package io.kaminocoding.commumod.items;


import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.Item;

public class ItemSuperbiumIngot extends Item {

    public ItemSuperbiumIngot()
    {
        super();
        setUnlocalizedName("superbiumIngot");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);

    }

}
