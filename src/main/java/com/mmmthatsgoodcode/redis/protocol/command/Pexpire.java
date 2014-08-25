package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Pexpire extends KeyedCommand<IntegerReply>{

	private final long milliseconds;
	
	public Pexpire(String key, long milliseconds) {
		super(key);
		this.milliseconds = milliseconds;
	}

	public long getMilliseconds() {
		return milliseconds;
	}
}