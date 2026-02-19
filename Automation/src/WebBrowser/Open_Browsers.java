package WebBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Open_Browsers {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver = new  ChromeDriver();
		
		//EdgeDriver driver1 = new EdgeDriver();
		
		
		// browser  create
		WebDriver driver = new ChromeDriver(); //upcasting 
		
		//stop the excution speed
		Thread.sleep(2000);
		
		
		//url open
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
	
		String url = driver.getTitle();
		System.out.println(url);
		
	//	System.out.println(driver.getTitle());
		
	
	
	String url1 = driver.getCurrentUrl();
	
	System.out.println(url1);
	//	System.out.println(driver.getCurrentUrl());
		
		
	
		
		
//broswer close		
driver.quit();
//driver.close();
		
		
		
	}

}
