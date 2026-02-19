package popup_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClassPrintPopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver = new  FirefoxDriver();
	driver.get("https://www.selenium.dev/downloads/");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_1);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_MINUS);
	r.keyPress(KeyEvent.VK_2);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_S);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
}
}
