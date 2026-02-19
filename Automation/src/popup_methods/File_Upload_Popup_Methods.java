package popup_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Popup_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/hp/Desktop/Resum1.html");Thread.sleep(2000);
		
		driver.findElement(By.id("upload_resume")).sendKeys("C:\\Users\\hp\\Downloads\\Venugopal V_Resume.docx");Thread.sleep(2000);
		
		driver.quit();
		

	}

}
