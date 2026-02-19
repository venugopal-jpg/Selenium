package LearnTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sauceDemo {
	@Test
	public void OpenBLogin() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Eren");
		driver.findElement(By.id("last-name")).sendKeys("Yeager");
		driver.findElement(By.id("postal-code")).sendKeys("56014");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		String ExpectedResult = "Thank you for your orde!";
	    String acutalResult = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']")).getText();
	    Assert.assertEquals(acutalResult, ExpectedResult);
	    
	    driver.quit();

}
	}
