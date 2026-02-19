package popup_methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.linkText("Javascript")).click();
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for (WebElement ele : checkbox) {
		ele.click();
	}
	driver.findElement(By.id("deleteButton")).click();
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	driver.quit();
}
}
