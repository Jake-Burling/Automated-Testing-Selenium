package com.qa.exercisebook;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPage {

	@FindBy(id = "QALogo")
	private WebElement logo;
	@FindBy(id = "quote")
	private WebElement quote;
	
	public WebElement time(WebDriver driver) {
		WebElement timer = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"shafeeq\"]/h1")));
		return timer;
	}
}
