package io.cyb3rwarri0r8.commumod.fluids;

import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by noah on 10/27/14.
 */
public class FluidPureWater extends Fluid {
    public FluidPureWater(String fluidName) {
        super(fluidName);
        setUnlocalizedName(fluidName);
        setDensity(100);
        setTemperature(250);
        setViscosity(100);


    }
    public IIcon getStillIcon()
    {
        return this.block.getIcon(0,0);
    }

    public IIcon getFlowingIcon()
    {
        return this.block.getIcon(1,0);
    }
}
