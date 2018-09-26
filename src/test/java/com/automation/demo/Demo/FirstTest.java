package com.automation.demo.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	

	@Test
	public void firstTest()
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\jrohi\\Downloads\\Windows_Activator\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://facebook.com");
	 System.out.println(driver.getTitle());
	 driver.quit();
	}

}
