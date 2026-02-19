package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Yatra {

	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream f = new FileInputStream("./testdata/Yatra.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		Sheet sheet = wb.getSheet("Sheet1");
		FileOutputStream f1 = new FileOutputStream("./testdata/Yatra.xlsx");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("(//img[@alt=\"cross\"])[1]")).click();
		driver.findElement(By.xpath("//p[text()='Departure From']/following-sibling::p[1]")).click();
		driver.findElement(By.id("input-with-icon-adornment")).sendKeys("Bangalore");Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//p[text()='Going To']/following-sibling::p[1]")).click();
		driver.findElement(By.id("input-with-icon-adornment")).sendKeys("Dubai");Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Dubai']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Departure Date inputbox']")).click();
		driver.findElement(By.xpath("//div[@class=\"react-datepicker__week\"][5]/child::div[1]/span[text()='26']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(25000);
		for (int i = 1; i <= 31; i++) {
			Actions a = new Actions(driver);
			a.scrollByAmount(0, 5000).perform();
		}
		List<WebElement> flights = driver.findElements(By.xpath("//div[contains(@class,'airline-name')]//span"));Thread.sleep(1000);
		List<WebElement> prices = driver.findElements(By.xpath("//div[contains(@class,'booking-section')]/child::div[3]/p"));
		Thread.sleep(1000);
		for (int i = 1; i < flights.size(); i++) {
		    String flightname = flights.get(i).getText();
		    String price = prices.get(i).getText();
		    System.out.println(flightname + ":"+price);
		    sheet.createRow(i).createCell(0).setCellValue(flightname);
		    sheet.getRow(i).createCell(1).setCellValue(price);
		}
		wb.write(f1);
		driver.quit();

		
	}

}
