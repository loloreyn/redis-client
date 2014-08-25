package com.mmmthatsgoodcode.redis.protocol.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Hdel extends KeyedCommand<IntegerReply>{

	private final List<byte[]> fields;

	public Hdel(String key, byte[] field) {
		this(key, Arrays.asList(field));
	}
	
	public Hdel(String key, List<byte[]> fields) {
		super(key);
		this.fields = fields;
	}
	
	 public List<byte[]> getFields() {
		return fields;
	}
}
