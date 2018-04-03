package com.cyb.Scroll.PageScroll;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;*/

import org.testng.annotations.Test;


public class HorizontalScrollTest {

	WebDriver driver;
	
	@Test
	
	public void ScrollHorizontalTest(){
		
		/*DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);                
		caps.setCapability("takesScreenshot", true);  
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
		                        "src//test//resource//phantomjs.exe");
		 driver = new  PhantomJSDriver(caps);*/
		System.setProperty("webdriver.chrome.driver","src//test//resource//chromedriver.exe");
		driver=new ChromeDriver();
		
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
	 
	 WebElement element= driver.findElement(By.linkText("VBScript"));

	 js.executeScript("arguments[0].scrollIntoView()",element);
	 
		
	}
}
