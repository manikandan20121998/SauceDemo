package org.stepdefinition;

import org.base.BaseClass;
import org.base.Cucumber_ExtendReport;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	@Before()
	public void beforeScenario() {

		System.out.println("............BeforeScenario........");
		 chromebrowser();
		 urllaunch("https://saucedemo.com/");
         maximize();
        implicitywait(20);
		
	}
	
	@After()
	public void AfterScenario(Scenario sc) {
System.out.println("After scenario.............");
		//String name = sc.getName();
		
		if (sc.isFailed()) {
			
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] bt = tk.getScreenshotAs(OutputType.BYTES);
			sc.embed(bt, "image/png");
		}
		
		Cucumber_ExtendReport.createTestLog(sc);
		
	}
	
	
	
	
	
}
