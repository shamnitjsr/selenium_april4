package com.ibm.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Facbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver",
		 "D:\\selenium_setupfile\\chromedriver_win32\\chromedriver.exe"); WebDriver
		  driver=new ChromeDriver();
		 

		/*
		System.setProperty("webdriver.gecko.driver",
				"D:\\selenium_setupfile\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		//geckodriver version 24 and firefox (Version:	64.0-beta-8)

		WebDriver driver = new FirefoxDriver();
		*/

		/*System.setProperty("webdriver.ie.driver",
				"D:\\\\MicrosoftWebDriver.exe");

		WebDriver driver = new InternetExplorerDriver();*/
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.close();

	}

}
