package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new  FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.name("identifier")).sendKeys("shwetapatel3591");
		driver.findElement(By.className("CwaK9")).click();
		//driver.findElement(By.xpath("//div[@id='identifierNext']/span/span")).click();
		
		//dont's forget to enter sleep: it's by default time is 30 sec.
		// so it will not click on second page's next button if you did not write thread.slee() method
		Thread.sleep(2000); // it's very important to write it when page is navigate on another page and then perfom action
		
		driver.findElement(By.name("password")).sendKeys("gfgdf");
		//driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]")).click();
		driver.findElement(By.className("CwaK9")).click();
		
		String expErrMsg="Wrong password. Try again or click Forgot password to reset it.";
		String actualErrMsg=driver.findElement(By.xpath("//div[@jsname='B34EJ']/span")).getText(); //don't forget to write getText() method to contain the error msg
		
		if(expErrMsg.equals(actualErrMsg))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
