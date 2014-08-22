package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
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
        setCreativeTab(jamoa.jamoaTab);

    }
}
