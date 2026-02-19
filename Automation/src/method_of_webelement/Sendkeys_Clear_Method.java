package method_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Clear_Method {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.id("email"));Thread.sleep(2000);
		email.sendKeys("Venu");Thread.sleep(2000);
		email.clear();Thread.sleep(2000);
		
		email.sendKeys("venna");Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.id("pass"));Thread.sleep(2000);
		pass.sendKeys("7343739@Wdc");Thread.sleep(2000);
		pass.clear(); 
		
		// clear() used to clear the text present in the textbox
		pass.sendKeys("7343739@Sandisk");Thread.sleep(2000);
		pass.clear();
		
		driver.quit();
	}

}
