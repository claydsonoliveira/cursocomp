package com.academy.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
<<<<<<< HEAD
=======
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
>>>>>>> 086fb90ef8e18db4bd8582362b6d780edd4b11cb
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableCircuitBreaker
@SpringBootApplication
@EnableEurekaClient
@EntityScan({"com.academy.core.model"})
@EnableJpaRepositories({"com.academy.core.repository"})
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

}
