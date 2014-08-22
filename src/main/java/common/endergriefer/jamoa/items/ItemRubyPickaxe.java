package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by noah on 8/8/14.
 */
public class ItemRubyPickaxe extends ItemPickaxe {
    public ItemRubyPickaxe(ToolMaterial material) {
        super(material);
        setUnlocalizedName("rubyPickaxe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
    }
}
