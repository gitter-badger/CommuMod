package io.cyb3rwarri0r8.commumod.fluids;

import net.minecraftforge.fluids.Fluid;

/**
 * Created by noah on 10/29/14.
 */
public class FluidRetaw extends Fluid {
    public FluidRetaw(String string) {
        super(string);
        setUnlocalizedName(string);
        setDensity(500);
        setViscosity(500);

    }
}
