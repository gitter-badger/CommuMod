package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.ItemPickaxe;

public class ItemSuperbiumPick extends ItemPickaxe {

    public ItemSuperbiumPick(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("superbiumPick");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
    }
}
