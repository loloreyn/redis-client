package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.MultiBulkReply;

public class Lrange extends KeyedCommand<MultiBulkReply>{

	private final int start;
	private final int stop;
	
	public Lrange(String key, int start, int stop) {
		super(key);
		this.start = start;
		this.stop = stop;
	}

	public int getStart() {
		return start;
	}
	
	public int getStop() {
		return stop;
	}
}
