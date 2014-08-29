package io.kaminocoding.commumod.blocks;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by noah on 5/25/14.
 */
public class BlockAradactiteBlock extends Block {
    public BlockAradactiteBlock(Material material)
    {
        super(Material.anvil);
        this.setBlockName("aradactiteBlock");
        this.setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        this.setCreativeTab(main.modTab);
        this.setStepSound(soundTypePiston);
        setHardness(3.5F);
        setResistance(5.5F);
        setHarvestLevel("pickaxe", 1);
    }
}
