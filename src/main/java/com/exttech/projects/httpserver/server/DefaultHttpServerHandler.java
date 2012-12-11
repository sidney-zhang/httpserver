/**
 * DefaultHttpServerHandler.java
 */
package com.exttech.projects.httpserver.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundMessageHandlerAdapter;
import io.netty.handler.codec.http.HttpRequest;

/**
 * @author zxy
 * 
 *         Dec 10, 2012 12:53:09 AM
 */
public class DefaultHttpServerHandler extends ChannelInboundMessageHandlerAdapter<HttpRequest> {

	@Override
	public void messageReceived(ChannelHandlerContext ctx, HttpRequest request) throws Exception {
		System.out.println(request.toString());
	}

}
