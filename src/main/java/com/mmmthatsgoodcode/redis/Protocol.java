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
	public enum CommandType { GET, SET, SETEX, EXEC, EXISTS, MSET, MULTI, PING, SETNX, WATCH, APPEND, BITCOUNT, BITPOS, DEBUGOBJECT, DECR, DECRBY, DUMP, EXPIRE, EXPIREAT, GETBIT,GETRANGE, GETSET, HDEL, HEXISTS, HGET, HGETALL, HINCRBY, HINCRBYFLOAT, HKEYS, HLEN, HMGET, HSET, HSETNX, HVALS, INCR, INCRBY, INCRBYFLOAT, LINDEX, LLEN, LPOP, LPUSH, LPUSHX, LRANGE, LREM, LSET, LTRIM, MOVE, PERSIST, PEXPIRE, PEXPIREAT, PFADD, PSETEX, PTTL, RPOP, RPUSH, RPUSHX, SCARD, SETBIT, SETRANGE, SISMEMBER, SMEMBERS, SPOP, SRANDMEMBER, SREM, STRLEN, TTL, TYPE, ZCARD, ZREM }
	
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
		public void encode(Watch command, ByteBuf out);	//58
		public void encode(Append command, ByteBuf out);
		public void encode(Bitcount command, ByteBuf out);
		public void encode(Bitpos command, ByteBuf out);
		public void encode(DebugObject command, ByteBuf out);
		public void encode(Decr command, ByteBuf out);
		public void encode(Decrby command, ByteBuf out);
		public void encode(Dump command, ByteBuf out);
		public void encode(Expire command, ByteBuf out);
		public void encode(Expireat command, ByteBuf out);
		public void encode(Getbit command, ByteBuf out);
		public void encode(Getrange command, ByteBuf out);
		public void encode(Getset command, ByteBuf out);
		public void encode(Hdel command, ByteBuf out);
		public void encode(Hexists command, ByteBuf out);
		public void encode(Hget command, ByteBuf out);
		public void encode(Hgetall command, ByteBuf out);
		public void encode(Hincrby command, ByteBuf out);
		public void encode(Hincrbyfloat command, ByteBuf out);
		public void encode(Hkeys command, ByteBuf out);
		public void encode(Hlen command, ByteBuf out);
		public void encode(Hmget command, ByteBuf out);
		public void encode(Hset command, ByteBuf out);
		public void encode(Hsetnx command, ByteBuf out);
		public void encode(Hvals command, ByteBuf out);
		public void encode(Incr command, ByteBuf out);
		public void encode(Incrby command, ByteBuf out);
		public void encode(Incrbyfloat command, ByteBuf out);
		public void encode(Lindex command, ByteBuf out);
		public void encode(Llen command, ByteBuf out);
		public void encode(Lpop command, ByteBuf out);
		public void encode(Lpush command, ByteBuf out);
		public void encode(Lpushx command, ByteBuf out);
		public void encode(Lrange command, ByteBuf out);
		public void encode(Lrem command, ByteBuf out);
		public void encode(Lset command, ByteBuf out);
		public void encode(Ltrim command, ByteBuf out);
		public void encode(Move command, ByteBuf out);
		public void encode(Persist command, ByteBuf out);
		public void encode(Pexpire command, ByteBuf out);
		public void encode(PexpireAt command, ByteBuf out);
		public void encode(PFAdd command, ByteBuf out);
		public void encode(Psetex command, ByteBuf out);
		public void encode(Pttl command, ByteBuf out);
		public void encode(Rpop command, ByteBuf out);
		public void encode(Rpush command, ByteBuf out);
		public void encode(Rpushx command, ByteBuf out);
		public void encode(Scard command, ByteBuf out);
		public void encode(Setbit command, ByteBuf out);
		public void encode(Setrange command, ByteBuf out);
		public void encode(Sismember command, ByteBuf out);
		public void encode(Smembers command, ByteBuf out);
		public void encode(Spop command, ByteBuf out);
		public void encode(Srandmember command, ByteBuf out);
		public void encode(Srem command, ByteBuf out);
		public void encode(Strlen command, ByteBuf out);
		public void encode(Ttl command, ByteBuf out);
		public void encode(Type command, ByteBuf out);
		public void encode(Zcard command, ByteBuf out);
		public void encode(Zrem command, ByteBuf out);
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
