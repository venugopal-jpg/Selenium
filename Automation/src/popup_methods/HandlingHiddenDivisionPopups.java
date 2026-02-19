package popup_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingHiddenDivisionPopups {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.linkText("Hidden division")).click();
	driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
	driver.findElement(By.id("customerName")).sendKeys("Samprith");Thread.sleep(2000);
	driver.findElement(By.id("customerEmail")).sendKeys("samprith18@gmail.com");Thread.sleep(2000);
	WebElement product = driver.findElement(By.name("product"));Thread.sleep(2000);
	Select s = new Select(product);Thread.sleep(2000);
	s.selectByIndex(1);Thread.sleep(2000);
	driver.findElement(By.id("message")).sendKeys("This product  is very good");Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	driver.quit();
}
}
