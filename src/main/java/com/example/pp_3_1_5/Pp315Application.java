package com.example.pp_3_1_5;

import com.example.pp_3_1_5.rest.ConsumeWebService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Pp315Application {

	public static void main(String[] args) {
		SpringApplication.run(Pp315Application.class, args);
		ConsumeWebService.getCode();
	}

}
