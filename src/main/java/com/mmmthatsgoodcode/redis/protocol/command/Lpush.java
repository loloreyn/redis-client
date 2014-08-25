package com.mmmthatsgoodcode.redis.protocol.command;

import java.util.Arrays;
import java.util.List;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Lpush extends KeyedCommand<IntegerReply>{

	private final List<byte[]> values;
	
	public Lpush(String key, byte[] value) {
		this(key,Arrays.asList(value));
	}
	
	public Lpush(String key, List<byte[]> values){
		super(key);
		this.values = values;
	}
	
	public List<byte[]> getValues() {
		return values;
	}
}
