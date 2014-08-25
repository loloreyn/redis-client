package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Bitcount extends KeyedCommand<IntegerReply>{
	
	private final long start;
	private final long end;
	
	public Bitcount(String key){
		this(key, 0, -1);
	}

	public Bitcount(String key, long start, long end){
		super(key);
		this.start = start;
		this.end = end;
	}
	
	public long getStart() {
		return start;
	}
	
	public long getEnd() {
		return end;
	}
}