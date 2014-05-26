package com.endergriefer.jamoa.blocks;

import com.endergriefer.jamoa.help.Reference;
import com.endergriefer.jamoa.jamoa;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

/**
 * Created by noah on 5/16/14.
 */
public class BlockSuperbiumBlock extends Block {
    public BlockSuperbiumBlock(Material material) {
        super(Material.rock);
        this.setBlockName("superbiumBlock");
        this.setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        this.setCreativeTab(jamoa.jamoaTab);
        this.setStepSound(soundTypeMetal);
        setHardness(4.0F);
        setResistance(80F);
        setHarvestLevel("pickaxe", 1);
    }
    // Render block as icon on drop from being destroyed
    @Override
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        return super.getIcon(p_149691_1_, p_149691_2_);
    }
}
