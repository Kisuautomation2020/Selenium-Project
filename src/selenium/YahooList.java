package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		driver.findElement(By.xpath("//span[@data-category='trending news']/div")).click();
		//Thread.sleep(2000);
		
	    List <WebElement> allList=driver.findElements(By.xpath("//li[@data-category='trending news']/ul/li/a"));
	    System.out.println(allList.size());
	    
	    for(int i=0;i<allList.size();i++)
	    {
	    	System.out.println(allList.get(i).getText());
	    }
	}

}
