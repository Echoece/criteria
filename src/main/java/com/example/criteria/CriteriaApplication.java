package com.example.criteria;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.URI;

@SpringBootApplication
@Slf4j
public class CriteriaApplication {

    public static void main(String[] args) {
	SpringApplication.run(CriteriaApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(){
	return (String... args) -> log.info("Swagger URL: "+ new URI("http://localhost:8080/swagger-ui/"));
    }
}
