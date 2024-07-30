package com.test.singleton;

/**
 * Settings정보클래스
 *
 * @author jung.mh
 * @since 2022/11/15
 */
public class Settings {

	private static Settings settings = null;

	private Settings() {

	}

	public static Settings getSetting() {
		if (settings == null)
			settings = new Settings();
		return settings;
	}

	private String country = "Korea";
	private boolean darkMode = false;
	private int size = 1;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isDarkMode() {
		return darkMode;
	}

	public void setDarkMode(boolean darkMode) {
		this.darkMode = darkMode;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}