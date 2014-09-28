package io.kaminocoding.commumod.proxy;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import io.kaminocoding.commumod.client.handler.ModGuiHandler;
import io.kaminocoding.commumod.entity.EntityMiner;
import io.kaminocoding.commumod.entity.TileEntityPurifier;
import io.kaminocoding.commumod.help.Reference;
import io.kaminocoding.commumod.main;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by noah on 5/27/14.
 */
public abstract class proxyCommon{
    public void registerRenderers()
    {

    }

    public void registerSounds()
    {

    }

    public void registerEntitySpawn(){
        BiomeGenBase[] allBiomes = Iterators.toArray(Iterators.filter(Iterators.forArray(BiomeGenBase.getBiomeGenArray()), Predicates.notNull()), BiomeGenBase.class);
        System.out.println("Registering natural spawns");
        EntityRegistry.addSpawn(EntityMiner.class, 10, 3, 10, EnumCreatureType.creature, BiomeGenBase.extremeHills);
        EntityRegistry.addSpawn(EntityMiner.class, 40, 3, 10, EnumCreatureType.creature, BiomeGenBase.extremeHillsEdge);
        EntityRegistry.addSpawn(EntityMiner.class, 40, 3, 10, EnumCreatureType.creature, BiomeGenBase.extremeHillsPlus);

    }

    public static void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityPurifier.class, Reference.MODID + ":purifierTileEntity");
    }

    public void registerNetwork()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(main.instance, new ModGuiHandler());
    }

}
