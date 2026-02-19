package popup_methods;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowCloseOne {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.linkText("Browser Windows")).click();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		Thread.sleep(2000);
		Set<String> allwid = driver.getWindowHandles();
		Iterator<String> i = allwid.iterator();
		while (i.hasNext()) {
			String string = (String) i.next();
			WebDriver mobile = driver.switchTo().window(string);
			String title = mobile.getTitle();
			if(title.contains("Mobile Phone")) {
				driver.close();
			}
		}
}
}

