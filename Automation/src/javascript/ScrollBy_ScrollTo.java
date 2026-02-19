package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScrollBy_ScrollTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(2000);
 Point scroll = driver.findElement(By.xpath("//div[text()='FOLLOW US ON']")).getLocation();
 
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy"+ scroll);


	}

}
