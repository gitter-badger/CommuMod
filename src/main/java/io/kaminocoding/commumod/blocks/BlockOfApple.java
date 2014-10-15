package io.kaminocoding.commumod.blocks;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

/**
 * Created by noah on 10/12/14.
 */
public class BlockOfApple extends Block {
    protected BlockOfApple() {
        super(Material.leaves);
        setBlockName("appleBlock");
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }

    @Override
    public IIcon getIcon(int par1, int par2)
    {
        return super.getIcon(par1, par2);
    }

    @Override
    public Item getItemDropped(int meta, Random rand, int fortune)
    {
        return ModItems.appleBlock;
    }
}
