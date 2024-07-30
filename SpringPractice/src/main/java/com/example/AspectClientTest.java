package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aspect.AspectExecClass;

public class AspectClientTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AspectExecClass execClass = context.getBean(AspectExecClass.class);
		execClass.exec();
		
		((ConfigurableApplicationContext) context).close();
	}

}
