package LearnTestNG;


import org.testng.Reporter;
import org.testng.annotations.Test;


public class Instagram1 {
    @Test(priority=3)
    public void login() {
       
    	Reporter.log("user as logged",true);
    	
    }
    @Test(priority=1,invocationCount = 3,dependsOnMethods = "login")
    public void createPost() {
    	Reporter.log("user has created a post",true);
    }
    @Test(dependsOnMethods = {"login", "createPost"},invocationCount = 2)
    public void deletePost() {
    	Reporter.log("user has deleted a post",true);
    }
}
