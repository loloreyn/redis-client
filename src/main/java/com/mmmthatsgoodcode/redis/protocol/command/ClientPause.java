package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.AbstractCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.StatusReply;

public class ClientPause extends AbstractCommand<StatusReply>{

	private final int milliSeconds;
	
	public ClientPause(int milliSeconds){
		this.milliSeconds = milliSeconds;
	}
	
	public int getMilliSeconds() {
		return milliSeconds;
	}
}