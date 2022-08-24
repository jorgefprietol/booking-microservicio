package com.microservicio.jfpl.bookingmicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookingMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingMicroservicioApplication.class, args);
	}

}
