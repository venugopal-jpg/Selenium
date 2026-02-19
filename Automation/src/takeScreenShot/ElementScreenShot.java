package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();  //open the Browser 

        driver.manage().window().maximize(); //maximize browser window 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.royalchallengers.com/");//open the url
       WebElement rcb = driver.findElement(By.xpath("//h4[text()='#Playbold']/preceding-sibling::a/img"));
      File scr = rcb.getScreenshotAs(OutputType.FILE);
      
      File dest = new File("./Screenshot/rcb.jpg");
      
      FileHandler.copy(scr, dest);
      Thread.sleep(2000);
      driver.quit();

	}

}
