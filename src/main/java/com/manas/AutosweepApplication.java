package com.manas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AutosweepApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutosweepApplication.class, args);
	}

}
