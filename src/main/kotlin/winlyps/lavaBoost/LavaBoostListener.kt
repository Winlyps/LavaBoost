package winlyps.lavaBoost

import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class LavaBoostListener(private val plugin: LavaBoost) : Listener {

    @EventHandler
    fun onPlayerMove(event: PlayerMoveEvent) {
        val player: Player = event.player

        // Check if the player is in lava
        if (player.location.block.type == Material.LAVA) {
            // Apply fire resistance effect for 15 seconds (300 ticks)
            player.addPotionEffect(PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300, 0))
        }
    }
}