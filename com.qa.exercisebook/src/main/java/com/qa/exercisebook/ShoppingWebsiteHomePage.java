package com.qa.exercisebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ShoppingWebsiteHomePage {
	ChromeDriver driver;

	@FindBy(id = "search_query_top")
	private WebElement searchbar;
	
	public void searchfor(String text) {
		searchbar.sendKeys(text);
		searchbar.submit();
	}
}
