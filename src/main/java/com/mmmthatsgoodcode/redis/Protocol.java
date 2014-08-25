package com.mmmthatsgoodcode.redis;

import javax.naming.OperationNotSupportedException;

import com.mmmthatsgoodcode.redis.client.Transaction;
import com.mmmthatsgoodcode.redis.client.UnrecognizedReplyException;
import com.mmmthatsgoodcode.redis.protocol.Command;
import com.mmmthatsgoodcode.redis.protocol.Reply;
import com.mmmthatsgoodcode.redis.protocol.command.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

public interface Protocol {
	
	public enum ReplyType { BULK, ERROR, INTEGER, MULTI_BULK, STATUS, UNKNOWN }
	public enum CommandType { GET, SET, SETEX, EXEC, EXISTS, MSET, MULTI, PING, SETNX, WATCH, AUTH, CLIENTPAUSE, CLIENTSETNAME, COMMANDINFO, CONFIGGET, ECHO, SELECT, SHUTDOWN }
	
	public ByteBufAllocator getByteBufAllocator();
	
	public interface Encoder {

		public void encode(Exec command, ByteBuf out);
		public void encode(Exists command, ByteBuf out);
		public void encode(Get command, ByteBuf out);
		public void encode(MSet command, ByteBuf out);
		public void encode(Multi command, ByteBuf out);
		public void encode(Ping command, ByteBuf out);
		public void encode(Set command, ByteBuf out);
		public void encode(Setex command, ByteBuf out);
		public void encode(Setnx command, ByteBuf out);
		public void encode(Watch command, ByteBuf out);
		public void encode(Auth command, ByteBuf out);
		public void encode(ClientPause command, ByteBuf out);
		public void encode(ClientSetname command, ByteBuf out);
		public void encode(CommandInfo command, ByteBuf out);
		public void encode(ConfigGet command, ByteBuf out);
		public void encode(Echo command, ByteBuf out);
		public void encode(Select command, ByteBuf out);
		public void encode(Shutdown command, ByteBuf out);
		public void encode(Command command, ByteBuf out) throws OperationNotSupportedException;		
		public void encode(Transaction command, ByteBuf out) throws OperationNotSupportedException;
		
	}
	
	public interface Decoder {

		public Reply decode(ByteBuf in) throws UnrecognizedReplyException;
		public ReplyType replyType();
		
	}
	

	public Protocol.Encoder getEncoder();
	public Protocol.Decoder getDecoder();

	
}
