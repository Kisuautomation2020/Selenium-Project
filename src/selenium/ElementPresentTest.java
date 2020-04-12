
package selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//always use List<WebElement> for checking web element present or not
		// If you use WebElement for it then it gives exception error: unable to locate element
		List<WebElement> element=driver.findElementsByLinkText("About");
		System.out.println(element.size());
		
		
		if(element.size()>0)
		{
			System.out.println("Element Present");
		}
		else
		{
			System.out.println("Element not Present");
		}
	}

}
