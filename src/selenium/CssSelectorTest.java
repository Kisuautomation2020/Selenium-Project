package selenium;
//prog-7 [24 aug]
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	// driver.findElement(By.cssSelector("input[id='email']")).sendKeys("shweta234");
	 driver.findElement(By.cssSelector("#email")).sendKeys("shw123");
	// driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("dsfdfd");
	 driver.findElement(By.cssSelector("#pass")).sendKeys("fdsfdsf");
	// driver.findElement(By.cssSelector("label[id='loginbutton']")).click();
	 driver.findElement(By.cssSelector("#loginbutton")).click();

	}

}
