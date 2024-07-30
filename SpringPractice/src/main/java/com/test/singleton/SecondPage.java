package com.test.singleton;

/**
 * SecondPage클래스
 *
 * @author jung.mh
 * @since 2022/11/15
 */
public class SecondPage {

	private Settings settings = Settings.getSetting();

	/**
	 * Settings정보를 출력한다
	 */
	
	public void pringSettings() {
		System.out.println("********SecondPage********");
		System.out.println("Country==" + settings.getCountry());
		System.out.println("DarkMode==" + settings.isDarkMode());
		System.out.println("Size==" + settings.getSize());
	}
}
