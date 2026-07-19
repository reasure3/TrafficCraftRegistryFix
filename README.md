# TrafficCraft Registry Fix

An unofficial NeoForge compatibility patch for TrafficCraft 1.2.0+3.

TrafficCraft 1.2.0+3 registers its damageable recipe type once under the
`minecraft` namespace and then tries to register the same object through its
Architectury deferred register. NeoForge 21.1.238 rejects that duplicate value.

This mod changes only the supplier passed to the deferred registration named
`damageable_recipe_type`. The replacement creates an unregistered recipe type,
so Architectury can register it normally as `trafficcraft:damageable_recipe_type`.

## Supported environment

- Minecraft 1.21.1
- NeoForge 21.1.238
- TrafficCraft 1.2.0+3
- Java 21
- Client and dedicated server

TrafficCraft and its required DragonLib dependency are not bundled in the
produced JAR.

## Build

```text
./gradlew build
```
