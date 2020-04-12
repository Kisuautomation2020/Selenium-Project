package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinktextTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abou")).click(); 
		
		/* when you want avoid the last character and write atleast few words to find the link 
		 * then you can use partialLinktext -------------
		 * LinkText: it returns elements with an exact match of the given text
		  PartialLinkText returns elements which include the given text-------
		 */
		
		Thread.sleep(4000);
		
		String expectedTitle= "About | Google";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		
		String expectedUrl="https://about.google/intl/en/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		
		if(expectedTitle.equals(actualTitle) && expectedUrl.equals(actualUrl))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}

	}

}
