package com.generic;

import org.openqa.selenium.WebDriver;

public class runTest3 {
public static WebDriver driver;
	public static void main(String[] args) {
		driver=BaseLogin3.browserSetup();
		driver.manage().deleteAllCookies();
		SignIn3 obj4=new SignIn3();
		obj4.signInbttn(driver);
		Dresses3 obj5=new Dresses3();
		obj5.drespage(driver);
		
	}

}
