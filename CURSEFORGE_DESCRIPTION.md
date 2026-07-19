# Short description

TrafficCraft 1.2.0+3의 NeoForge 21.1.238 recipe type 중복 등록 충돌만 수정하는 작은 비공식 호환성 패치입니다.

> A small unofficial compatibility patch for the duplicate recipe-type registration crash in TrafficCraft 1.2.0+3 on NeoForge 21.1.238.

# 한국어 설명

## TrafficCraft Registry Fix

TrafficCraft 1.2.0+3이 NeoForge 21.1.238에서 시작 중 다음 오류로 로드되지 않는 문제를 수정하는 비공식 호환성 패치입니다.

`Adding duplicate value 'trafficcraft_damageable_recipe_type' to registry`

이 패치는 문제가 있는 `damageable_recipe_type` 등록만 수정합니다. 정상 키인 `trafficcraft:damageable_recipe_type`은 유지하면서, 잘못된 `minecraft:trafficcraft_damageable_recipe_type` 등록을 방지합니다. 다른 TrafficCraft 등록, 콘텐츠 또는 게임플레이는 변경하지 않습니다.

### 지원 환경

- Minecraft 1.21.1
- NeoForge 21.1.238
- TrafficCraft 1.2.0+3
- Java 21
- 클라이언트 및 dedicated server

### 설치

TrafficCraft Registry Fix, [TrafficCraft 1.2.0+3](https://www.curseforge.com/minecraft/mc-mods/trafficcraft/files/7754967), 그리고 TrafficCraft가 요구하는 [DragonLib](https://www.curseforge.com/minecraft/mc-mods/dragonlib)을 `mods` 폴더에 설치하세요. CurseForge 프로젝트 관계에서도 TrafficCraft와 DragonLib을 Required Dependency로 지정하세요. TrafficCraft를 로드하는 클라이언트와 서버 각각에 이 패치를 설치해야 합니다.

### 지원 범위

이 패치는 위 버전 조합만을 대상으로 합니다. TrafficCraft 1.1.3을 포함한 다른 TrafficCraft 버전, 다른 Minecraft 또는 NeoForge 버전, Forge와 Fabric은 지원하지 않습니다. 일반적인 Registry 오류나 TrafficCraft와 무관한 충돌을 해결하지 않으며, 향후 버전과의 호환성을 보장하지 않습니다.

TrafficCraft와 DragonLib은 이 파일에 포함되지 않습니다. 이 프로젝트는 TrafficCraft의 비공식 호환성 패치입니다.

# English description

## TrafficCraft Registry Fix

An unofficial compatibility patch for a startup crash affecting TrafficCraft 1.2.0+3 on NeoForge 21.1.238:

`Adding duplicate value 'trafficcraft_damageable_recipe_type' to registry`

The patch changes only the faulty `damageable_recipe_type` registration. It preserves the intended `trafficcraft:damageable_recipe_type` entry while preventing the incorrect `minecraft:trafficcraft_damageable_recipe_type` entry. No other TrafficCraft registrations, content, or gameplay behavior are changed.

### Supported environment

- Minecraft 1.21.1
- NeoForge 21.1.238
- TrafficCraft 1.2.0+3
- Java 21
- Client and dedicated server

### Installation

Install TrafficCraft Registry Fix alongside [TrafficCraft 1.2.0+3](https://www.curseforge.com/minecraft/mc-mods/trafficcraft/files/7754967) and the required [DragonLib](https://www.curseforge.com/minecraft/mc-mods/dragonlib) version in the `mods` folder. Mark TrafficCraft and DragonLib as Required Dependencies in the CurseForge project relations. Install the patch on every client and server instance that loads TrafficCraft.

### Support scope

This patch targets only the version combination listed above. TrafficCraft 1.1.3 and other TrafficCraft releases, other Minecraft or NeoForge versions, Forge, and Fabric are not supported. It does not fix general registry problems or unrelated TrafficCraft crashes, and compatibility with future releases is not guaranteed.

TrafficCraft and DragonLib are not bundled with this file. This is an unofficial compatibility patch for TrafficCraft.
