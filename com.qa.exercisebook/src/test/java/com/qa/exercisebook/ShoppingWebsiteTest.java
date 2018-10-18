package com.qa.exercisebook;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ShoppingWebsiteTest {
	ChromeDriver driver;
	boolean replaceExisting;
	// initialise extent reports with a file path
	ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Githubbery\\Report2.html", replaceExisting);
	ExtentTest test;{
	}
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
	public void testy() {
		test = extent.startTest("Open Website");
		driver.manage().window().maximize();
		String home = "http://automationpractice.com/index.php";
		driver.get(home);
		String search = "dress";
		ShoppingWebsiteHomePage a = PageFactory.initElements(driver, ShoppingWebsiteHomePage.class);
		a.searchfor(search);
		test.log(LogStatus.INFO, "Searched for item");
		ShoppingWebsiteSearchPage b = PageFactory.initElements(driver, ShoppingWebsiteSearchPage.class);
		b.ClickOn();
		boolean check = driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"))
				.isEmpty();
		test.log(LogStatus.INFO, "Item exists");
		assertEquals(false, check);
	}
}
