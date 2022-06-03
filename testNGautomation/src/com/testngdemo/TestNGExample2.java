package com.testngdemo;

import org.openqa.selenium.WebDriver;

	@Test
	
	void OpenBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\My Projects\\Automation\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String inputUrl="https://www.amazon.in/";
		
		String currentUrl=driver.getCurrentUrl();
		
		Assert.assertEquals(currentUrl, inputUrl);
	}
	

}
