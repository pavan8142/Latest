package org.maven.Maventest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class SeleniumTest 
{
	ExtentReports reports ;
	
	//https://github.com/pavan8142/Latest.git
	
	@Test
	public void m1()
	{
		
		String path=System.getProperty("user.dir")+"\\extent-reports\\extent-report.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		
		reporter.config().setReportName("result");
		reporter.config().setDocumentTitle("Google");
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		ExtentTest test=reports.createTest("SampleTest");
		reports.setSystemInfo("reporter", "pavan");
		System.out.println("from "+this.getClass().getName());
		test.pass("passed");
		reports.flush();
	}

}
