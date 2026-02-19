package method_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsDisplayedMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		boolean d = driver.findElement(By.xpath("//a[@title='Flipkart Plus Zone']")).isDisplayed();
		if (d == true) {
			System.out.println("Its is displayed");
		} else {
			System.out.println("Its is not Displayed");
		}
	}
}
