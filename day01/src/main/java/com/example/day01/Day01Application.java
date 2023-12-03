package com.example.day01;

import com.example.day01.upload.storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Day01Application {

	public static void main(String[] args) {
		SpringApplication.run(Day01Application.class, args);
	}

}
