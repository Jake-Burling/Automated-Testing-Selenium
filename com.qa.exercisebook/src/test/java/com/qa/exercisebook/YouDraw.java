package com.qa.exercisebook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class YouDraw {
	ChromeDriver driver;
	
	@Before
	public void setup() {
	System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();		
	}
//	@After
//	public void teardown() {
//		
//	}
	@Test
	public void testy() {
		driver.manage().window().maximize();
		String url = "https://www.youidraw.com/apps/painter/";
		driver.get(url);
		Actions action = new Actions(driver);
		//change colour
		//WebElement colour = driver.findElement(By.id("color"));
		//action.moveToElement(colour).click().perform();
		//action.moveByOffset(20,20).click().perform();
		//select brush
		WebElement brush = driver.findElement(By.id("brush"));
		action.moveToElement(brush).click().perform();
		//Paint the J
		action.moveByOffset(500, 100).clickAndHold().moveByOffset(200, 0).release().perform();
		action.moveByOffset(-100,0).clickAndHold().moveByOffset(0, 100).release().perform();
		action.moveByOffset(0,0).clickAndHold().moveByOffset(-100,0).release().perform();
		//Paint the A
		action.moveByOffset(200, 0).clickAndHold().moveByOffset(100, -100).release().perform();
		action.moveByOffset(0,0).clickAndHold().moveByOffset(100, 100).release().perform();
		action.moveByOffset(-50,-50).clickAndHold().moveByOffset(-100,0).release().perform();
		//Paint the K
		action.moveByOffset(200,50).clickAndHold().moveByOffset(0,-100).release().perform();
		action.moveByOffset(0,50).clickAndHold().moveByOffset(50,-50).release().perform();
		action.moveByOffset(0,100).clickAndHold().moveByOffset(-50,-50).release().perform();
		//Paint the E
		action.moveByOffset(100,50).clickAndHold().moveByOffset(0,-100).release().perform();
		action.moveByOffset(0,0).clickAndHold().moveByOffset(40,0).release().perform();
		action.moveByOffset(-40,50).clickAndHold().moveByOffset(40,0).release().perform();
		action.moveByOffset(-40,50).clickAndHold().moveByOffset(40,0).release().perform();
	}
}