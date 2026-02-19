package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeQspiders {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Frames']")).click();
	driver.findElement(By.linkText("iframes")).click();
	driver.findElement(By.linkText("Nested iframe")).click();
	Thread.sleep(1000);
	driver.switchTo().frame(0);Thread.sleep(1000);
	String email = driver.findElement(By.xpath("//p[text()='Default Email']/../p[2]")).getText();Thread.sleep(1000);
	System.out.println(email);
	driver.switchTo().frame(0);
	Thread.sleep(1000);
	driver.findElement(By.id("email")).sendKeys(email);
	Thread.sleep(1000);
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	
	String password = driver.findElement(By.xpath("//p[text()='Default Password']/../p[4]")).getText();Thread.sleep(1000);
	driver.switchTo().frame(0);Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys(password);
	Thread.sleep(1000);
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	String confrimpassword = driver.findElement(By.xpath("//p[text()='Default Confirm Password']/../p[6]")).getText();
	Thread.sleep(1000);
	driver.switchTo().frame(0);Thread.sleep(1000);
	driver.findElement(By.id("confirm-password")).sendKeys(confrimpassword);Thread.sleep(1000);
	driver.findElement(By.id("submitButton")).click();
	
}
}
