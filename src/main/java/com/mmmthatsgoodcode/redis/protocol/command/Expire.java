package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Expire extends KeyedCommand<IntegerReply>{

	private final long seconds;
	
	public Expire(String key, long seconds) {
		super(key);
		this.seconds = seconds;
	}

	public long getSeconds() {
		return seconds;
	}
}