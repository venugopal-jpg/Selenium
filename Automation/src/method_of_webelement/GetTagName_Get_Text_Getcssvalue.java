package method_of_webelement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

@SuppressWarnings("unused")
public class GetTagName_Get_Text_Getcssvalue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));Thread.sleep(2000);
		
		//gettagname()  is used to get the tag name of the element
		String tagname = login.getTagName();Thread.sleep(2000);
		System.out.println(tagname);Thread.sleep(2000);
		
		
		//gettext() is used to get the text of the element
		
		// if the text is not present it will retun the empty space
		
		String text = login.getText();Thread.sleep(2000);
		System.out.println(text);Thread.sleep(2000);
		
		
		//getcssvalue() is used to to get the css value of an elements(cloro,size)
		
		String bgclor = login.getCssValue("background-color");Thread.sleep(2000);
		System.out.println(bgclor);Thread.sleep(2000);
		
		//getAttribute() is used to to get 
		
		String att = login.getAttribute("class");Thread.sleep(2000);
		System.out.println(att);Thread.sleep(2000);
		
		driver.quit();
	}

}
