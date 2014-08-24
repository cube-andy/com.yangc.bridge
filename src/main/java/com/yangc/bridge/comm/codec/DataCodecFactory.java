package com.yangc.bridge.comm.codec;

import java.nio.charset.Charset;

import org.apache.mina.filter.codec.demux.DemuxingProtocolCodecFactory;

import com.yangc.bridge.comm.protocol.Protocol;

public class DataCodecFactory extends DemuxingProtocolCodecFactory {

	private static final String CHARSET_NAME = "UTF-8";

	public DataCodecFactory() {
		this.addMessageEncoder(Protocol.class, new EncoderData());
		this.addMessageDecoder(new DecoderChat(Charset.forName(CHARSET_NAME)));
		this.addMessageDecoder(new DecoderFile(Charset.forName(CHARSET_NAME)));
	}

}