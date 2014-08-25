package com.mmmthatsgoodcode.redis.protocol.command;

import com.mmmthatsgoodcode.redis.protocol.model.KeyedCommand;
import com.mmmthatsgoodcode.redis.protocol.reply.StatusReply;

public class DebugObject extends KeyedCommand<StatusReply>{

	public DebugObject(String key) {
		super(key);
	}
}