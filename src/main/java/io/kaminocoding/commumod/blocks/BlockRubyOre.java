package io.kaminocoding.commumod.blocks;


import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.items.ModItems;
import io.kaminocoding.commumod.main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by noah on 8/8/14.
 */
public class BlockRubyOre extends Block {
    public BlockRubyOre(Material material){
        super(material);
        setBlockName("rubyOre");
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
        setStepSound(soundTypePiston);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe",0);


    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune){
        return ModItems.ruby;
    }
}
