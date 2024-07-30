package com.test.singleton;

/**
 * FirstPage클래스
 *
 * @author jung.mh
 * @since 2022/11/15
 */
public class FirstPage {

	private Settings settings = Settings.getSetting();

	/**
	 * Settings정보를 설정하여 콘솔출력
	 */
	
	public void setAndPringSettings() {
		settings.setCountry("Japan");
		settings.setDarkMode(true);
		settings.setSize(15);

		System.out.println("********FirstPage********");
		System.out.println("Country==" + settings.getCountry());
		System.out.println("DarkMode==" + settings.isDarkMode());
		System.out.println("Size==" + settings.getSize());
	}
}
