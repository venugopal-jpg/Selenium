package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FaceBookScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();  //open the Browser 

        driver.manage().window().maximize(); //maximize browser window

        driver.get("https://www.facebook.com/");//open the url
        Thread.sleep(2000);
        
        
        TakesScreenshot ts= (TakesScreenshot)driver;
       File source = ts.getScreenshotAs(OutputType.FILE);
       
      File dest = new File("./Screenshot/iamage.jpg");
Files.copy(source,dest );
driver.quit();

	}

}
