package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // for open the  firefox you need to use gecko driver
		FirefoxDriver driver=new FirefoxDriver(); // create the object of selenium web driver 
		 // you need to create object because it has all methods which are non-static
		
		driver.get("https://www.facebook.com/");  // for open and run the facebook url
		
		
		//driver.findElement(By.className("inputtext")).sendKeys("a"); 
		driver.findElement(By.id("email")).sendKeys("ggtgtth"); // get the element's id and run the facebook page with given field detail
		//Thread.sleep(4000); // not need here
		
		//driver.findElement(By.name("email")).sendKeys("rvtrgtt"); // By. Name (there are 8 types of locators) called locator and others are web element in code
		//driver.findElement(By.tagName("input")).sendKeys("frgfhthy");
		
		//driver.findElement(By.name("pass")).sendKeys("fdgdgfhgh");
		driver.findElement(By.id("pass")).sendKeys("dfdfdfg");
		
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
