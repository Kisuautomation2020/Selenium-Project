package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		//create object to store all values of drop down list and show the size and then print it.
		
		WebElement box= driver.findElement(By.id("gh-cat"));
		List <WebElement> allList=box.findElements(By.tagName("option")); 
		System.out.println(allList.size());
		
		for(int i=0; i<allList.size();i++)
		{
			if(allList.get(i).isSelected())
			{
			System.out.println(allList.get(i).getText()+"-----"+allList.get(i).isSelected());
			}
		}
		
		Select s=new Select(box);
		//s.selectByIndex(3);
		s.selectByValue("2984");
		//s.selectByVisibleText("Books");
		System.out.println("------------------------------------After selection---------------------------------");
		for(int i=0; i<allList.size();i++)
		{
			if(allList.get(i).isSelected()) // for only print true value or selected value
			{
			System.out.println(allList.get(i).getText()+"-----"+allList.get(i).isSelected());
			}
			
		}
		

	}

}
