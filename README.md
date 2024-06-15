# SkidBounce
A free hacked-client for Minecraft 1.8.9 Forge.

Discord: https://discord.gg/hdbzjQdewu

## Installation

1. Install [Forge](https://maven.minecraftforge.net/net/minecraftforge/forge/1.8.9-11.15.1.2318-1.8.9/forge-1.8.9-11.15.1.2318-1.8.9-installer.jar) for 1.8.9
2. Download the client
   1. For the latest release, download the jar from the [latest GitHub release](https://github.com/ManInMyVan/SkidBounce/releases/latest)
   2. For the latest build/commit, download [this](https://nightly.link/ManInMyVan/SkidBounce/workflows/build/main/skidbounce.zip) and unzip
3. Put the client jar (`skidbounce-vX.X.X.jar`) into your mods folder
   1. the mods folder should be located at `.minecraft/mods`
   2. If it does not exist, launch forge, or make it yourself
4. Launch Forge, if the main menu has changed, installation is complete

## Completion

skidding:
* [LiquidBounce](https://github.com/CCBlueX/LiquidBounce/tree/legacy)
* [FDPClient](https://github.com/SkidderMC/FDPClient)
* [NightX](https://github.com/Aspw-w/NightX-Client)
* [CrossSine](https://github.com/shxp3/CrossSine)
* [LiquidBouncePlus-Reborn](https://github.com/liquidbounceplusreborn/LiquidbouncePlus-Reborn)

As Of Latest Commit:\
:green_circle: 100%\
:yellow_circle: 50% - 99%\
:orange_circle: 1% - 49%\
:red_circle: 0%
|      Thing       |   Completion    |
|:----------------:|:---------------:|
|      Total       | :orange_circle: |
|      NoWeb       | :green_circle:  |
|      NoFall      | :green_circle:  |
|      Spider      | :green_circle:  |
|    Criticals     | :yellow_circle: |
|      NoSlow      | :yellow_circle: |
|      Speed       | :orange_circle: |
|       Fly        | :orange_circle: |
|     Disabler     | :orange_circle: |
|     Velocity     | :orange_circle: |
|       Hud        |  :red_circle:   |
|    Animations    |  :red_circle:   |
|     LongJump     |  :red_circle:   |
|      Jesus       |  :red_circle:   |
|      Phase       |  :red_circle:   |
|     ClickGUI     |  :red_circle:   |
|    AutoBlock     |  :red_circle:   |
|     Modules      |  :red_circle:   |
|     Scaffold     |  :red_circle:   |
|      Tower       |  :red_circle:   |
|       Step       |  :red_circle:   |
|     AntiVoid     |  :red_circle:   |
|    FastClimb     |  :red_circle:   |
| InventoryManager |  :red_circle:   |
|     FastUse      |  :red_circle:   |
| Everything Else  |  :red_circle:   |

## Issues
If you notice any bugs or missing features, you can let us know by opening an issue [here](https://github.com/ManInMyVan/SkidBounce/issues).

## Contributing

We appreciate contributions. So if you want to support us, feel free to make changes to SkidBounce's source code and submit a pull request. Currently, our main goals are the following:
- Performance
- Bypasses
- Visuals
- Merging LiquidBounce commits

### Setting up a Workspace

SkidBounce uses Gradle, so make sure that it is installed properly. Instructions can be found on [Gradle's website](https://gradle.org/install/).
1. Clone the repository using `git clone https://github.com/ManInMyVan/SkidBounce/`. 
2. CD into the local repository folder.
3. Depending on which IDE you are using execute either of the following commands:
    - For IntelliJ: `gradlew setupDevWorkspace idea genIntellijRuns build`
    - For Eclipse: `gradlew setupDevWorkspace eclipse build`
4. Open the folder as a Gradle project in your IDE.
5. Select either the Forge or Vanilla run configuration.

## License
This project is distributed under the `GPl 3.0-or-later` license. Check the `LICENSE` file for more information.
