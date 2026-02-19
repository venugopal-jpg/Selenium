package findelements_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int count = allLinks.size();
		System.out.println(count);
		
	/*	for (int i=0;i<count;i++)  // Acensding order
		{
			// we need to access one elements address from the list  using get(int index) / forEach
			
			
			WebElement ele = allLinks.get(i);
			
			// in order to print the text we should use getText() or else it will print address
			
			String text = ele.getText();
			System.out.println(text);
			
		}*/
		
		for (int i=count-1;i>=0;i--) // descendiing order
		{
			// we need to access one elements address from the list  using get(int index) / forEach
			
			
			WebElement ele = allLinks.get(i);
			
			// in order to print the text we should use getText() or else it will print address
			
			String text = ele.getText();
			System.out.println(text);
			
		}
	driver.quit();	
	}

}
