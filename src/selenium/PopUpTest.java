package selenium;
// prog-2 [24 aug] 
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		Thread.sleep(1000);

		List<WebElement> popUp=driver.findElements(By.linkText("x"));
		System.out.println(popUp.size());

		if(popUp.size()>0)
		{
			//driver.findElement(By.linkText("x")).click();  // we can't use isdisplay() method here

			popUp.get(0).click(); // only one popup at the time so index is '0'
		}
		
			driver.findElement(By.linkText("Buyer Protection")).click();
		
	}

}
