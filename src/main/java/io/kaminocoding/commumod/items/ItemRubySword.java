package io.kaminocoding.commumod.items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.item.ItemSword;

/**
 * Created by noah on 8/22/14.
 */
public class ItemRubySword extends ItemSword
{
    public ItemRubySword(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("rubySword");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);

    }
}
