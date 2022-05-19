package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.facebook.com/");
	}

}
