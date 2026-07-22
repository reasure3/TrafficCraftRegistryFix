# TrafficCraft Registry Fix

An unofficial NeoForge compatibility patch for TrafficCraft 1.2.0+3.

TrafficCraft was created by MrJulsen and the TrafficCraft contributors. All
credit for the original mod belongs to them:

- CurseForge: https://www.curseforge.com/minecraft/mc-mods/trafficcraft
- Source: https://github.com/MisterJulsen/TrafficCraft

This project is not affiliated with or endorsed by the original author. It
requires TrafficCraft separately and does not redistribute TrafficCraft or its
assets.

TrafficCraft 1.2.0+3 registers its damageable recipe type once under the
`minecraft` namespace and then tries to register the same object through its
Architectury deferred register. NeoForge 21.1.238 rejects that duplicate value.

This mod changes only the supplier passed to the deferred registration named
`damageable_recipe_type`. The replacement creates an unregistered recipe type,
so Architectury can register it normally as `trafficcraft:damageable_recipe_type`.

## Supported environment

- Minecraft 1.21.1
- NeoForge 21.1.237 or newer, below 21.1.300
- TrafficCraft 1.2.0+3
- Java 21
- Client and dedicated server

TrafficCraft and its required DragonLib dependency are not bundled in the
produced JAR.

## License

TrafficCraft Registry Fix is distributed under the GNU General Public License
v3.0, matching the original TrafficCraft project's license. See `LICENSE`.

## Build

```text
./gradlew build
```
