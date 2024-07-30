package com.example.aspect;

import org.springframework.stereotype.Component;

@Component
public class AspectExecClass {
	public void exec() {
		System.out.println("AspectExecClass - exec()");
	}

}
