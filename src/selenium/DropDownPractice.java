package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> popUp=driver.findElements(By.linkText("x"));
		System.out.println(popUp.size());
		
		if(popUp.size()>0) 
		{
			popUp.get(0).click();
		}
		
		
		WebElement box=driver.findElement(By.id("search-dropdown-box"));
		List<WebElement> allList=box.findElements(By.tagName("option"));
		System.out.println(allList.size());

		for(int i=0;i<allList.size();i++)
		{
			if(allList.get(i).isSelected()) {
				System.out.println(allList.get(i).getText()+"-------------"+allList.get(i).isSelected());
			}
		}

		Select s=new Select(box);
		s.selectByIndex(5);
		//s.selectByValue("search-alias=handmade");
		System.out.println("--------------------After Selection--------------------------");
		for(int i=0;i<allList.size();i++)
		{
			if(allList.get(i).isSelected()) {
				System.out.println(allList.get(i).getText()+"-------------"+allList.get(i).isSelected());
			}
		}

	}
	
}
