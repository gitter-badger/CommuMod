package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by noah on 5/18/14.
 */
public class ItemAradactitePick extends ItemPickaxe {
    public ItemAradactitePick(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("aradactitePick");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
    }
}
