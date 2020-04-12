package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTableTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(rows.size());
		
		for(int i=1; i<rows.size();i++)
		{
			List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
			System.out.println(col.size());
		
			for(int j=0;j<col.size();j++)
			{
				System.out.println(col.get(j).getText()+ " | ");
			}
			
			//System.out.println();

	}}

}
