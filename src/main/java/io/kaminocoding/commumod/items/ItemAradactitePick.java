package io.kaminocoding.commumod.items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by noah on 5/18/14.
 */
public class ItemAradactitePick extends ItemPickaxe {
    public ItemAradactitePick(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("aradactitePick");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
    }
}
