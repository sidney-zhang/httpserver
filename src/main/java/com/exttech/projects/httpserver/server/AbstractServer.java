/**
 * AbstractServer.java
 */
package com.exttech.projects.httpserver.server;

import org.apache.log4j.Logger;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.socket.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author zxy
 *
 * Dec 9, 2012 11:58:55 PM
 */
public abstract class AbstractServer {
	
	static Logger log = Logger.getLogger(AbstractServer.class);
	
	protected int port;
	
	private ServerBootstrap serverBootstrap;
	
	
	protected AbstractServer(int port){
		this.port = port;
	}
	
	protected void bootstrap(){
		serverBootstrap = new ServerBootstrap();
		serverBootstrap.group(new NioEventLoopGroup(), new NioEventLoopGroup())
						.channel(NioServerSocketChannel.class)
						.localAddress(port)
						.childHandler(new DefaultHttpServerInitializer());
		try {
			serverBootstrap.bind().sync();
//			serverBootstrap.bind().sync().channel().close().sync();
			log.info("server is running bind on port: " + port);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected void destroy(){
		
	}

}
