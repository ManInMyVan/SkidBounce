/*
 * SkidBounce Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge, Forked from LiquidBounce.
 * https://github.com/ManInMyVan/SkidBounce/
 */
package net.ccbluex.liquidbounce.features.module.modules.render

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory.RENDER
import net.ccbluex.liquidbounce.value.BooleanValue
import net.ccbluex.liquidbounce.value.FloatValue

object ItemPhysics : Module("ItemPhysics", RENDER) {
    val realistic by BooleanValue("Realistic", false)
    val weight by FloatValue("Weight", 0.5F, 0.1F..3F)
    val rotationSpeed by FloatValue("RotationSpeed", 1.0F, 0.01F..3F)
}
