package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");

		//List<WebElement> allRadio=driver.findElements(By.xpath("//input[@name='group1']"));
		List<WebElement> allRadio=driver.findElements(By.name("group1"));
		System.out.println(allRadio.size());

		/*for(int i=0;i<allRadio.size();i++)
		{
			System.out.println(allRadio.get(i).getAttribute("value"));
		}*/

		/*for(WebElement a : allRadio)
		{
			System.out.println(a.getAttribute("value")+"-----------"+a.isSelected());
		}

		
		System.out.println("-------------------------------");

		for(WebElement a : allRadio)
		{
			System.out.println(a.getAttribute("value")+"--------"+a.isSelected());
		}*/
		
	

		for(WebElement a : allRadio)
		{
			if(a.isSelected()) 
			{
				System.out.println(a.getAttribute("value")+"-----------"+a.isSelected());
			}
		}

		allRadio.get(2).click();
		System.out.println("-------------------------------");

		for(WebElement a : allRadio)
		{
			if(a.isSelected())
			{
				System.out.println(a.getAttribute("value")+"--------"+a.isSelected());
			}
		}

	}

}
