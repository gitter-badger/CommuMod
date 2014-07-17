package common.endergriefer.jamoa.items;

import common.endergriefer.jamoa.entity.EntityAxe;
import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


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

    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {

        if (!world.isRemote) {
            world.spawnEntityInWorld(new EntityAxe(world, player ));
        }return itemStack;
    }

}
