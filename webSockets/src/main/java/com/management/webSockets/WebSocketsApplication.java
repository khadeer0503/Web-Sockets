package com.management.webSockets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WebSocketsApplication {
	private static final Logger logger = LoggerFactory.getLogger(WebSocketsApplication.class);

	public static void main(String[] args) {
		Environment env = SpringApplication.run(WebSocketsApplication.class, args).getEnvironment();
		String port = env.getProperty("server.port");
		logger.info("WebSocket Application Started Successfully on port {}", port);
	}

}
