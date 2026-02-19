package locatorselements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Element {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/sampr/Downloads/Links.html");
		driver.manage().window().maximize();
		
		WebElement fblink1 = driver.findElement(By.tagName("a"));
		fblink1.click();
		driver.navigate().back();
		WebElement instatlink1 = driver.findElement(By.id("link2"));
		instatlink1.click();
		driver.navigate().back();
		WebElement fblink2 = driver.findElement(By.className("facebook_link"));
		fblink2.click();
		driver.navigate().back();
		WebElement instalink2 = driver.findElement(By.name("Instagram"));
		instalink2.click();	
		driver.navigate().back();
		WebElement fblink3 =driver.findElement(By.linkText("facebook"));
		fblink3.click();
		driver.navigate().back();
		WebElement instalink3 = driver.findElement(By.partialLinkText("Insta"));
		instalink3.click();	
		driver.navigate().back();
		
}
}
