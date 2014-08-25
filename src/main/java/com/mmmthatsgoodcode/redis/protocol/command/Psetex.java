package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.StatusReply;

public class Psetex extends KeyedCommand<StatusReply>{

	private final long milliseconds;
	private final byte[] value;
	
	public Psetex(String key, long milliseconds, byte[] value) {
		super(key);
		this.milliseconds = milliseconds;
		this.value = value;
	}

	public long getMilliseconds() {
		return milliseconds;
	}
	
	public byte[] getValue() {
		return value;
	}
}