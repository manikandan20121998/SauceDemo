package org.testrunner;

import org.base.Cucumber_ExtendReport;
import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
monochrome=true,
tags="@E2E",
glue="org.stepdefinition",dryRun=false,
plugin= {"pretty:pretty.txt",
        "junit:src\\test\\resources\\Reports\\JunitReport\\junitrep.xml",
        "json:src\\test\\resources\\Reports\\Jsonreport\\jsonrep.json",
        "html:src\\test\\resources\\Reports\\html",
        "rerun:src\\test\\resources\\Reports\\failed\\failedscensrios.txt"})



public class TestRunnerSauceDemo {
	
	@BeforeClass
	public static void before() {

		Cucumber_ExtendReport.startReport("C:\\Users\\MANI MADDY\\eclipse-workspace\\SauceDemo\\src\\test\\resources\\Reports\\ExtentReport\\extent.html");	
	}
	
	
	
	@AfterClass
	public static void reportofJVMRepExtentRep() {

		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\Jsonreport\\jsonrep.json");
		System.out.println("Done............");
		Cucumber_ExtendReport.endReport();
		System.out.println("Done........Extend");
	}

}
