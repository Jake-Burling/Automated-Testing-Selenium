package com.qa.exercisebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static org.junit.Assert.*;

import org.junit.*;

public class WaitTest {
	WebDriver driver;
	ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Githubbery\\ihateyou.html",true);
	ExtentTest test;
	

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		extent.endTest(test);
		driver.quit();
		extent.flush();
	}

	@Test
	public void testy() throws InterruptedException {
		driver.manage().window().maximize();
		test = extent.startTest("Wait for change");
		String url = "https://chrisperrins95.github.io/AutomatedTestingExample/";
		driver.get(url);
		test.log(LogStatus.INFO, "Browser Started");
		WaitPage a = PageFactory.initElements(driver, WaitPage.class);
		System.out.println(a.time(driver).getText());
		if(a.time(driver).getText().equals("I HATE YOU!")) {
			test.log(LogStatus.PASS, "Element Found");
		}
		else {
			test.log(LogStatus.FAIL, "Element Failed");
			fail();
		}
	}
}
