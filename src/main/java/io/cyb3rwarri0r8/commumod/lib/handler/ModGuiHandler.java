package io.cyb3rwarri0r8.commumod.lib.handler;

import cpw.mods.fml.common.network.IGuiHandler;

import io.cyb3rwarri0r8.commumod.client.container.ContainerPurifier;
import io.cyb3rwarri0r8.commumod.client.gui.GuiPurifier;
import io.cyb3rwarri0r8.commumod.entity.TileEntityPurifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by noah on 9/23/14.
 */
public class ModGuiHandler implements IGuiHandler{

    public ModGuiHandler()
    {

    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == 0)
        {
            TileEntityPurifier tileEntity = (TileEntityPurifier) world.getTileEntity(x, y, z);
            return new ContainerPurifier(player.inventory, tileEntity);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == 0)
        {
            TileEntityPurifier tileEntity = (TileEntityPurifier) world.getTileEntity(x, y, z);
            return new GuiPurifier(player.inventory, tileEntity);
        }
        return null;
    }
}
