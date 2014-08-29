package io.kaminocoding.commumod.proxy;


import cpw.mods.fml.client.registry.RenderingRegistry;
import io.kaminocoding.commumod.entity.EntityAxe;
import io.kaminocoding.commumod.entity.EntityMiner;
import io.kaminocoding.commumod.items.ModItems;
import io.kaminocoding.commumod.render.renderMiner;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderSnowball;

/**
 * Created by noah on 5/27/14.
 */
public class proxyClient extends proxyCommon {

    @Override
    public void registerRenderers(){
        RenderingRegistry.registerEntityRenderingHandler(EntityMiner.class, new renderMiner(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAxe.class, new RenderSnowball(ModItems.superbiumAxe));
    }

    @Override
    public void registerSounds()
    {

    }

}
