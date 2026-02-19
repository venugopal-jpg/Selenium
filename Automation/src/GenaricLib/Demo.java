package GenaricLib;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws IOException {
		FileLib fl = new FileLib();
		String Url = fl.readPropertiesFile("url");
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		String un = fl.readPropertiesFile("un");
		driver.findElement(By.id("username")).sendKeys(un);
		String pwd = fl.readPropertiesFile("password");
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("submit")).click();
		String items = fl.readExcelFile("searchProduct", 1, 2);
		System.out.println(items);

	}

}
