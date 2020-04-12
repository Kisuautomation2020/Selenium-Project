package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		/* If there is any text not written between the tag then you can 
		 	get the text by other attribute and pass the name of that attribute in
		 	getAttribute() method. [For e.g. getAttribute("placeholder")
		  */
		
		String inputValue=driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(inputValue);
		
		
		/* you can use getAttribute for getting the text  written in inputBox (Foe e.g. SearchBox)
		 by deault the "value" will pass in the getAttribute method.
		*/
		
		driver.findElement(By.id("gh-ac")).sendKeys("Shweta");
		
		String s=driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(s);
		
	
		
	}

}
