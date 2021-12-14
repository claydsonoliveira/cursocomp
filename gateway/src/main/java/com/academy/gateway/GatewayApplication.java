package com.academy.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

<<<<<<< HEAD
@EnableZuulProxy
@EnableEurekaClient
=======
@EnableEurekaClient
@EnableZuulProxy
>>>>>>> 086fb90ef8e18db4bd8582362b6d780edd4b11cb
@SpringBootApplication
public class GatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	
	}

	
}
