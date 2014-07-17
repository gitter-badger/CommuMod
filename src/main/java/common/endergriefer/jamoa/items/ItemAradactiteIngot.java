package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.Item;

/**
 * Created by noah on 5/18/14.
 */
public class ItemAradactiteIngot extends Item {
    public ItemAradactiteIngot()
    {
        super();
        setUnlocalizedName("aradactiteIngot");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
    }
}
