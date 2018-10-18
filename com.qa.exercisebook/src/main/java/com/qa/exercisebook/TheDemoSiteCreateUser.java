package com.qa.exercisebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheDemoSiteCreateUser {
	@FindBy(name = "username")
	private WebElement userId;
	@FindBy(name = "password")
	private WebElement passId;
	@FindBy(name = "FormsButton2")
	private WebElement btn;
	
	public void CreateUser(String text1,String text2) {
		userId.sendKeys(text1);
		passId.sendKeys(text2);
		btn.submit();
	}
}