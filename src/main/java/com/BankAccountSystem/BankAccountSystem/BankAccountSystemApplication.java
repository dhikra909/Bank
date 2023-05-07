package com.BankAccountSystem.BankAccountSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
@EnableGlobalMethodSecurity
public class BankAccountSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAccountSystemApplication.class, args);
	}

}
