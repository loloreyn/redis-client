package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.BulkReply;

public class Lindex extends KeyedCommand<BulkReply>{

	private final int index;
	
	public Lindex(String key, int index) {
		super(key);
		this.index = index;
	}

	public int getIndex() {
		return index;
	}
}