package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	public static void main(String[] args) {
		//1.HTML file to write the report
		ExtentHtmlReporter html= new ExtentHtmlReporter("./reports/reporter.html");
		//2.Log File
		ExtentReports report = new ExtentReports();
		report.attachReporter(html);
		//how to create test case
		ExtentTest testcase = report.createTest("Login Logout");
		testcase.assignAuthor("Hari");
		testcase.assignCategory("Smoke");
		testcase.pass("Test Step is passed");
		testcase.fail("TestCase is failed");	
		//copy the report from the log file --to HTML
		report.flush();
		
	}
	

}
