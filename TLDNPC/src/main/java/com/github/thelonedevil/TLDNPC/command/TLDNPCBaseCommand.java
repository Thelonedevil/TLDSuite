
/*
 * This file is part of the Spout plugin TLDNPC. It also has a hard 
 * dependency on the Vanilla project.
 */
package com.github.thelonedevil.TLDNPC.command;

import org.spout.api.command.CommandArguments;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.CommandDescription;
import org.spout.api.command.annotated.Permissible;
import org.spout.api.exception.CommandException;

import com.github.thelonedevil.TLDNPC.TLDNPCPlugin;

/**
 * Provides an example of a base command.
 */
public class TLDNPCBaseCommand {
	private final TLDNPCPlugin plugin;

	public TLDNPCBaseCommand(TLDNPCPlugin instance) {
		this.plugin = instance;
	}

	/**
	 * Provides an example command that can be issued to the Spout server.
	 */
	@CommandDescription(aliases = {"TLDNPC"}, desc = "This is an example of what a command might look like. Try it out with /cmd !")
	@Permissible("TLDNPC")
	public void TLDNPC(CommandSource source, CommandArguments args) throws CommandException {
		
		// Calling this command will send whoever issued it the message below.
		source.sendMessage("The TLDNPC plugin base command has been successfully issued. (Type a sub-command)");
	}
}