package common.endergriefer.jamoa.blocks;

import common.endergriefer.jamoa.help.Reference;
import common.endergriefer.jamoa.jamoa;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

/**
 * Created by noah on 8/22/14.
 */
public class BlockRuby extends Block
{
    public BlockRuby(Material material)
    {
        super(material);
        setBlockName("rubyBlock");
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(jamoa.jamoaTab);
        setStepSound(soundTypePiston);
        setHardness(3.0F);
        setResistance(15F);
        setHarvestLevel("pickaxe",1);
    }

    //Render block as icon
    @Override
    public IIcon getIcon(int par1, int par2)
    {
        return super.getIcon(par1, par2);
    }
}
