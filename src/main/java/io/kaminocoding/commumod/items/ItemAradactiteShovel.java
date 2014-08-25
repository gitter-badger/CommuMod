package io.kaminocoding.commumod.items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.ItemSpade;

/**
 * Created by noah on 5/18/14.
 */
public class ItemAradactiteShovel extends ItemSpade {
    public ItemAradactiteShovel(ToolMaterial material) {
        super(material);
        setUnlocalizedName("aradactiteShovel");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
    }
}
