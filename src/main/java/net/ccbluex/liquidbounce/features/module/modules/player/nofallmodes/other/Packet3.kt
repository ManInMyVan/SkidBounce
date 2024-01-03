package net.ccbluex.liquidbounce.features.module.modules.player.nofallmodes.other

import net.ccbluex.liquidbounce.event.PacketEvent
import net.ccbluex.liquidbounce.features.module.modules.player.nofallmodes.NoFallMode
import net.minecraft.network.play.client.C03PacketPlayer

object Packet3 : NoFallMode("Packet3") {
    private var packet1Count = 0
    private var packetModify = false
    override fun onEnable() {
        packet1Count = 0
        packetModify = false
    }

    override fun onUpdate() {
        if (mc.thePlayer.fallDistance.toInt() / 2 > packet1Count) {
            packet1Count = mc.thePlayer.fallDistance.toInt() / 2
            packetModify = true
        }
        if (mc.thePlayer.onGround) {
            packet1Count = 0
        }
    }

    override fun onPacket(event: PacketEvent) {
        if (event.packet is C03PacketPlayer && packetModify) {
            event.packet.onGround = true
            packetModify = false
        }
    }
}