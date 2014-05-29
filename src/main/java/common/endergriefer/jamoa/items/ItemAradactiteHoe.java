package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.ItemHoe;

/**
 * Created by noah on 5/18/14.
 */
public class ItemAradactiteHoe extends ItemHoe {
    public ItemAradactiteHoe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("aradactiteHoe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
    }
}
