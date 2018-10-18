package com.qa.exercisebook;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class theDemoSite{
	ChromeDriver driver;
	//initialize extentreports  with a file path
	ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Githubbery\\report.html",true);
	ExtentTest test;{
	}
	@Before
	public void setup() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	@After
	public void tearDown() {
		extent.endTest(test);
		driver.quit();
		extent.flush();
	}
	@Test
	public void testy() {
		DemoSiteDDT d = new DemoSiteDDT();
		d.importExcel();
		test = extent.startTest("Create User and Login");
		driver.manage().window().maximize(); //opens window and maximise it
		String url = "http://thedemosite.co.uk/addauser.php"; //open url
		driver.get(url);
		test.log(LogStatus.INFO, "Browser Started");
		String userInput = "JakeBurling";
		String password = "password";
		TheDemoSiteCreateUser c = PageFactory.initElements(driver, TheDemoSiteCreateUser.class);
		c.CreateUser(userInput, password);
		String url2 = "http://thedemosite.co.uk/login.php";
		driver.get(url2);
		TheDemoSiteLogin b = PageFactory.initElements(driver, TheDemoSiteLogin.class);
		b.LoginUser(userInput, password);
		test.log(LogStatus.PASS, "Successful Login");
		assertEquals("error","**Successful Login**",b.getSuccess());
	}
	@Test
	public void testy2() {
		DemoSiteDDT d = new DemoSiteDDT();
		d.importExcel();
		test = extent.startTest("Create User and Login");
		driver.manage().window().maximize(); //opens window and maximise it
		String url = "http://thedemosite.co.uk/addauser.php"; //open url
		driver.get(url);
		test.log(LogStatus.INFO, "Browser Started");
		String userInput = "KatieBurling";
		String password = "password";
		TheDemoSiteCreateUser c = PageFactory.initElements(driver, TheDemoSiteCreateUser.class);
		c.CreateUser(userInput, password);
		String url2 = "http://thedemosite.co.uk/login.php";
		driver.get(url2);
		TheDemoSiteLogin b = PageFactory.initElements(driver, TheDemoSiteLogin.class);
		b.LoginUser(userInput, password);
		test.log(LogStatus.PASS, "Successful Login");
		assertEquals("error","**Successful Login**",b.getSuccess());
	}
}