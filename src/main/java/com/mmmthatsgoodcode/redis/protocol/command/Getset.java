package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.BulkReply;

public class Getset extends KeyedCommand<BulkReply>{

	private final String value;

	public Getset(String key, String value) {
		super(key);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}