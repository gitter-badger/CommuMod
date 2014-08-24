package common.endergriefer.jamoa.proxy;

import common.endergriefer.jamoa.entity.EntityAxe;
import common.endergriefer.jamoa.entity.EntityMiner;
import common.endergriefer.jamoa.items.ModItems;
import common.endergriefer.jamoa.render.renderMiner;
import cpw.mods.fml.client.registry.RenderingRegistry;
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
