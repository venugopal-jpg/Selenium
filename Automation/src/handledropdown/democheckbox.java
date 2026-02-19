package handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class democheckbox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Check Box']")).click();Thread.sleep(2000);
	List<WebElement> radiobtn = driver.findElements(By.xpath("//input[@type='checkbox']"));Thread.sleep(2000);
	for (WebElement ele : radiobtn) {
		ele.click();
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.quit();
}
}
