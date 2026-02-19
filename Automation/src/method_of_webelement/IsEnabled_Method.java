package method_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.adactin.com/HotelApp/index.php");Thread.sleep(2000);
		
		boolean res = driver.findElement(By.id("username")).isEnabled();
		System.out.println(res);
		
		if (res==true) {
			System.out.println("It is Enabled");
		} else {
			System.out.println("it is not Enabled");
		}
		driver.quit();
		

	}

}
