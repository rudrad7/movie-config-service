package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MovieConfigServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieConfigServer2Application.class, args);
		System.out.println("Movie Config Server started on 8888.....");
	}

}
