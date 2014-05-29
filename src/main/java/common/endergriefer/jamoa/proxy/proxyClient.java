package common.endergriefer.jamoa.proxy;

import common.endergriefer.jamoa.entity.EntityMiner;
import common.endergriefer.jamoa.render.renderTest;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;

/**
 * Created by noah on 5/27/14.
 */
public class proxyClient extends proxyCommon {

    @Override
    public void registerRenderers(){
        RenderingRegistry.registerEntityRenderingHandler(EntityMiner.class, new renderTest(new ModelBiped(), 0.5F));
    }

}
