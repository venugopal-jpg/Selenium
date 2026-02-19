package methods_of_webdrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class UseageOfGet {
public static void main(String[] args) throws InterruptedException   {
	ChromeDriver driver = new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://www.instagram.com/");
	 String title = driver.getTitle();
	 String expUrl = "https://www.instagram.com/";
	
	 //System.out.println(driver.getTitle()); /code optimization
	 
	
	System.out.println(title);

	
	String url = driver.getCurrentUrl();
	
	
	System.out.println(url); 
	
	if (expUrl.equals(url)) {
		System.out.println("url match:"+expUrl);
		
	}
	else {
		System.out.println("not found url:"+expUrl);
	}
	
	
//System.out.println(driver.getCurrentUrl());   /code optimization
	Thread.sleep(1000);
	driver.close();
	
	
}
}
