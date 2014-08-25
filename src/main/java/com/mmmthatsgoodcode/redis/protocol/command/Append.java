package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Append extends KeyedCommand<IntegerReply>{

	private final String subString;
	
	//Appends the value at the end of the String at key
	public Append(String key, String subString) {
		super(key);
		this.subString = subString;
	}

	public String getSubString() {
		return subString;
	}
}