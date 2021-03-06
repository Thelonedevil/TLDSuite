/*
 * This file is part of the Spout plugin TLDNPC. It also has a hard 
 * dependency on the Vanilla project.
 */
package com.github.thelonedevil.TLDNPC.command;

import org.spout.api.command.CommandArguments;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.CommandDescription;
import org.spout.api.command.annotated.Permissible;
import org.spout.api.entity.Player;
import org.spout.api.exception.CommandException;

import com.github.thelonedevil.TLDNPC.TLDNPCPlugin;
import com.github.thelonedevil.TLDNPC.mobs.Mob;

/**
 * Provides an example of a class to hold commands.
 */
public class TLDNPCCommands {
	private final TLDNPCPlugin plugin;

	public TLDNPCCommands(TLDNPCPlugin instance) {
		this.plugin = instance;
	}

	/**
	 * Provides an example command that can be issued to the Spout server.
	 */
	@CommandDescription(aliases = {"spawn", "spn"}, desc = "This is an example of what a command might look like. Try it out with /cmd !")
	@Permissible("TLDNPC.spawn")
	public void Spawn(CommandSource source, CommandArguments args) throws CommandException {
		
		// Calling this command will send whoever issued it the message below.
		source.sendMessage("The TLDNPC plugin command has been successfully issued.");
		Player player = (Player) source;
		Mob mob = new Mob();
		boolean success = mob.spawnNpc(player,"","Steve","Hello i am an NPC");
		if(success){
			source.sendMessage("NPC Spawned");
		} else{
			source.sendMessage("NPC Not Spawned");
		}
	}
}
