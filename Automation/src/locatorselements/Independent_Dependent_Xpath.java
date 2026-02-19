package locatorselements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Independent_Dependent_Xpath {
public static void main(String[] args)  {
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.flipkart.com/search?q=samsung+s24+ultra&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_3_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_3_na_na_na&as-pos=2&as-type=HISTORY&suggestionId=samsung+s24+ultra%7CMobiles&requestId=d420f2c4-7b45-4632-aee8-b66cdcf3f432");
	String actualprice = driver.findElement(By.xpath("(//div[contains(text(),'Samsung Galaxy S24 Ultra')]/../../div[2]/div[1]/div/div[1])[3]")).getText();
	int price = Integer.parseInt(actualprice.replace("₹", "").replace(",", "").trim());

	 System.out.println(price);
	if( price < 100000) {
		System.out.println( actualprice +" under 1Lakhs");
	}
	else {
		System.out.println(" More than 1 Lakhs");
	}
	driver.quit();
}
}
