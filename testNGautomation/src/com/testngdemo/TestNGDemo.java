package com.testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestNGDemo {
	
	@Test
System.setProperty("webdriver.chrome.driver", "D:\\My Projects\\Automation\\drivers\\chromedriver.exe");
	
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  

}
