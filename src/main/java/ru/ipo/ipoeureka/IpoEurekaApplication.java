package ru.ipo.ipoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IpoEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpoEurekaApplication.class, args);
		System.out.println("test");
	}

}
