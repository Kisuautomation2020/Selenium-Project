package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// 24 aug [prog-1]
public class MultipleBrowsersTest {

	
	
	public static void main(String[] args) throws IOException {
		
		/*String browser="Firefox";
	
		//String browser="Chrome";
		
		
		WebDriver driver; // globally declare , it has null value , can't declare it second time
		
		if(browser.equals("Firefox"))
		{

			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			 driver=new ChromeDriver();
		}

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ggtgtth");
		driver.findElement(By.id("pass")).sendKeys("dfdfdfg");
		driver.findElement(By.id("loginbutton")).click();*/
		
		// --------- code for taking the value of browser from property file ----------
		
		WebDriver driver;
		
		FileInputStream fs=new FileInputStream("C:\\testing\\prop.properties");
		Properties prop=new Properties();
		prop.load(fs);
		
		String browser=prop.getProperty("browser");
		//System.out.println(s);
		
		if(browser.equals("Firefox"))
		{

			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ggtgtth");
		driver.findElement(By.id("pass")).sendKeys("dfdfdfg");
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
