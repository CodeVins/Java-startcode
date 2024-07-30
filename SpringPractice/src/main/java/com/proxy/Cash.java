package com.proxy;

public class Cash implements PayInterface {
	
	@Override
	public void payment() {
		System.out.println("현금으로 결제한다.");
	}

}
