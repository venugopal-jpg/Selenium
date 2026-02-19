package locatorselements;

import java.lang.annotation.ElementType;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); Thread.sleep(2000);
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("file:///C:/Users/hp/Documents/Demo.html");Thread.sleep(2000);
		
		//locators by tagname
		
		WebElement element= driver.findElement(By.tagName("a"));Thread.sleep(2000);
		element.click();Thread.sleep(2000);
		driver.navigate().back();Thread.sleep(2000);
		
		//locators by id
		
		WebElement element2 =driver.findElement(By.id("link2"));Thread.sleep(2000);
		element2.click();Thread.sleep(2000);
		
		
		//locators by name 
		WebElement element3=driver.findElement(By.name("facebook"));Thread.sleep(2000);
		element3.click();Thread.sleep(2000);
		
		
		// locators by className
		WebElement element4=driver.findElement(By.className("Instagram_link"));Thread.sleep(2000);
		element4.click(); Thread.sleep(2000);
		
		
		// locators by linktext
		WebElement element5=driver.findElement(By.linkText("facebook"));Thread.sleep(2000);
		element5.click();Thread.sleep(2000);
		driver.navigate().back();Thread.sleep(2000);
		
		
		// locators by partial linktext 
		
		WebElement element6=driver.findElement(By.partialLinkText("Insta"));Thread.sleep(2000);
		element6.click();Thread.sleep(2000);
		driver.navigate().back();Thread.sleep(2000);
		
		
		driver.quit();

	}

}
