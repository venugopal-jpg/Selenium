package method_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Get_Methods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver(); 
	driver.manage().window().maximize(); 
	driver.get("https://www.instagram.com/"); 
	Thread.sleep(2000); 
	WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']")); 
	//getTagName() is used to get the tag name of an element 17 
	String tagName = loginBtn.getTagName();
	System.out.println(tagName); 
	//getText() is used to get the tagText of the element 
	//If the text is not present it will return empty space 
	String text = loginBtn.getText(); 
	System.out.println(text); 
	//getAttribute(String)
	String attValue = loginBtn.getAttribute("class");
	// getAttribute is used to get Attribute value
	System.out.println(attValue); 
	String bgColor = loginBtn.getCssValue("background-color");
	// get css value is used to get css value
	System.out.println(bgColor);
	driver.quit();

}
}
