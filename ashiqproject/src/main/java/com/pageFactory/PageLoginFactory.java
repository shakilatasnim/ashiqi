package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLoginFactory {
  public  PageLoginFactory(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	   
  }
  
  private String url= "http://automationpractice.com/index.php";
 public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
 @FindBy (xpath="//a[@class='login']")
		private  WebElement signin;
public WebElement getSignin() {
	return signin;
}
public void setSignin(WebElement signin) {
	this.signin = signin;
} 
  
  @FindBy (xpath="(//input[@class='is_required validate account_input form-control'])[2]")
  private WebElement email;
  
  @FindBy(xpath="(//input[@class='is_required validate account_input form-control'])[3]")
    private WebElement passwrd;
  
public WebElement getEmail() {
	return email;
}
public void setEmail(WebElement email) {
	this.email = email;
}
public WebElement getPasswrd() {
	return passwrd;
}
public void setPasswrd(WebElement passwrd) {
	this.passwrd = passwrd;
	}

 @FindBy (xpath="//button[@id='SubmitLogin']")
		 private WebElement submitbtn;
public WebElement getSubmitbtn() {
	return submitbtn;
}
public void setSubmitbtn(WebElement submitbtn) {
	this.submitbtn = submitbtn;
	
}
 
@FindBy (xpath="//a[@class='sf-with-ul'][1]")
 private WebElement Dresses3;
public WebElement getDresses3() {
	return Dresses3;
}
public void setDresses3(WebElement dresses3) {
	Dresses3 = dresses3;
}

@FindBy (xpath="//a[@title='Printed Dress'][1]")
  private WebElement prntddrs;
public WebElement getPrntddrs() {
	return prntddrs;
}
public void setPrntddrs(WebElement prntddrs) {
	this.prntddrs = prntddrs;
}

@FindBy (xpath="//span[contains(text(),'Add to cart')]")
 private WebElement addtocart;
public WebElement getAddtocart() {
	return addtocart;
	
}
public void setAddtocart(WebElement addtocart) {
	this.addtocart = addtocart;
}

 @FindBy (xpath="//a[@class='btn btn-default button button-medium']")
 
    private WebElement proceed;
public WebElement getProceed() {
	return proceed;
}
public void setProceed(WebElement proceed) {
	this.proceed = proceed;
}
}
  
	

