package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class PexpireAt extends KeyedCommand<IntegerReply>{

	private final long millisecondsTimestamp;
	
	public PexpireAt(String key, long millisecondsTimestamp) {
		super(key);
		this.millisecondsTimestamp = millisecondsTimestamp;
	}

	public long getMillisecondsTimestamp() {
		return millisecondsTimestamp;
	}
}