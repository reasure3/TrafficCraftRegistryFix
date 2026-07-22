# Short description

An unofficial compatibility patch for the duplicate recipe-type registration crash in TrafficCraft 1.2.0+3 on NeoForge 21.1.238.

# TrafficCraft Registry Fix

> **Unofficial compatibility patch for TrafficCraft.**
> TrafficCraft was created by **MrJulsen**. This project is not affiliated with or endorsed by the original author.

## Original project and credits

All credit for TrafficCraft belongs to **MrJulsen and the TrafficCraft contributors**.

- Original TrafficCraft project: https://www.curseforge.com/minecraft/mc-mods/trafficcraft
- Original source code: https://github.com/MisterJulsen/TrafficCraft

TrafficCraft itself is required separately and is not included or redistributed by this project.

## How this project differs from TrafficCraft

TrafficCraft Registry Fix is not a replacement, fork, or content expansion for TrafficCraft. It is a small patch that fixes the following startup crash in TrafficCraft 1.2.0+3 when used with NeoForge 21.1.238:

`Adding duplicate value 'trafficcraft_damageable_recipe_type' to registry`

The patch changes only the faulty `damageable_recipe_type` registration. It allows the recipe type to be registered normally as `trafficcraft:damageable_recipe_type` and prevents the conflicting `minecraft:trafficcraft_damageable_recipe_type` registration.

No TrafficCraft assets are included, and no other registrations, content, recipes, or gameplay behavior are changed.

## Supported environment

- Minecraft 1.21.1
- NeoForge 21.1.238
- TrafficCraft 1.2.0+3
- Java 21
- Client and dedicated server

## Installation

Install this patch alongside [TrafficCraft 1.2.0+3](https://www.curseforge.com/minecraft/mc-mods/trafficcraft/files/7754967) and its required dependency, [DragonLib](https://www.curseforge.com/minecraft/mc-mods/dragonlib). Install the patch on every client and server instance that loads TrafficCraft.

## Support scope

This patch targets only the version combination listed above. TrafficCraft 1.1.3 and other TrafficCraft releases, other Minecraft or NeoForge versions, Forge, and Fabric are not supported. It does not fix general registry problems or unrelated TrafficCraft crashes, and compatibility with future releases is not guaranteed.

## License

The original TrafficCraft project is licensed under the **GNU General Public License v3.0**. This patch is also distributed under the **GNU General Public License v3.0**. See the included `LICENSE` file.
