package com.mmmthatsgoodcode.redis.protocol.command;

public class Decrby extends Decr {

	//or long
	private final int decrement;
	
	public Decrby(String key, int decrement) {
		super(key);
		this.decrement = decrement;
	}

	public int getDecrement() {
		return decrement;
	}
}