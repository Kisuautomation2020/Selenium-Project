package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MissisaugaHoverTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		
		
		
		WebElement cityHall=driver.findElement(By.id("tnNavHall"));
		
		Actions builder =new Actions(driver); 
		builder.moveToElement(cityHall).build().perform();
		
		Thread.sleep(3000);
		
		List <WebElement> allList=driver.findElements(By.xpath("//div[@id='tnNavHallMenu']/a"));
		//List <WebElement> allList=driver.findElements(By.xpath("//a[contains(text(),'Mayor & Council')]/../a"));
		System.out.println(allList.size());
		
		for(int i=0;i<allList.size();i++)
		{
			System.out.println(allList.get(i).getText());
			
			if(allList.get(i).getText().equals("Jobs & Careers")) // if link is jobs and Careers then click and break
			{
				allList.get(i).click();
				break;
			}
		}
	}
	}


