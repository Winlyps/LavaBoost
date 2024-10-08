package winlyps.lavaBoost

import org.bukkit.plugin.java.JavaPlugin

class LavaBoost : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(LavaBoostListener(this), this)
        logger.info("LavaBoost plugin enabled.")
    }

    override fun onDisable() {
        logger.info("LavaBoost plugin disabled.")
    }
}