package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		// for getting all 5 footer links
		//List <WebElement> allLinks=driver.findElements(By.xpath("//div[@class='fbar']/span/a")); 
		
		
		/* we can write code in this way also for getting list of web elements ,
		specially when you write object for any method
		*/
		//WebElement footerLinks=driver.findElement(By.id("fsl"));
		//List <WebElement> allLinks=footerLinks.findElements(By.tagName("a"));
 	
		
	
		//for getting left side 3 footer links on google page
		List <WebElement> allLinks=driver.findElements(By.xpath("//span[@id='fsl']/a"));
		
				System.out.println(allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}

	}

}
