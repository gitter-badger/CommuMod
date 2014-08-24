package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
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
        setCreativeTab(jamoa.jamoaTab);

    }
}
