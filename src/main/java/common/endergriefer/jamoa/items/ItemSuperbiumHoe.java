package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.ItemHoe;

/**
 * Created by noah on 5/27/14.
 */
public class ItemSuperbiumHoe extends ItemHoe {
    public ItemSuperbiumHoe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("superbiumHoe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
    }
}
