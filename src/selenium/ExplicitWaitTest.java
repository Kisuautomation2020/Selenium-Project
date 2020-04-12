package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//prog-5 [24-aug]
public class ExplicitWaitTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicit wait
		WebDriverWait wait=new WebDriverWait(driver,100); // it's special class to create object of Explicit Wait
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
