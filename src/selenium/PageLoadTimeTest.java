package selenium;
//prog-6 [24-aug]
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTimeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicit wait
		
		// it's generic , similar to implicit wait but use for pageLoad time : 
		//if page is not load in 60s then test will fail here for all page load actions
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); // page load time wait 
		
		
		
		WebDriverWait wait=new WebDriverWait(driver,100); // it's a special class of selenium  to create object of Explicit Wait
		//here 100 is second and it's by default option
		
		
		driver.switchTo().frame(0);
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		
		Actions builder=new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		//Thread.sleep(2000);
		
		// when you wait for particular condition to check then use Explicit wait
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("droppable"),"Dropped!" ));
		
		if(droppable.getText().equals("Dropped!"))
		{
			//System.out.println("Element is Dropped");
			System.out.println("Passed");
		}
		else
		{
			//System.out.println("Element is not dropped");
			System.out.println("Failed");
		}
		


	}

}
