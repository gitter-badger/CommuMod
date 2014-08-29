package io.kaminocoding.commumod.items;


import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by noah on 8/22/14.
 */
public class ItemRubyAxe extends ItemAxe
{
    public ItemRubyAxe(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("rubyAxe");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);

    }

    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
        if (!world.isRemote)
        {
            world.createExplosion(entityPlayer,1.0D,1.0D,1.0D,1.0F,true);

        }
        return itemStack;
    }
}
