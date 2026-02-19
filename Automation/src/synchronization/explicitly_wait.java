package synchronization;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class explicitly_wait {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.xpath("//span[text()='Leave']")).click();
wait.until(ExpectedConditions.urlContains("leave"));
String url = driver.getCurrentUrl();
System.out.println(url);

driver.findElement(By.className("oxd-userdropdown-tab")).click();
driver.findElement(By.className("oxd-userdropdown-link")).click();
driver.quit();
	}

}
