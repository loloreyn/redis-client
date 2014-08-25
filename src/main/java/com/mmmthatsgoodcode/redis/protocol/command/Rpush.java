package com.mmmthatsgoodcode.redis.protocol.command;

import java.util.Arrays;
import java.util.List;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Rpush extends KeyedCommand<IntegerReply>{

	private final List<byte[]> values;
	
	public Rpush(String key, byte[] value){
		this(key,Arrays.asList(value));
	}
	
	public Rpush(String key, List<byte[]> values){
		super(key);
		this.values = values;
	}
	
	public List<byte[]> getValues() {
		return values;
	}
}
