package io.kaminocoding.commumod.blocks;

import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

/**
 * Created by noah on 9/8/14.
 */
public class BlockCobaltOre extends Block
{
    public BlockCobaltOre(Material material)
    {
        super(material);
        setBlockName("cobaltOre");
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
        setStepSound(soundTypePiston);
        setHardness(2.5F);
        setResistance(5.5F);
        setHarvestLevel("pickaxe",1);
    }

    @Override
    public IIcon getIcon(int par1, int par2)
    {
        return super.getIcon(par1, par2);
    }

}
