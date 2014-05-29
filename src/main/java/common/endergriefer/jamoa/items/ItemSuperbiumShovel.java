package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.ItemSpade;

/**
 * Created by noah on 5/26/14.
 */
public class ItemSuperbiumShovel extends ItemSpade {
    public ItemSuperbiumShovel(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("superbiumShovel");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
    }
}
