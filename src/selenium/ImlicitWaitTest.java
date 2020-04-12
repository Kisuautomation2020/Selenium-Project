package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//prog-4 [24 aug]
public class ImlicitWaitTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// 30 sec is the max time here and it will perform action for finding each web element
		
		//enter lastName
		
		driver.findElement(By.name("lastname")).sendKeys("fdfdggg");
		
		// enter mobile number
		
		driver.findElement(By.name("reg_email__")).sendKeys("9056408989");
		
		// enter password
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("ffdgfgfgfh");
		
		
		// Selection of Month, Date and Year from DropdownList
		// for Dropdownlist java has inbuilt select method : by value, by index and by visibleText
		
		//select month
		WebElement month=driver.findElement(By.id("month"));
		Select m=new Select(month); //create object for select method 
		m.selectByValue("5");
		
		//select date
		WebElement day=driver.findElement(By.id("day"));
		Select d=new Select(day);
		d.selectByValue("14");
		
		//select year
		WebElement year=driver.findElement(By.id("year"));
		Select y=new Select(year);
		y.selectByVisibleText("1990");
		
		
		
		// Click on Signup button
		
		driver.findElement(By.name("websubmit")).click();
		
		//Thread.sleep(2000);
		
		
		
		String expectedMsg="What’s your name?";
		String actualMsg=driver.findElement(By.xpath("//div[@class='_5633 _5634 _53ij']")).getText();
		System.out.println(actualMsg);
		
		if(expectedMsg.equals(actualMsg))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}


	}

}
