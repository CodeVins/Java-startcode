package com.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	@Before("execution(public * com.example..*(..))")
	public void startLog() {
		System.out.println("LogAspect - startLog()");
	}
	@After("execution(public * com.example..*(..))")
	public void endtLog() {
		System.out.println("LogAspect - endLog()");
	}

}
