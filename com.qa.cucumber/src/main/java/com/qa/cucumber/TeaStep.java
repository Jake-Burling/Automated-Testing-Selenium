package com.qa.cucumber;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TeaStep {
	WebDriver driver;
	boolean replaceExisting;
	ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Githubbery\\CucumberTeaReport.html",replaceExisting);
	ExtentTest test;
	TeaConstants a = new TeaConstants();

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

	@Given("^the correct web address$")
	public void the_correct_web_address() {
	    // Write code here that turns the phrase above into concrete actions
			test = extent.startTest("Beginning Scenario Check");
			driver.manage().window().maximize();
			driver.get(a.URL);
			test.log(LogStatus.PASS, "Opening Correct Web Address");
			assertEquals("http://www.practiceselenium.com/welcome.html",driver.getCurrentUrl());
	}
	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() {
	    // Write code here that turns the phrase above into concrete actions
		Actions action = new Actions(driver);
	    	WebElement menuBtn = driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
	    	action.moveToElement(menuBtn).click().perform();
	    	test.log(LogStatus.PASS, "Navigate to Menu");
	    	assertEquals("http://www.practiceselenium.com/menu.html",driver.getCurrentUrl());
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
	    // Write code here that turns the phrase above into concrete actions
		boolean presence = driver.findElements(By.id("wsb-element-00000000-0000-0000-0000-000453230000")).isEmpty();
		test.log(LogStatus.PASS, "Can browse menu");
		assertEquals(false, presence);
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {
		Actions action = new Actions(driver);
		driver.get(a.URL2);
		WebElement checkout = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000451955160"));
		action.moveToElement(checkout).click().perform();
		test.log(LogStatus.PASS, "Cliked the checkout button");
		assertEquals("http://www.practiceselenium.com/check-out.html",driver.getCurrentUrl());
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
		test.log(LogStatus.PASS,"Taken to checkout page");
		assertEquals("http://www.practiceselenium.com/check-out.html",driver.getCurrentUrl());
	}
}