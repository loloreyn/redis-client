package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.AbstractCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.StatusReply;

public class ClientSetname extends AbstractCommand<StatusReply>{

	private final String connectionName;
	
	public ClientSetname(String connectionName){
		this.connectionName = connectionName;
	}
	
	public String getConnectionName() {
		return connectionName;
	}
}