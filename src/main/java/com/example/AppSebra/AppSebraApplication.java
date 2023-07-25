package com.example.AppSebra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppSebraApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSebraApplication.class, args);
	}

}
