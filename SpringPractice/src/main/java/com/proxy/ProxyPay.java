package com.proxy;

public class ProxyPay implements PayInterface{
	
	PayInterface pay;
	
	public ProxyPay(PayInterface pay) {
		this.pay = pay;
	}
	
	@Override
	public void payment() {
		System.out.println("개시 로그 출력 처리");
		pay.payment ();
		System.out.println("종료 로그 출력 처리");
	}

}
