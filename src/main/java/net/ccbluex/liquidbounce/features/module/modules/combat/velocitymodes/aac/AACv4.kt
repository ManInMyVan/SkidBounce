package net.ccbluex.liquidbounce.features.module.modules.combat.velocitymodes.aac

import net.ccbluex.liquidbounce.features.module.modules.combat.Velocity.aacv4MotionReducer
import net.ccbluex.liquidbounce.features.module.modules.combat.velocitymodes.VelocityMode

object AACv4 : VelocityMode("AACv4") {
    override fun onUpdate() {
        if (mc.thePlayer.hurtTime > 0 && !mc.thePlayer.onGround && !mc.thePlayer.isInWater && !mc.thePlayer.isInLava && !mc.thePlayer.isInWeb) {
            mc.thePlayer.motionX *= aacv4MotionReducer
            mc.thePlayer.motionZ *= aacv4MotionReducer
        }
    }
}