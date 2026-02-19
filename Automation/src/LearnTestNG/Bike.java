package LearnTestNG;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bike {
	
	@Test(enabled = false)
	public void ather() {
		
		//Assert.fail();
		Reporter.log("Rizta",true);
	}
	
	@Test
	public void ola() {
		Reporter.log("ola s1 pro",true);
	}
	@Test
	public void tvs() {
		Reporter.log("iqube",true);
	}

}
