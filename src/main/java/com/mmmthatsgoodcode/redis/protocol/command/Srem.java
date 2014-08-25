package com.mmmthatsgoodcode.redis.protocol.command;

import java.util.Arrays;
import java.util.List;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Srem extends KeyedCommand<IntegerReply>{

	private final List<byte[]> members;
	
	public Srem(String key, byte[] member) {
		this(key, Arrays.asList(member));
	}
	
	public Srem(String key, List<byte[]> members) {
		super(key);
		this.members = members;
	}
	
	public List<byte[]> getMembers() {
		return members;
	}
}