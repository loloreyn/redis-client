package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.AbstractCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.BulkReply;

public class Echo extends AbstractCommand<BulkReply>{

	private final String message;
	
	public Echo(){
		this.message = "default";
	}
	
	public Echo(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}