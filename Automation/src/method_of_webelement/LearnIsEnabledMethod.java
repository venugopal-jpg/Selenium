package method_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsEnabledMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	boolean res = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	Thread.sleep(2000);
	if (res==true) {
		System.out.println("It is Enabled");
	} else {
		System.out.println("it is not Enabled");
	}
	driver.quit();
}
}
