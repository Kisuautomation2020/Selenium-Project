package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://moodle.cestarcollege.com/moodle/");
		WebDriverWait wait=new WebDriverWait(driver,100);
		
		//click on FAQ  link
		driver.findElement(By.linkText("Faq")).click();
		
		Set<String> allWindows=driver.getWindowHandles(); // set does not allow duplicate value such as List
		System.out.println(allWindows.size());
		
		Iterator<String> iter=allWindows.iterator(); // you have to use Iterator for Set 
		String mainWindow=iter.next();
		String childWindow=iter.next();
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		
		driver.switchTo().window(childWindow);
		wait.until(ExpectedConditions.titleIs("Frequently Asked Questions (FAQ)")); // for getting title of childwindow
		
		System.out.println(driver.getTitle());
		//driver.quit();  // Interview Que: Diff between driver.close() and driver.quit();
		driver.close(); // close() method will close the current window
		
		//again check the size of window : output should be one
		allWindows=driver.getWindowHandles(); 
		System.out.println(allWindows.size());
		
		driver.switchTo().window(mainWindow);
		
		System.out.println(driver.getTitle());
		//driver.quit();  //quit() will close the all windows from the browser
	}

}
