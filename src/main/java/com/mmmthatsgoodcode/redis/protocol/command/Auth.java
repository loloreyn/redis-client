package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.AbstractCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.StatusReply;

public class Auth extends AbstractCommand<StatusReply>{

	private final String password;
	
	public Auth(String password){
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
}