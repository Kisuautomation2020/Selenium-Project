package selenium;
//prog-3 [24-aug] 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));

		Actions builder=new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();

		Thread.sleep(2000);

		// when you wait for particular condition to check then use Explicit wait


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

		//..... other method .....

		/*String expMsg="Dropped";
		String actualMsg=driver.findElement(By.id("droppable")).getText();

		if(expMsg.equals(actualMsg))
		{
			System.out.println("Element is dropped");
		}
		else
		{
			System.out.println("Element is not dropped yet");
		}*/

	}

}
