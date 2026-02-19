package method_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsSelectedMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	boolean s = driver.findElement(By.id("monday")).isSelected();
	if (s== false) {
	System.out.println(" Its is not selected ");
	} else {
		System.out.println(" Its is selected ");

	}
}
}
