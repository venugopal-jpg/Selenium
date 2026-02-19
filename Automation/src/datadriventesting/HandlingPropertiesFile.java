package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertiesFile {
public static void main(String[] args) throws IOException {
	FileInputStream f = new FileInputStream("./testdata/commondata.properties");
	Properties p = new Properties();
	p.load(f);
	String url = p.getProperty("url");
	String un = p.getProperty("un");
	String password = p.getProperty("password");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("submit")).click();
}
}
