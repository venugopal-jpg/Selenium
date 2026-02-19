package LearnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JewelryModule {

	@Test()
	public void gold() {
		//Assert.fail();
		Reporter.log("Gold",true);
		
	}
	
	@Test
	public void silver() {
		Reporter.log("silver",true);
	}
	@Test
	public void diamond() {
		Reporter.log("diamond",true);
	}
}
