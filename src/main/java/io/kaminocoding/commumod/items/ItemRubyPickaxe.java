package io.kaminocoding.commumod.items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by noah on 8/8/14.
 */
public class ItemRubyPickaxe extends ItemPickaxe {
    public ItemRubyPickaxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("rubyPickaxe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
    }
}
