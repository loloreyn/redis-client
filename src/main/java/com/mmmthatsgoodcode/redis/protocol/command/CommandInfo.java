package com.mmmthatsgoodcode.redis.protocol.command;

import java.util.Arrays;
import java.util.List;

import com.mmmthatsgoodcode.redis.protocol.model.AbstractCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.MultiBulkReply;

public class CommandInfo extends AbstractCommand<MultiBulkReply>{

	private final List<String> commands;
	
	public CommandInfo(String commandName){
		this(Arrays.asList(commandName));
	}
	
	public CommandInfo(List<String> commandNames){
		this.commands = commandNames;
	}
	
	public List<String> getCommands() {
		return commands;
	}
}