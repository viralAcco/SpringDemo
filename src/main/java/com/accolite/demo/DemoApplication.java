package com.accolite.demo;

import com.accolite.demo.config.MovieConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
	}

}
