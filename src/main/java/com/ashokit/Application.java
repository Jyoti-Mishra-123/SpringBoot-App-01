package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//changes for task no 102
		String s="jyoti";
		String s1="mishra";
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	}
	
	public void displayMessage() {
		 //changes for task 103
		int a=10;
		int b=20;
		 
	}

}
