package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement men=driver.findElement(By.linkText("MEN"));

		//-------- for Hover Effect of Action class-----

		Actions builder =new Actions(driver); // object name builder is written commonly in programs
		builder.moveToElement(men).build().perform(); // always write .build().perform() method at the end of the actions object

		Thread.sleep(3000);

		//List <WebElement> allList=driver.findElements(By.xpath("(//div[@class='nav-menu-column prl4-sm va-sm-t d-sm-tc has-left-border is-header'])[1]/a"));
		List <WebElement> allList=driver.findElements(By.xpath("//div[@id='NavigationMenu-0']/div/div[2]/a"));
		System.out.println(allList.size());

		for(int i=0;i<allList.size();i++)
		{
			System.out.println(allList.get(i).getText());
		}
	}

}
