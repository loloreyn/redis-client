package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.BulkReply;

public class Incrbyfloat extends KeyedCommand<BulkReply>{

	private final float increment;
	
	public Incrbyfloat(String key, float increment) {
		super(key);
		this.increment = increment;
	}
	
	public float getIncrement() {
		return increment;
	}
}