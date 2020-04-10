package org.exampledriven.eureka.customer.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaclientApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaclientApplication.class, args);
	}
	@RequestMapping(value = "/")
	public String home() {
		return "Eureka Client application";
	}
}