package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Move extends KeyedCommand<IntegerReply>{

	private final byte[] db;
	
	public Move(String key, byte[] db){
		super(key);
		this.db = db;
	}
	
	public byte[] getDb() {
		return db;
	}
}
