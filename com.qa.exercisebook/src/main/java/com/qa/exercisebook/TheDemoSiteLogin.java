package com.qa.exercisebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheDemoSiteLogin {
	@FindBy(name = "username")
	private WebElement userId;
	@FindBy(name = "password")
	private WebElement passId;
	@FindBy(name = "FormsButton2")
	private WebElement btn;
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	private WebElement success;
	
	
	public void LoginUser(String text1, String text2) {
		userId.sendKeys(text1);
		passId.sendKeys(text2);
		btn.submit();
	}
	public String getSuccess() {
		return success.getText();
	}
}
