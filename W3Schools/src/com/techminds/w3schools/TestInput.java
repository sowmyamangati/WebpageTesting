package com.techminds.w3schools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInput {
	public static void main(String[] args) {
		testInput();
	}

	private static void testInput() {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//chromeDriver. get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_input_text");
		chromeDriver.get("https://www.tutorialrepublic.com/snippets/preview.php?topic=bootstrap&file=simple-login-form");
WebElement fnameWebElement=chromeDriver.findElementByXPath("//input[@placeholder='Username']");
fnameWebElement.sendKeys("sowmya");

	}
}
