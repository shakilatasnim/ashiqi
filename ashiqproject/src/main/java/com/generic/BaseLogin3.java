package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageFactory.PageLoginFactory;

public class BaseLogin3 {
public static WebDriver driver;
	public static WebDriver browserSetup() {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\alshakailin\\eclipse-workspace\\ashiqproject\\chromedriver.exe");
		driver=new ChromeDriver();
		PageLoginFactory lp1=new PageLoginFactory(driver);
		driver.get(lp1.getUrl());
		return driver;
		
		
	}
	
}