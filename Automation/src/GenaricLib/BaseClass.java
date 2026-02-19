package GenaricLib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Reporter.log("openBrowser",true);
	}

	@BeforeMethod
	public void login() {
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("admin123@email.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("login",true);
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("logout",true);
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
		Reporter.log("closeBrowser",true);
	}
}