package common.endergriefer.jamoa.blocks;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.items.ModItems;
import common.endergriefer.jamoa.jamoa;
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
        setCreativeTab(jamoa.jamoaTab);
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
