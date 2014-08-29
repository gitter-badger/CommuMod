package io.kaminocoding.commumod.items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.ItemHoe;

/**
 * Created by noah on 8/22/14.
 */
public class ItemRubyHoe extends ItemHoe
{
    public ItemRubyHoe(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("rubyHoe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);

    }
}
