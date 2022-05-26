package com.fabiopokeapi.webclientpokeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WebclientPokeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebclientPokeApiApplication.class, args);
	}

}
