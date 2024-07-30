package com.test.singleton;

/**
 * 싱글톤패턴
 * FirstPage와SecondPage은 동일한 Settings클래스정보를 공유해야한다
 *
 * @author jung.mh
 * @since 2022/11/15
 */
public class TestMain {

	/**
	 * FirstPage와 SecondPage의 Settings정보를 출력한다
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		FirstPage first = new FirstPage();
		SecondPage second = new SecondPage();

		first.setAndPringSettings();
		second.pringSettings();
	}
}
