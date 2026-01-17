package com.sugarfit.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.sugarfit.starter*"
})
public class StarterServiceTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterServiceTemplateApplication.class, args);
	}

}
