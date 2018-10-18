package com.qa.cucumbers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BingSearch {
	ChromeDriver driver;
	
	@FindBy(id = "sb_form_q")
	private WebElement searchbar;

	public void searchfor(String text) {
		searchbar.sendKeys(text);
		searchbar.submit();
	}
}
