package handledropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MulitSelect {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/hp/Desktop/Players.html");
	Thread.sleep(2000);	
	WebElement players = driver.findElement(By.id("players"));Thread.sleep(2000);	
	Select s =new Select(players);Thread.sleep(2000);	
	// select Methods
	s.selectByIndex(0);Thread.sleep(2000);	
	s.selectByValue("1");Thread.sleep(2000);	
	s.selectByVisibleText("Rahul");Thread.sleep(2000);	
	s.selectByContainsVisibleText("Pat");Thread.sleep(2000);	

	
	// deseclt methods
s.deselectByIndex(0);Thread.sleep(2000);	
s.deselectByValue("1");Thread.sleep(2000);	
s.deselectByVisibleText("Rahul");Thread.sleep(2000);	
s.deSelectByContainsVisibleText("Pat");Thread.sleep(2000);	
driver.quit();
	}

}
