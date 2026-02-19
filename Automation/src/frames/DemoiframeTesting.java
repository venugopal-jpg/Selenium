package frames;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoiframeTesting {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
	driver.switchTo().frame(1);// Nested Frame 
	driver.switchTo().frame(0);Thread.sleep(1000);//i frame demo
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");Thread.sleep(1000);
}
}
