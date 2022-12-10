package genericLibExtentReports;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Baseclass {
	
	public static ExtentReports report=new ExtentReports();
	public static ExtentSparkReporter htmlreport=new ExtentSparkReporter("./Reports/SampleReport.html");
	
	
	@BeforeSuite
	public void confidBS()
	{
		report.attachReporter(htmlreport);
	}
	@AfterSuite
	public void configAS()
	{
		report.flush();
	}
	@BeforeMethod
	public void openApp()
	{
		
		
	}
	
	@AfterMethod
	public void closeApp(ITestResult res)
	{
		int status=res.getStatus();
		String name=res.getName().toUpperCase();
		if(status==1)
		{
			report.createTest(name).pass(name+" is passed");
		}
		else if(status==2)
		{
			report.createTest(name).fail(name+" is failed");
		}
		else if(status==3)
		{
			report.createTest(name).skip(name+" is skipped");
		}
		
		
	}

}
