package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Expireat extends KeyedCommand<IntegerReply>{

	private final long timestamp;
	
	public Expireat(String key, long timestamp) {
		super(key);
		this.timestamp = timestamp;
	}

	public long getTimestamp() {
		return timestamp;
	}
}