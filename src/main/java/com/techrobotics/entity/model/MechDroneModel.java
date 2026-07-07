package com.techrobotics.entity.model;

import com.techrobotics.TechRoboticsMod;
import com.techrobotics.entity.MechDroneEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MechDroneModel extends AnimatedGeoModel<MechDroneEntity> {
    @Override
    public ResourceLocation getModelLocation(MechDroneEntity object) {
        return new ResourceLocation(TechRoboticsMod.MOD_ID, "geo/mech_drone.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MechDroneEntity object) {
        return new ResourceLocation(TechRoboticsMod.MOD_ID, "textures/entity/mech_drone.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MechDroneEntity animatable) {
        return new ResourceLocation(TechRoboticsMod.MOD_ID, "animations/mech_drone.animation.json");
    }
}
