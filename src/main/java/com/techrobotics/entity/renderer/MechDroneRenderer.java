package com.techrobotics.entity.renderer;

import com.techrobotics.TechRoboticsMod;
import com.techrobotics.entity.MechDroneEntity;
import com.techrobotics.entity.model.MechDroneModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MechDroneRenderer extends GeoEntityRenderer<MechDroneEntity> {
    public MechDroneRenderer(EntityRendererManager renderManager) {
        super(renderManager, new MechDroneModel());
        this.shadowRadius = 0.7F;
    }

    @Override
    public ResourceLocation getTextureLocation(MechDroneEntity entity) {
        return new ResourceLocation(TechRoboticsMod.MOD_ID, "textures/entity/mech_drone.png");
    }
}
