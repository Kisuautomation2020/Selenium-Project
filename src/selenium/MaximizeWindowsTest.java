package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindowsTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		// you can maximize your testing window using this method...
		
		driver.manage().window().maximize();

	}

}
