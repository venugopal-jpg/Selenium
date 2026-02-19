package methods_of_webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();Thread.sleep(2000);
	driver.get("https://www.google.com/");Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("QSpiders");Thread.sleep(2000);
	List<WebElement> allqsuggus = driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));Thread.sleep(2000);
	int count = allqsuggus.size();
	System.out.println(count);
	for (WebElement ele : allqsuggus) {  						  //for(int i=0; i<count;i++) {
															       	//	WebElement ele = allqsuggus.get(i);
																	//System.out.println(ele.getText());
		System.out.println(ele.getText());
	}
	driver.quit();
}

}
