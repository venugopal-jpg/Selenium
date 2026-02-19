package LearnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class instagram {
	
   @Test
public void demoA(){
	Reporter.log("hello world",true);
	
	}
   
      @Test
      public void demoB() {
    	Reporter.log("hii world",true);
    	
    	 
      }
    @Test
    public void demoC() {
    	System.out.println("bye world");
    }
}
