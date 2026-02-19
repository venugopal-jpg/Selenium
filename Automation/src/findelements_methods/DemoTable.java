package findelements_methods;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");Thread.sleep(2000);		
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(2000);

		
		
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();Thread.sleep(2000);
		
		List<WebElement> alltable = driver.findElements(By.xpath("//th | //td"));
		
		int count = alltable.size();
		System.out.println(count);
		
		for (WebElement webElement : alltable) {
			System.out.println(webElement.getText());
		}
		driver.quit();
	}

}