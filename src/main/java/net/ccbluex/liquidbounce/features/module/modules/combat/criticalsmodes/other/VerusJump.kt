package net.ccbluex.liquidbounce.features.module.modules.combat.criticalsmodes.other

import net.ccbluex.liquidbounce.features.module.modules.combat.criticalsmodes.CriticalsMode
import net.minecraft.entity.Entity

object VerusJump : CriticalsMode("VerusJump") {
    override fun onAttack(entity: Entity) {
        mc.thePlayer.motionY = 0.11
        mc.thePlayer.onGround = false
        mc.thePlayer.posY = mc.thePlayer.prevPosY
        mc.thePlayer.isInWeb = true
        mc.thePlayer.jump()
        mc.thePlayer.prevPosY = mc.thePlayer.posY
        mc.thePlayer.isInWeb = false
    }
}
