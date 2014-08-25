package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.BulkReply;

public class Srandmember extends KeyedCommand<BulkReply>{

	private final int count;
	
	public Srandmember(String key){
		this(key, 1);
	}
	
	public Srandmember(String key, int count){
		super(key);
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
}