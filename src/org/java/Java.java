package org.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kavinesh\\eclipse-workspace\\Java\\driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.youtube.com/");
}
}
