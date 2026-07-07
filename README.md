# Tech Robotics Mod

**Minecraft Forge 1.16.5** technology mod featuring a custom **Mech Drone** hostile mob with advanced GeckoLib animations.

## Features

- **Mech Drone** - A hostile mechanical robot that hunts players
  - 40 HP, 8 attack damage, 6 armor
  - Complex multi-bone animations (idle, walk, attack)
  - Articulated arms with forearms, shoulder pads, antennae
  - Glowing energy core that pulses during attacks
  - Custom pixel-art texture with dark metal and cyan energy

## Dependencies

- Minecraft 1.16.5
- Forge 36.2.39+
- [GeckoLib 3.0.57](https://geckolib.com/) (for advanced entity animations)

## Building

```bash
# Clone the repo
git clone https://github.com/fjejrejqjd-ux/tech-robotics-mod.git
cd tech-robotics-mod

# Generate wrapper (if not present)
gradle wrapper --gradle-version 7.3

# Build the mod
./gradlew build
```

The built JAR will be in `build/libs/techrobotics-1.0.0.jar`

## Texture

Place the mob texture (64x64 or 128x128 PNG) at:
```
src/main/resources/assets/techrobotics/textures/entity/mech_drone.png
```

## Installation

1. Install Forge 1.16.5
2. Install GeckoLib 3 for 1.16.5
3. Drop the JAR into your `mods/` folder
4. Spawn the Mech Drone with `/summon techrobotics:mech_drone` or use the spawn egg

## License

MIT
