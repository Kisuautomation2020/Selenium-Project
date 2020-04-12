package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//18 aug-19 (Sunday) Prog-1
//check whether sortable link is present or not, switch to iframe and dragable present or not
// Program for checking web element is present or not on main page and iframe both
public class FrameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//List<WebElement> sortable=driver.findElements(By.xpath("//div[@id='sidebar']/aside/ul/li[5]"));
		List<WebElement> sortable= driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		// check in main page : sortable link is present or not
		if(sortable.size()>0)
		{
			System.out.println("Sortable Present");
		}
		else
		{
			System.out.println("Sortable not present");
		}
		
			
		// Check in main page: DragBox is present or not
		List<WebElement> dragable=driver.findElements(By.id("draggable"));
		System.out.println(dragable.size());
		

		if(dragable.size()>0)
		{
			System.out.println("Dragable Present");
		}
		else
		{
			System.out.println("Dragable not present"); // output will give 0 element because it's in ifame tag.
		}
		
		System.out.println("-------------------------------------------------------");
		
		// Code for Swtich to iframe for checking WebElement is  present or not
		
		driver.switchTo().frame(0); //because it's first frame on the page so index is 0
		//driver.switchTo().frame("demo-frame");// we can use this value only if it is id's value.
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // switch frame to WebElement: here by ClassName
		
		
		//for checking Sortable link is present or not in iframe
		sortable= driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0)
		{
			System.out.println("Sortable Present");
		}
		else
		{
			System.out.println("Sortable not present");
		}
		
		
		// for checking DragBox present or not in iframe
		dragable=driver.findElements(By.id("draggable"));
		System.out.println(dragable.size());
		

		if(dragable.size()>0)
		{
			System.out.println("Dragable Present");
		}
		else
		{
			System.out.println("Dragable not present"); // output will give 0 element because it's in irfame tag.
		}
		
		//for finish this part
		System.out.println("----------------------------------------------------------------------");
		
		driver.switchTo().defaultContent(); // for going back to main default page
		
		sortable= driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0)
		{
			System.out.println("Sortable Present");
		}
		else
		{
			System.out.println("Sortable not present");
		}
		
		dragable=driver.findElements(By.id("draggable"));
		System.out.println(dragable.size());
		

		if(dragable.size()>0)
		{
			System.out.println("Dragable Present");
		}
		else
		{
			System.out.println("Dragable not present"); // output will give 0 element because it's in irfame tag.
		}
		
		//driver.switchTo().parentFrame(); //when you want go back to frame from frame then it is applicable
	}

}
