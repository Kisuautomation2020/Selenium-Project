package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//18 aug: prog-6
public class JavaScriptExecuterClassTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		//click on registration link using scroll down method of selenium: JavaScriptExcutor class
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;  // this is object type casting , variable type casting is different 
		//jse.executeScript("window.scrollBy(0,1000)", ""); // syntax: jse.executeScript(Script,Arguments);
		//jse.executeScript("window.scrollBy(0,1000)"); //here arguments is optional
		// x-axis and y-axis pixels
		
		WebElement a =driver.findElement(By.linkText("Registration"));
		System.out.println(a.getLocation());
		
		
		jse.executeScript("arguments[0].scrollIntoView(true);", a); //interview question
		 
	}

}
