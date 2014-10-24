package io.cyb3rwarri0r8.commumod.proxy;


import cpw.mods.fml.client.registry.RenderingRegistry;
import io.cyb3rwarri0r8.commumod.entity.*;
import io.cyb3rwarri0r8.commumod.items.ModItems;
import io.cyb3rwarri0r8.commumod.render.RenderAradactiteGolem;
import io.cyb3rwarri0r8.commumod.render.RenderCobaltBoat;
import io.cyb3rwarri0r8.commumod.render.RenderSuperbiumGolem;
import io.cyb3rwarri0r8.commumod.render.renderMiner;
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
        RenderingRegistry.registerEntityRenderingHandler(EntitySuperbiumGolem.class, new RenderSuperbiumGolem());
        RenderingRegistry.registerEntityRenderingHandler(EntityAradactiteGolem.class, new RenderAradactiteGolem());


    }

    @Override
    public void preinit()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityCobaltBoat.class, new RenderCobaltBoat());
    }

    @Override
    public void registerSounds()
    {

    }

}
