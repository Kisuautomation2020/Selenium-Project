package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

//18 aug prog-4
public class NavigateTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.com/");
		
		//same as diver.get()
		/* driver.get() and driver.navigate.to() both are same but
		 * driver.get() is final for destination and 
		 * 
		 * */
		driver.navigate().to("https://www.google.com/");
		//driver.navigate().forward();
		//driver.navigate().back();
		//driver.navigate().refresh();
	}

}
