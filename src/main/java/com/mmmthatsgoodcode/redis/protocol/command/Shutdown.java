package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.AbstractCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.StatusReply;

public class Shutdown extends AbstractCommand<StatusReply>{

	private final boolean save;
	
	public Shutdown(boolean save){
		this.save = save;
	}
	
	public boolean getSave(){
		return save;
	}
}