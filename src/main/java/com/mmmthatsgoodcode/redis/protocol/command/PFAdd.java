package com.mmmthatsgoodcode.redis.protocol.command;

import java.util.Arrays;
import java.util.List;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class PFAdd extends KeyedCommand<IntegerReply>{

	private final List<byte[]> elements;
	
	public PFAdd(String key, byte[] element) {
		this(key, Arrays.asList(element));
	}

	public PFAdd(String key, List<byte[]> elements) {
		super(key);
		this.elements = elements;
	}
	
	public List<byte[]> getElements() {
		return elements;
	}
}
