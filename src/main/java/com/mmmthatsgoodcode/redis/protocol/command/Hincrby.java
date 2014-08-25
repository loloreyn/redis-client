package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Hincrby extends KeyedCommand<IntegerReply>{

	private final byte[] field;
	private final int increment;	
	
	public Hincrby(String key, byte[] field, int increment) {
		super(key);
		this.field = field;
		this.increment = increment;
	}
	
	public byte[] getField() {
		return field;
	}
	
	public int getIncrement() {
		return increment;
	}
}
