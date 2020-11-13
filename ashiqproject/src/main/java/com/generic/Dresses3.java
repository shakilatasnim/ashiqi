package com.generic;

import org.openqa.selenium.WebDriver;

import com.pageFactory.PageLoginFactory;


public class Dresses3 {

	public void drespage(WebDriver driver) {
		PageLoginFactory drs=new PageLoginFactory(driver);
		drs.getDresses3().click();
		drs.getPrntddrs().click();
		drs.getAddtocart().click();
		drs.getProceed().click();
	}
}
