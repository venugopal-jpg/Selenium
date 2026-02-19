package frames;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class YoutubeFrames {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();Thread.sleep(2000);
		WebElement app = driver.findElement(By.xpath("//iframe[@name='app']"));Thread.sleep(2000);
		driver.switchTo().frame(app);Thread.sleep(2000);
		
		WebElement ymusic = driver.findElement(By.xpath("//span[text()='YouTube Muisc']"));Thread.sleep(2000);
		
	Actions a = new Actions(driver);
		
a.contextClick(ymusic).perform();

Robot r = new Robot();

r.keyPress(KeyEvent.VK_T);
Set<String> allwid = driver.getWindowHandles();

for (String wid : allwid) {
	driver.switchTo().window(wid);Thread.sleep(2000);
	
	if(driver.getTitle().contains("music"))
		break;
}


driver.findElement(By.xpath("//input[@id='input'")).sendKeys("malla"+Keys.ENTER);Thread.sleep(2000);
driver.quit();




		
		

	}

}
