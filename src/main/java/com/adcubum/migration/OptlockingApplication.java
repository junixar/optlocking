package com.adcubum.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OptlockingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OptlockingApplication.class, args).close();
	}

}
