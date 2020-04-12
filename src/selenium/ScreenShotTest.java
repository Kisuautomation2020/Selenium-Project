package selenium;
//prog-5 18 aug

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		WebDriver driver=new FirefoxDriver(); // using interface name 
		driver.get("https://www.ebay.ca/");
		
		//----- It's temporary file capture of image------
		
		//File srcFile=driver.getScreenshotAs(OutputType.FILE); // this line is for FirefoxDriver or chrome driver
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //this line is for webDriver instance
	
		//----It's keep and save temporary src file into testing folder in C: drive
		
		//FileUtils.copyFile(srcFile,  new File("C:\\Testing\\screenshot.png")); //for 
		FileUtils.copyFile(srcFile,  new File("C:\\Testing\\screenshot1.png"));
		//FileUtils.copyFile(srcFile,  new File("C:\\Testing\\screenshot2.jpg"));

	}

}
