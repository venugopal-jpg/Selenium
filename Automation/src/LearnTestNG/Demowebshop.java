package LearnTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demowebshop {
	@Test
	public void fashionModule() {
		Reporter.log("shoes",true);
		
	}@Test
	public void jeans() {
		Reporter.log("jeans",true);
		
		
	}@Test
	public void shirt() {
		Reporter.log("shirt",true);
	}

}
