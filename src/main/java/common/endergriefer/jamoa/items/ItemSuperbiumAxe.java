package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.ItemAxe;


/**
 * Created by noah on 5/13/14.
 */
public class ItemSuperbiumAxe extends ItemAxe {

    public ItemSuperbiumAxe(ToolMaterial material)
    {

        super(material);
        setUnlocalizedName("superbiumAxe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);

    }

}
