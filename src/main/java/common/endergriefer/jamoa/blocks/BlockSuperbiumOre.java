package common.endergriefer.jamoa.blocks;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.items.ModItems;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;


public class BlockSuperbiumOre extends Block {

    public BlockSuperbiumOre()
    {
        super(Material.rock);
        this.setBlockName("superbiumOre");
        this.setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        this.setCreativeTab(jamoa.jamoaTab);
        this.setStepSound(soundTypePiston);
        setHardness(4.0F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 0);
        setLightLevel(3.0F);

    }
    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune)
    {
       return ModItems.superbiumDust;
    }
}
