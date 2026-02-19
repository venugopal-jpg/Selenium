package popup_methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	driver.findElement(By.linkText("Drag & Drop")).click();
	driver.findElement(By.linkText("Drag Position")).click();
	List<WebElement> accessories = driver.findElements(By.xpath("//div[text()='Accessories']/../div/div"));
	WebElement mobileaccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
	WebElement laptopaccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));
	Actions a = new Actions(driver);
	for (WebElement webElement : accessories) {
	  String text = webElement.getText();
	  if(text.contains("Mobile")) {
		  a.clickAndHold(webElement).moveToElement(mobileaccessories).release().build().perform();
	  }
	  else if (text.contains("Laptop"))
	  {
		a.dragAndDrop(webElement, laptopaccessories).perform();
	}
	}
	
}
}
