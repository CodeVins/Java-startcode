package com.proxy;

public class ProxyClient {
	public static void main(String[] args) {
		PayInterface pay = new ProxyPay(new Cash());
		pay.payment();
	}

}
