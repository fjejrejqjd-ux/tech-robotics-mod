package com.techrobotics.init;

import com.techrobotics.TechRoboticsMod;
import com.techrobotics.entity.MechDroneEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = TechRoboticsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, TechRoboticsMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechRoboticsMod.MOD_ID);

    public static final RegistryObject<EntityType<MechDroneEntity>> MECH_DRONE = ENTITIES.register("mech_drone",
            () -> EntityType.Builder.of(MechDroneEntity::new, EntityClassification.MONSTER)
                    .sized(1.2F, 2.0F)
                    .build(new ResourceLocation(TechRoboticsMod.MOD_ID, "mech_drone").toString()));

    public static final RegistryObject<Item> MECH_DRONE_SPAWN_EGG = ITEMS.register("mech_drone_spawn_egg",
            () -> new SpawnEggItem(MECH_DRONE.get(), 0x3A3A3A, 0x00DDFF,
                    new Item.Properties().tab(ItemGroup.TAB_MISC)));

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(MECH_DRONE.get(), MechDroneEntity.createAttributes().build());
    }
}
