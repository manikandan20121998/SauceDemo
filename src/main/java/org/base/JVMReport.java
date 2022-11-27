package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	
	public static void generateJVMReport(String json) {

		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
		Configuration con=new Configuration(loc, "SauceDemo");
		con.addClassifications("Enivironment", "QA");
		con.addClassifications("Sprint", "22");
		con.addClassifications("Platform", "Windows");
		con.addClassifications("OS", "window10");
		List<String> li=new LinkedList<String>();
		li.add(json);
		ReportBuilder rb=new ReportBuilder(li, con);
		rb.generateReports();
		
	}

}
