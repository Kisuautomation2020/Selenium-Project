package selenium;

//prog-3 18 aug

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayhoverTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		// for actions class you should create the object : Hover action is perform here
		WebElement electronics=driver.findElement(By.linkText("Electronics"));
		Actions builder= new Actions(driver);
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement> allLinks=driver.findElements(By.xpath("(//div[@class='hl-cat-nav__flyout']/div[1]/div[1])[3]//a"));
	
		System.out.println(allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
		
		
		
	}

}
