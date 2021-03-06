package com.github.thelonedevil.TLDWelcomer;

import org.spout.api.entity.Player;
import org.spout.api.event.EventHandler;
import org.spout.api.event.Listener;
import org.spout.api.event.player.PlayerJoinEvent;

import com.github.thelonedevil.TLDCommonlib.Lib;

/**
 * A Basic Event Listener for Spout
 */
public class EListener implements Listener {
	private TLDWelcomer plugin;

	public EListener(TLDWelcomer instance) {
		this.plugin = instance;
	}

	static String name;

	private Lib lib = new Lib();

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		name = player.getName();
		if (lib.logins.get(name) == null) {
			plugin.getLogger().info(lib.error);
		} else if (lib.logins.get(name) == 1) {
			player.sendMessage("Welcome, " + name + ".");
			player.sendMessage(lib.firstlogin);
		} else if (lib.logins.get(name) == 2) {
			player.sendMessage("Welcome back, " + name + ".");
			player.sendMessage("You have played once before.");
			player.sendMessage(lib.otherlogin);
		} else if (lib.logins.get(name) > 2) {
			int plays = lib.logins.get(name) - 1;
			player.sendMessage("Welcome back, " + name + ".");
			player.sendMessage("You have played " + plays + " times before.");
			player.sendMessage(lib.otherlogin);
		}
	}
}
