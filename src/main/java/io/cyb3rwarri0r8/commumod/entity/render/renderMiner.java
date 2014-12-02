package io.cyb3rwarri0r8.commumod.entity.render;

import io.cyb3rwarri0r8.commumod.lib.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by noah on 5/27/14.
 */
public class renderMiner extends RenderBiped {
    private static final ResourceLocation textureLocation = new ResourceLocation(Reference.MODID + ":" + "textures/models/miner.png");

    public renderMiner(ModelBiped model, float shadowSize)
    {
        super(model, shadowSize);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        return textureLocation;
    }




}
