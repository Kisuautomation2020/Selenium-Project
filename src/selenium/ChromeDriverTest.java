package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// get the all footer links of facebook, print the size and name of it
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[@role='contentinfo']/ul/li/a"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
	}

}
