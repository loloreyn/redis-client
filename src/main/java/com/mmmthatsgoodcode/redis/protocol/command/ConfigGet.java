package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.AbstractCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.MultiBulkReply;

public class ConfigGet extends AbstractCommand<MultiBulkReply>{

	private final String pattern;
	
	public ConfigGet(String pattern){
		this.pattern = pattern;
	}
	
	public String getPattern() {
		return pattern;
	}
}