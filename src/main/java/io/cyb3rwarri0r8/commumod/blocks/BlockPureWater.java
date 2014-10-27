package io.cyb3rwarri0r8.commumod.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by noah on 10/27/14.
 */
public class BlockPureWater extends BlockFluidClassic {
    public BlockPureWater(Fluid fluid, Material material) {
        super(fluid, material);
        setBlockName("pureWater");
        
    }
}
