package PomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//Declartion

	private WebElement emailTbx;
	private WebElement pwdTbx; 
    private WebElement loginBtn; 
    
    //initiliztion
     public LoginPage(WebDriver driver) {
    	
    emailTbx = driver.findElement(By.id("Emil"));
    
    pwdTbx=driver.findElement(By.id("Password"));
    
    loginBtn=driver.findElement(By.className("login-button"));
    }
    
    
    //utiliztion
    public void setlogin(String email,String pwd) {
    	emailTbx.sendKeys(email);
    	pwdTbx.sendKeys(email);
    	loginBtn.click();
    	
    }
    
}
