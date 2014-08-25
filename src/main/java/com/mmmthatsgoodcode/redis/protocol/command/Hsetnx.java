package com.mmmthatsgoodcode.redis.protocol.command;

public class Hsetnx extends Hset{

	public Hsetnx(String key, byte[] field, byte[] value) {
		super(key, field, value);
	}	
}