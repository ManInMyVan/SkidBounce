/*
 * LiquidBounce Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/CCBlueX/LiquidBounce/
 */
package net.ccbluex.liquidbounce.features.module.modules.movement.speedmodes.aac

import net.ccbluex.liquidbounce.features.module.modules.movement.speedmodes.SpeedMode
import net.ccbluex.liquidbounce.utils.MovementUtils.isMoving

object AACHop350 : SpeedMode("AACHop3.5.0") {

    override fun onMotion() {
        val thePlayer = mc.thePlayer ?: return

        if (isMoving && !thePlayer.isInWater && !thePlayer.isInLava && !thePlayer.isSneaking) {
            thePlayer.jumpMovementFactor += 0.00208f
            if (thePlayer.fallDistance <= 1f) {
                if (thePlayer.onGround) {
                    thePlayer.jump()
                    thePlayer.motionX *= 1.0118f
                    thePlayer.motionZ *= 1.0118f
                } else {
                    thePlayer.motionY -= 0.0147f
                    thePlayer.motionX *= 1.00138f
                    thePlayer.motionZ *= 1.00138f
                }
            }
        }
    }

    override fun onEnable() {
        val thePlayer = mc.thePlayer ?: return

        if (thePlayer.onGround) {
            thePlayer.motionX = 0.0
            thePlayer.motionZ = 0.0
        }
    }

    override fun onDisable() {
        mc.thePlayer?.jumpMovementFactor = 0.02f
    }
}