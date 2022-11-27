package org.base;
import com.aventstack.extentreports.ExtentReports;
import io.cucumber.core.api.Scenario;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.cucumber.core.event.Status;
public class Cucumber_ExtendReport {
	 static ExtentHtmlReporter htmlreport;
	 static ExtentReports report;
	public static void startReport(String loc) {
      //where you want to store the report
		htmlreport=new ExtentHtmlReporter(loc);
		//basic config about your report
		htmlreport.config().setDocumentTitle("SauceDemo");
		htmlreport.config().setReportName("SauceDemo Login");
		htmlreport.config().setTheme(Theme.DARK);
		//Attach the config to the report generation
		report=new ExtentReports();
		report.attachReporter(htmlreport);
		//some details about ur project
		report.setSystemInfo("BrowserName", "Chrome");
		report.setSystemInfo("Browser version","107");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Sprint", "20");	
	}
	public static  void createTestLog(Scenario r) {
       String name = r.getName();
       Status status = r.getStatus();
       switch (status) {
       case PASSED:
       report.createTest(name).pass("Test Case Passed");
       break;
       case FAILED:
    	   report.createTest(name).fail("Test case failed");
    	   break;	   
       default:
    	   report.createTest(name).skip("Test case Skipped");
    	   break;
       }	
	}
	public static void endReport() {

		report.flush();
	}
	
}
