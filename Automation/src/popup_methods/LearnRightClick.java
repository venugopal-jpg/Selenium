package popup_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(1000);
	driver.findElement(By.xpath("//section[text()='Button']")).click();Thread.sleep(1000);
	driver.findElement(By.linkText("Right Click")).click();
	
	WebElement rightclick = driver.findElement(By.id("btn_a"));
	Actions a =  new Actions(driver);
	a.contextClick(rightclick).perform();
	
	
	driver.findElement(By.xpath("//div[text()='No']")).click();
	
	WebElement Element = driver.findElement(By.xpath("//span[text()='You selected \"No\"']"));
	System.out.println(Element.getText());
	System.out.println(Element.getCssValue("color"));
}
}
