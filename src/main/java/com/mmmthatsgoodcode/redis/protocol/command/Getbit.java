package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Getbit extends KeyedCommand<IntegerReply>{

	private final long offset;

	public Getbit(String key, long offset) {
		super(key);
		this.offset = offset;
	}
	
	public long getOffset() {
		return offset;
	}
}