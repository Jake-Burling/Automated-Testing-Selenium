package com.qa.exercisebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingWebsiteSearchPage {

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement clothing;
	
	public void ClickOn() {
		clothing.click();
	}
}
