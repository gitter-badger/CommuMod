package io.cyb3rwarri0r8.commumod.help;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.world.World;

/**
 * Created by noah on 10/31/14.
 */
public final class ServerHelper {
    private ServerHelper() {
    }
    public static final boolean isClientWorld(World world) {
        return world.isRemote;
    }
    public static final boolean isServerWorld(World world) {
        return !world.isRemote;
    }
    public static final boolean isSinglePlayerServer() {
        return FMLCommonHandler.instance().getMinecraftServerInstance() != null;
    }
    public static final boolean isMultiPlayerServer() {
        return FMLCommonHandler.instance().getMinecraftServerInstance() == null;
    }
    /**
     * This function circumvents a miserable failing.
     */
    public static final void sendItemUsePacket(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int hitSide, float hitX, float hitY,
                                               float hitZ) {
        if (isServerWorld(world)) {
            return;
        }
        NetHandlerPlayClient netClientHandler = (NetHandlerPlayClient) FMLClientHandler.instance().getClientPlayHandler();
        netClientHandler.addToSendQueue(new C08PacketPlayerBlockPlacement(x, y, z, hitSide, player.inventory.getCurrentItem(), hitX, hitY, hitZ));
    }
}
