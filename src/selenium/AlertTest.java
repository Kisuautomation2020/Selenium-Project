package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//18 aug -sun [Prog-2]
// for work on pop up of javascript : inbuilt class Alert
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/javascript4.htm");

		WebDriverWait wait=new WebDriverWait(driver,100); // Explicit wait
		//WebDriverWait wait1=new WebDriverWait(driver,100); // Explicit wait : second object for having more than one conditions  in this class

		//----- open alert dialog box with ok and cancel button

		driver.findElement(By.name("B2")).click(); //for confirm box
		//driver.findElement(By.name("B3")).click(); // for prompt box


		//Thread.sleep(3000);

		//here we are doing wait for Alert, so use Explicit  wait here instead of thread.

		wait.until(ExpectedConditions.alertIsPresent());

		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());

		al.accept();// for choose Ok 
		//al.sendKeys("Selenium"); // this line is for prompt box
		//al.dismiss();  // for choose cancel option (button) // it select the other option
	}

}
