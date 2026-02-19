package method_of_webelement;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyntraEndToEndTest {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	
	String parentid = driver.getWindowHandle(); 
	System.out.println(parentid);
	
	WebElement men = driver.findElement(By.className("desktop-main"));
	Actions a = new Actions(driver);
	Thread.sleep(2000);
	a.moveToElement(men).perform();
	
	driver.findElement(By.xpath("//a[text()='Sneakers']")).click();
	
	List<WebElement> brands = driver.findElements(By.xpath("//span[text()='Brand']/../ul/li/label"));
	
        for (WebElement brand : brands) {
            brand.click();
            Thread.sleep(2000);
        }
        
     WebElement slider = driver.findElement(By.id("rootRailThumbRight"));
     
     a.dragAndDropBy(slider, -100, 0).perform();Thread.sleep(2000);
     
	WebElement page = driver.findElement(By.xpath("//li[text()='Page 1']"));
	
	a.scrollToElement(page).perform();Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//div[@class='product-imageSliderContainer'])[last()]")).click();
	Thread.sleep(2000);
	Set<String> allwid = driver.getWindowHandles();
	
	for (String wid : allwid) {
		System.out.println(wid);
		if(!parentid.contains(wid)) {
			driver.switchTo().window(wid);
			boolean res = driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).isEnabled();
			if (res == true) {
				System.out.println("Its is Enabled");
			}
			else {
				System.out.println("Its is not Enable");
			}
		}
	}
}
}
