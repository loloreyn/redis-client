package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.AbstractCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.StatusReply;

public class Select extends AbstractCommand<StatusReply>{

	private final int index;
	
	public Select(int index){
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
}