package method_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Clear_Method {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.id("email"));
		WebElement element2 = driver.findElement(By.id("pass"));
		element.sendKeys("Virat Kohli");Thread.sleep(2000);
		element2.sendKeys("virat@12");Thread.sleep(2000);
		element.clear();Thread.sleep(2000);
		element2.clear();
		Thread.sleep(2000);
		element.sendKeys("Rohith");Thread.sleep(2000);
		element2.sendKeys("rohith@123");
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}
