package scripts;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibExtentReports.Baseclass;

public class Test1 extends Baseclass {
	
	
	@Test
	public void tc1()
	{
		
		Reporter.log("TC1",true);
		
		
	}
	
	

}
