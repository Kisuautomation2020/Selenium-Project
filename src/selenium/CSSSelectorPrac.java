package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorPrac {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/?tag=hydcaabkm-20&hvadid=75179178828849&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_844u97lkn3_e");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//How to write an WebElement by CSS using starts-withA

		
		//String value=driver.findElement(By.cssSelector(".as-title-block-left")).getText();
		//System.out.println(value);
		
		List <WebElement> allList=driver.findElements(By.cssSelector("span[class^='a']"));
		System.out.println(allList.size());
		
		for(int i=0;i<allList.size();i++)
		{
			System.out.println(allList.get(i).getText());
		}
	}

}
