package popup_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hidden_Popup_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();Thread.sleep(2000);
		driver.findElement(By.id("customerName")).sendKeys("Venu");Thread.sleep(2000);
		driver.findElement(By.id("customerEmail")).sendKeys("venugoshetty@gmail.com");Thread.sleep(2000);
		WebElement product = driver.findElement(By.id("prod"));Thread.sleep(2000);
		
		Select s=new Select(product);Thread.sleep(2000);
		s.selectByIndex(1);Thread.sleep(2000);
		
		driver.findElement(By.id("message")).sendKeys("nice product");Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.quit();
	}

}
