package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemSuperbiumPick extends ItemPickaxe {

    public ItemSuperbiumPick(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("superbiumPick");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);

    }

    @Override
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {

    }
}
