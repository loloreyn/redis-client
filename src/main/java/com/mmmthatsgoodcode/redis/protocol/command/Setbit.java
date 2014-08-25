package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Setbit extends KeyedCommand<IntegerReply>{

	private final int offset;
	private final int bitValue;
	
	public Setbit(String key, int offset, int bitValue){
		super(key);
		this.offset = offset;
		this.bitValue = bitValue;
	}
	
	public int getOffset() {
		return offset;
	}
	
	public int getBitValue() {
		return bitValue;
	}
}