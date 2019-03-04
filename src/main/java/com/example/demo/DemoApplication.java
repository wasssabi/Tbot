package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;


@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(DemoApplication.class, args);
	}

}
