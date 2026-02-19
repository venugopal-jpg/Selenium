package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SacueDemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f = new FileInputStream("./testdata/saucedemo.xlsx");Thread.sleep(2000);
		Workbook wb = WorkbookFactory.create(f);Thread.sleep(2000);
		Sheet sheet = wb.getSheet("LoginPage");Thread.sleep(2000);
		 WebDriver driver = new ChromeDriver();Thread.sleep(2000);
		String expectedurl = "inventory";Thread.sleep(2000);
		FileOutputStream f1 = new FileOutputStream("./testdata/saucedemo.xlsx");Thread.sleep(2000);
		for (int i = 1; i < 7; i++) {
			driver.get("https://www.saucedemo.com/");Thread.sleep(2000);
			driver.manage().window().maximize();Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));Thread.sleep(2000);
			String username = sheet.getRow(i).getCell(0).toString();Thread.sleep(2000);
			String password = sheet.getRow(i).getCell(1).toString();Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys(username);Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys(password);Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();Thread.sleep(2000);
			String actualurl = driver.getCurrentUrl();Thread.sleep(2000);
			if (actualurl.contains(expectedurl))
			{
				sheet.getRow(i).createCell(2).setCellValue("Login Succesfull");Thread.sleep(2000);

			} else {
				sheet.getRow(i).createCell(2).setCellValue("Login Fail");Thread.sleep(2000);
			}

			//driver.navigate().back();
			}
			wb.write(f1);
	}

}
