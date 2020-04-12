package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // for open the  firefox you need to use gecko driver
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.className("inputtext"));
		
		email.sendKeys("a"); 
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("fdgdgfhgh");
		
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();

	}

}
