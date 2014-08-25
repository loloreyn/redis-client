package com.mmmthatsgoodcode.redis.protocol.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.MultiBulkReply;

public class Hmget extends KeyedCommand<MultiBulkReply>{

	private final List<byte[]> fields;
	
	public Hmget(String key, byte[] field) {
		this(key,Arrays.asList(field));
	}
	
	public Hmget(String key, List<byte[]> fields) {
		super(key);
		this.fields = fields;
	}

	public List<byte[]> getFields() {
		return fields;
	}
}