package TestNg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.BaseLogin3;
import com.generic.Dresses3;
import com.generic.SignIn3;
import com.pageFactory.PageLoginFactory;



public class Testng {
	 static WebDriver driver;
	 @BeforeTest
	public void setup1(){
			driver=BaseLogin3.browserSetup();
	
	 }
	@Test(dependsOnMethods= {"signInbttn"})
	public void drespage() {
		Dresses3 obj3= new Dresses3();
		obj3.drespage(driver);
		
		
}
		@Test()
		public void signInbttn() {
		SignIn3 obj6=new SignIn3();
		obj6.signInbttn(driver);

		}
		
		
	}
	
