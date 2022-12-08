package com.example.demo.annotationdemo;

import com.example.demo.annotationdemo.configuration.Appconfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AnnotationdemoApplication {
	static Logger logger = LoggerFactory.getLogger(Appconfiguration.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Appconfiguration.class);
		Appconfiguration appconfiguration = context.getBean(Appconfiguration.class);
		//SpringApplication.run(AnnotationdemoApplication.class, args);
		logger.info(appconfiguration.getServerport());
		logger.info(appconfiguration.getIntergurationurl());
	}

}
