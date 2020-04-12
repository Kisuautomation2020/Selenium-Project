package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardButtonTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();

		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());

		Thread.sleep(2000);

		//click on the About Link and get the title
		driver.findElement(By.linkText("About")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		// For click on browser's back button automatically. It does not have any HTML code.
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		//For click on  browser's forward button.
		driver.navigate().forward();
		System.out.println(driver.getTitle());

	}

}
