package method_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("passContainer"));
		//getSixe() is used to get the size(height,and width) of the element
		
		Dimension d = email.getSize();   int h1=d.getHeight();   int w1 = d.getWidth();
		
		
		//getLocation() is used to get the location(X-axis and Y-axis) of the element
		Point p = email.getLocation();   int x1 = p.getX();  int y1 = p.getY();
		
		Dimension d1 = pass.getSize(); int h2 = d1.getHeight();   int w2 = d1.getWidth();
		
		Point p1 = pass.getLocation(); int x2 = p1.getX();     int y2 = p1.getY();
		
		System.out.println("Heigth of email elements"+ " "+ h1+ ":pixels");
		System.out.println("Heigth of pass elements"+ " "+ h2+ ":pixels");
		System.out.println("width of email elements"+" "+ w1);
		System.out.println("width of pass elements"+" "+ w2);
		
		System.out.println("X-axis of email elements:"+" " + x1);
		System.out.println("X-axis of pass elements:"+ " "+ x2);
		System.out.println("Y-axis of email elements:"+ " "+ y1);
		System.out.println("Y-axis of pass elements:"+ " "+ y2);
		
		if(h1==h2 && w1==w2) 
		{
			System.out.println("its a same aligmnet");
		}
		else {
			System.out.println("its not a same aligmnet");
		}
		
		if(x1==x2) {
			System.out.println("its a same aligmnet");
		}
		
		else {
			System.out.println("its  not a same aligmnet");
		}
		driver.quit();
	}

}
