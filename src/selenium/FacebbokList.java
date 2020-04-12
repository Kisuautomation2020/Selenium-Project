package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebbokList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		List <WebElement> allList=driver.findElements(By.xpath("//div[@role='contentinfo']/ul/li/a"));	
		Thread.sleep(1000);
		System.out.println(allList.size());
		
		for(int i=0;i<allList.size();i++)
		{
			System.out.println(allList.get(i).getText());
		}
		
	}

}
