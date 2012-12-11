package com.exttech.projects.httpserver;

import com.exttech.projects.httpserver.server.DefaultHttpServer;

public class ServerBootstrapTest {
	public static void main(String[] args) {
		Server server = new DefaultHttpServer(8088);
		server.start();
	}
}
