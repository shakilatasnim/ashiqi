package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pageFactory.PageLoginFactory;

public class SignIn3 {
	public void signInbttn(WebDriver driver) {
			
	PageLoginFactory sn= new PageLoginFactory(driver);
	sn.getSignin().click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	sn.getEmail().sendKeys("shakila.tasnim.82@gmail.com");
	sn.getPasswrd().sendKeys("aiman2018");
	sn.getSubmitbtn().click();
	
	
}
	
}