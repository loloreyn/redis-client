package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.StatusReply;

public class Lset extends KeyedCommand<StatusReply>{

	private final int index;
	private final byte[] value;
	
	public Lset(String key, int index, byte[] value) {
		super(key);
		this.index = index;
		this.value = value;
	}

	public int getIndex() {
		return index;
	}
	
	public byte[] getValue() {
		return value;
	}
}
