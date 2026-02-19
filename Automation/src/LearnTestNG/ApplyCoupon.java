package LearnTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ApplyCoupon  {
@Test
	public void applyoupon() throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.className("ico-login")).click();
driver.findElement(By.id("Email")).sendKeys("venugoshetty@gmail.com");
driver.findElement(By.id("Password")).sendKeys("Rohit@123");
driver.findElement(By.className("login-button")).click();
driver.findElement(By.linkText("Computers")).click();
driver.findElement(By.linkText("Desktops")).click();
driver.findElement(By.className("product-box-add-to-cart-button")).click();
driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
driver.findElement(By.xpath("//label[text()='8 GB  [+60.00]']")).click();
driver.findElement(By.xpath("//label[text()='400 GB  [+100.00]']")).click();

 List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));

for (WebElement check : checkbox) {
	check.click();
	Thread.sleep(1000);
}

driver.findElement(By.className("add-to-cart-button")).click();
driver.findElement(By.className("cart-label")).click();Thread.sleep(2000);

WebElement countrydrop = driver.findElement(By.id("CountryId"));
Select s=new Select(countrydrop);
s.selectByVisibleText("United States");  Thread.sleep(2000);

WebElement statedrop = driver.findElement(By.id("StateProvinceId"));
Select s1=new Select(statedrop);Thread.sleep(2000);
s1.selectByVisibleText("New York");

String beforeprice = driver.findElement(By.className("order-total")).getText();
System.out.println("Before Coupon price"+beforeprice);
Thread.sleep(2000);

driver.findElement(By.className("discount-coupon-code")).sendKeys("PercentageSubtotal");Thread.sleep(2000);
driver.findElement(By.name("applydiscountcouponcode")).click();
Thread.sleep(2000);
String afterdis = driver.findElement(By.className("cart-total-right")).getText();
System.out.println("After Discount price"+afterdis);
driver.findElement(By.id("termsofservice")).click();

driver.findElement(By.id("checkout")).click();
//driver.quit();
	}

		
	
}
