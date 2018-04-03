package com.cyb.Scroll.PageScroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ScrolldownTest {

 WebDriver driver;
 @Test(enabled=false)
public void PageScrollDown(){

	System.setProperty("webdriver.chrome.driver", "src//test//resource//chromedriver.exe");
	driver=new ChromeDriver();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.get("http://demo.guru99.com/test/guru99home/");
      driver.manage().window().maximize();
      

	js.executeScript("window.scrollBy(0,1000)");

}

}
