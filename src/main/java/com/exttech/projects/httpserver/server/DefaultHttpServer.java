/**
 * DefaultHttpServer.java
 */
package com.exttech.projects.httpserver.server;

import com.exttech.projects.httpserver.Server;

/**
 * @author zxy
 *
 * Dec 9, 2012 11:42:30 PM
 */
public class DefaultHttpServer extends AbstractServer implements Server{
	

	public DefaultHttpServer() {
		super(8080);
	}

	public DefaultHttpServer(int port) {
		super(port);
	}

	public void start() {
		super.bootstrap();
	}

	public void stop() {
		super.destroy();
	}

}
