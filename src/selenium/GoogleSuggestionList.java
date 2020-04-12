package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("canada");
		
		/* add this thread.sleep() method here , 
		 * so driver can give you the size of all listing WebElements.
		 * If you forget to write this line then it will give size 0 for the list of WebElements.
		*/
		Thread.sleep(2000);
		
		List<WebElement> allList=driver.findElements(By.xpath("//ul[@jsname='erkvQe']/li"));
		System.out.println(allList.size()); // it gives you the size of list (here size is 10)
		
		// for writing text of listing web elements
		/*for(int i=0;i<allList.size();i++)
		{
			System.out.println(allList.get(i).getText());
		}*/
		
		// using contains() method check for the passing value in searchBox
		
		/*Check the passing value is matched with the sendKeys of the search box  and 
		 if it's true then print the list of all Web elements.
		*/
		
		for(int i=0;i<allList.size();i++)
		{
			if(allList.get(i).getText().contains("canada"))
			{
				System.out.println(allList.get(i).getText());
			}
			else
			{
				System.out.println("Failed");
			}
		}
		

	}

}
