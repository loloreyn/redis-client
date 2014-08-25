package com.mmmthatsgoodcode.redis.protocol.command;

public class Incrby extends Incr {

	//or long
	private final int increment;
	
	public Incrby(String key, int increment) {
		super(key);
		this.increment = increment;
	}

	public int getIncrement(){
		return increment;
	}
}