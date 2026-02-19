package LearnTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenaricLib.BaseClass;
@Listeners(GenaricLib.ListenersImplementation.class)
public class Books extends BaseClass {
	@Test
	public void kgf1() {
		Assert.fail();
		Reporter.log("kgf1",true);
		
	}@Test
	public void kgf2() {
		Reporter.log("kgf2",true);
		
		
	}@Test(dependsOnMethods  = "kgf1")
	public void toxic() {
		Reporter.log("toxic",true);
	}
}
