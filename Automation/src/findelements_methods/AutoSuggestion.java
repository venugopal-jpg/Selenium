package findelements_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");Thread.sleep(2000);		
		List<WebElement> allsugess = driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
		
		int count = allsugess.size();
		System.out.println(count);Thread.sleep(2000);
		
		for (WebElement ele : allsugess) {
			
			String text = ele.getText();
			System.out.println(text);
		}
	
	driver.quit();
	}
	

}
