package common.endergriefer.jamoa.items;


import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.Item;

public class ItemSuperbiumIngot extends Item {

    public ItemSuperbiumIngot()
    {
        super();
        setUnlocalizedName("superbiumIngot");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);

    }

}
