package io.cyb3rwarri0r8.commumod.items;

import io.cyb3rwarri0r8.commumod.help.Reference;
import io.cyb3rwarri0r8.commumod.main;
import net.minecraft.item.ItemSpade;

/**
 * Created by noah on 5/26/14.
 */
public class ItemSuperbiumShovel extends ItemSpade {
    public ItemSuperbiumShovel(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("superbiumShovel");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
    }
}
