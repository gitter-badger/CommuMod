package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.Item;

/**
 * Created by noah on 6/13/14.
 */
public class ItemRuby extends Item {

    public ItemRuby()
    {
        super();
        setUnlocalizedName("ruby");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);

    }

}
