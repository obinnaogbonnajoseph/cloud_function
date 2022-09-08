package com.obinna.web_function;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author @obinnaogbonnajoseph
 * @date 08/09/22
 */
@SpringBootApplication
public class WebFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> function() {
		return value -> "Greetings, cloud user " + value;
	}

}
