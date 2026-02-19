package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWebShopShoe {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin123@email.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.className("login-button")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));
		
		
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		 driver.findElement(By.linkText("Blue and green Sneaker")).click();
		 WebElement shoe = driver.findElement(By.id("product_attribute_28_7_10"));
		
		Select  s=new Select(shoe);
		s.selectByIndex(3);
		
		driver.findElement(By.xpath("(//span[@class='color'])[3]"));
		
		driver.findElement(By.id("add-to-wishlist-button-28")).click();
		String text = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
		
		System.out.println(text);
		Thread.sleep(10);	
		
		
		
		driver.findElement(By.className("cart-label")).click();
	
		
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='Updatecart'][1]")).click();
		driver.findElement(By.className("ico-logout")).click();
		
		
		driver.quit();
		
		
		

	}

}
