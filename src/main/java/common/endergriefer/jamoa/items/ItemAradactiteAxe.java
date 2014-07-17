package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.ItemAxe;

/**
 * Created by noah on 5/18/14.
 */
public class ItemAradactiteAxe extends ItemAxe {
    public ItemAradactiteAxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("aradactiteAxe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
    }
}
