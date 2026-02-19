package handledropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.linkText("Dropdown")).click();
	
	WebElement countrycode = driver.findElement(By.id("country_code"));
	Select s1 = new Select(countrycode);
	s1.selectByIndex(3); Thread.sleep(2000);
	
	driver.findElement(By.name("ph")).sendKeys("7599330446");
	driver.findElement(By.id("male")).click();
	
	WebElement country = driver.findElement(By.id("select3"));
	Select s2 = new Select(country);
	s2.selectByValue("India");Thread.sleep(2000);
	
	WebElement state = driver.findElement(By.id("select5"));
	Select s3 = new Select(state);
	s3.selectByVisibleText("Karnataka");Thread.sleep(2000);
	
	WebElement city = driver.findElement(By.xpath("//label[text()='City']/../select"));
	Select s4 = new Select(city);
	s4.selectByValue("Kolar");Thread.sleep(2000);
	
	WebElement qty = driver.findElement(By.id("select7"));
	Select s5 = new Select(qty);
	s5.selectByIndex(1);Thread.sleep(2000);
	
	driver.findElement(By.id("continuebtn")).click();Thread.sleep(2000);
	
	driver.quit();
}
}
