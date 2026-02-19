package locatorselements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributes {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/sampr/Downloads/xpath.html");
	driver.findElement(By.xpath("//input[@type='text' and @value='A']"));							//T1
	driver.findElement(By.xpath("//input[@type='text' and @value='B']"));							//T2
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='button'and @value='A']"));							//B1
	Thread.sleep(2000);		
	driver.findElement(By.xpath("//input[@value='A']"));											//B2
	driver.findElement(By.xpath("//input[@value='B']"));                                            //T1,B1
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='A' or @checked]"));								//T1,B1,C1
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='B' or not(@checked) and @type='checkbox']"));		//T2,B2,C2
	Thread.sleep(2000);
    driver.quit();
	
}
}
