package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;

/**
 * Created by noah on 5/16/14.
 */
public class ItemSuperbiumDust extends net.minecraft.item.Item {
    public ItemSuperbiumDust()
    {
        super();
        setUnlocalizedName("superbiumDust");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
    }
}
