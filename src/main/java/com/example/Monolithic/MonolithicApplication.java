package com.example.Monolithic;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.Monolithic.controller","com.example.Monolithic.service"})
@EntityScan("com.example.Monolithic.entity")
@EnableJpaRepositories("com.example.Monolithic.repository")

public class MonolithicApplication {
	public static void main(String[] args) {
		SpringApplication.run(MonolithicApplication.class, args);
	}

}
