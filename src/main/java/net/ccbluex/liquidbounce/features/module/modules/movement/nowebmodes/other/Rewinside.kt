/*
 * LiquidBounce Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/CCBlueX/LiquidBounce/
 */
package net.ccbluex.liquidbounce.features.module.modules.movement.nowebmodes.other

import net.ccbluex.liquidbounce.features.module.modules.movement.nowebmodes.NoWebMode

object Rewinside : NoWebMode("Rewinside") {
    override fun onUpdate() {
        if (!mc.thePlayer.isInWeb) {
            return
        }
        mc.thePlayer.jumpMovementFactor = 0.42f

        if (mc.thePlayer.onGround)
            mc.thePlayer.jump()
    }
}
