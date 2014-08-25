package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Setrange extends KeyedCommand<IntegerReply>{

	private final int offset;
	private final byte[] value;
	
	public Setrange(String key, int offset, byte[] value){
		super(key);
		this.offset = offset;
		this.value = value;
	}
	
	public int getOffset() {
		return offset;
	}
	
	public byte[] getValue() {
		return value;
	}
}