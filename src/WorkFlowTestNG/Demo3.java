package WorkFlowTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	
	//Execute test case for 10 times
	@Test(priority=1,invocationCount=10,enabled=true)
	public void test1()
	{
		Reporter.log("1",true);
		
	}

	//Default priority is zero
	@Test
	public void test3()
	{
		Reporter.log("Zero priority",true);
	}
	
	//If priority is less than zero
	@Test(priority=-3)
	public void test()
	{
		Reporter.log("priority is negative",true);
	}
	
	//To skip the step
	
	@Test(enabled=false)
	public void skipTest()
	{
		Reporter.log("4",true);
	}
}
