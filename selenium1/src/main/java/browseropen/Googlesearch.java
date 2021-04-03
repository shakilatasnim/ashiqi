package browseropen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearch {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        String webSite = "https://www.google.com/";
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get(webSite);
	        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
	        List<WebElement> seleniumOption =  driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
	        
	        
	  /*     for(WebElement webElement : seleniumOption) {
	        	
	        	String allOptions = webElement.getText();
	        	if(allOptions.equalsIgnoreCase("selenium foods")) {
	        		webElement.click();
	        		break;
	        	}
	        }*/
	        
	        
	        Googlesearch.googleSearch(seleniumOption, "selenium foods");
	        driver.findElement(By.xpath("//a[text()='Shopping']")).click();
	        
		
	}
	
	
	
	  public static void googleSearch(List<WebElement> option , String value){

	        for (WebElement webElement : option) {
	          String allOption =  webElement.getText();
	          if (allOption.equalsIgnoreCase(value)){
	              webElement.click();
	              break;
	          }
	        }


	    }

}
