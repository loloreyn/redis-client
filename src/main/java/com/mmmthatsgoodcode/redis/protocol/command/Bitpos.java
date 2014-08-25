package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.IntegerReply;

public class Bitpos extends KeyedCommand<IntegerReply>{

	private final int bitSearched;
	private final long start;
	private final long end;
	
	public Bitpos(String key, int bitSearched) {
		this(key, bitSearched, 0, -1);
	}
	
	public Bitpos(String key, int bitSearched, long startingBit) {
		this(key, bitSearched, startingBit, -1);
	}
	
	public Bitpos(String key, int bitSearched, long start, long end) {
		super(key);
		this.bitSearched = bitSearched;
		this.start = start;
		this.end = end;
	}
	
	public int getBitSearched() {
		return bitSearched;
	}
	
	public long getStart() {
		return start;
	}
	
	public long getEnd() {
		return end;
	}
}