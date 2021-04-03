package browseropen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsersopen {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // System.setProperty("Webdriver.chrome.driver","C:\\Users\\SHAKILA\\eclipse-workspace\\selenium1\\driver\\chromedriver.exe");
     
    //  WebDriver driver = new ChromeDriver();
      
     // driver.get("https://www.google.com/");
		
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();

	  driver.get("https://www.google.com/");
	  
	  
	  driver.manage().window().maximize();
 	  WebElement searchbox=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
 	  searchbox.sendKeys("toys");
	  searchbox.submit();
	  
	  Actions acts= new Actions(driver);
	        
      acts.moveToElement(driver.findElement(By.xpath
      		("//body[1]/div[9]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1])"))).build().perform();
      
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	  
	 // driver.navigate().to("https://www.amazon.com/");
	//  driver.navigate().back();
	  String title= driver.getTitle();
	  System.out.println(title);
 
	  if (title.contains("\"https://www.amazon.com/")){
		System.out.println("correct title");  
	  }
	
	  else {
		  System.out.println("not correct title");
	  }  
	 
        
        
	  
	}
	


}
