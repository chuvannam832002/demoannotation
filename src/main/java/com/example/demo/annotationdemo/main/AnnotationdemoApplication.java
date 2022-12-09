package com.example.demo.annotationdemo.main;

import com.example.demo.annotationdemo.bean.DemoBean;
import com.example.demo.annotationdemo.config.Appconfig;
import com.example.demo.annotationdemo.configuration.Appconfiguration;
import com.example.demo.annotationdemo.model.TestModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo.annotationdemo.*")
public class AnnotationdemoApplication {
	static Logger logger = LoggerFactory.getLogger(Appconfiguration.class);
	public static void main(String[] args) {
		//ConfigurableApplicationContext context= SpringApplication.run(Appconfiguration.class);
		//Appconfiguration appconfiguration = context.getBean(Appconfiguration.class);
		//SpringApplication.run(AnnotationdemoApplication.class, args);
		////ApplicationContext context = SpringApplication.run(AnnotationdemoApplication.class);
		////System.out.println(context.getBean(TestModel.class));
		//logger.info(appconfiguration.getServerport());
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		DemoBean demoBean = (DemoBean) context.getBean(DemoBean.class);
		System.out.println(demoBean.getMessage());
		//logger.info(appconfiguration.getIntergurationurl());
	}

}
