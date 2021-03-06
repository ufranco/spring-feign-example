package com.ufranco.springfeignexample;

import feign.Logger;
import feign.Logger.Level;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class SpringFeignExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignExampleApplication.class, args);
	}

}

