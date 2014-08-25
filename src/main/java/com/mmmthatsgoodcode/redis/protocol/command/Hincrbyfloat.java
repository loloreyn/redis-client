package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.BulkReply;

public class Hincrbyfloat extends KeyedCommand<BulkReply>{

	private final byte[] field;
	private final float increment;
	
	public Hincrbyfloat(String key, byte[] field, float increment) {
		super(key);
		this.field = field;
		this.increment = increment;
	}

	public byte[] getField() {
		return field;
	}
	
	public float getIncrement() {
		return increment;
	}
}
