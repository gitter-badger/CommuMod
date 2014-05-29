package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.ItemSword;

/**
 * Created by noah on 5/14/14.
 */
public class ItemSuperbiumSword extends ItemSword {

    public ItemSuperbiumSword(ToolMaterial material)
    {

        super(material);
        setUnlocalizedName("superbiumSword");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);

    }
}
