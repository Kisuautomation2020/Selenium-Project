package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickTest {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.aliexpress.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// How to Perform double click() in selenium
		
		 WebElement buyer=driver.findElement(By.linkText("Buyer Protection"));
		 
		 Actions builder=new Actions(driver);
		 builder.doubleClick(buyer).build().perform();
		 
		 System.out.println(buyer.getText());
		
		
		

	}

}
