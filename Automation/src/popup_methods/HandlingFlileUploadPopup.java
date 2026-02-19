package popup_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFlileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/sampr/Downloads/my%20report/resumefilehtml.html");
		Thread.sleep(2000);
		driver.findElement(By.id("upload_resume")).sendKeys("C:\\Users\\sampr\\Downloads\\zenitsu-agatsuma-5120x2880-22696.png");
}
}