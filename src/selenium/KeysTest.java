package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new  FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.name("identifier")).sendKeys("shwetapatel3591");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000); 
		
		driver.findElement(By.name("password")).sendKeys("gfgdf");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER); //for pressing enter key after enter anything in the textbox
		
	}

}
