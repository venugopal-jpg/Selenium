package popup_methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LearnNotificationpopup {
public static void main(String[] args) {
	EdgeOptions options = new EdgeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new EdgeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
}
}
