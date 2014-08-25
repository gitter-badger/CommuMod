package io.kaminocoding.commumod.items;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
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
        setCreativeTab(main.modTab);

    }

    @Override
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {

    }
}
