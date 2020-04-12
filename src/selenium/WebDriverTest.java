package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // for open the  firefox you need to use gecko driver
		//FirefoxDriver driver=new FirefoxDriver();
		// className objeName= new className()
		
		WebDriver driver=new FirefoxDriver(); // you can write interface name instead of className on left side always and right side className
		//InnterfaceName objName= new ClassName();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("ffgfghfdh");  // locator : x-path
		
		driver.findElement(By.className("inputtext")).sendKeys("a"); //locator : className
		
		driver.findElement(By.name("pass")).sendKeys("fdgdgfhgh");
		
		driver.findElement(By.id("loginbutton")).click();
	}

}
