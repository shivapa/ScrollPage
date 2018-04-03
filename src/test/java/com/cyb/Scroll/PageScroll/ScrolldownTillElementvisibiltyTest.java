package com.cyb.Scroll.PageScroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrolldownTillElementvisibiltyTest {

	WebDriver driver;

	@Test(enabled=false)

	public void ScrollTillVisibilityOfElement() {

		System.setProperty("webdriver.chrome.driver", "src//test//resource//chromedriver.exe");
		driver = new ChromeDriver();

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		//WebElement element = driver.findElement(By.xpath("//img[@src='/images/hdr_tips.gif']"));
		
		WebElement element=driver.findElement(By.linkText("Linux"));
		js.executeScript("arguments[0].scrollIntoView", element);
		
		
	}
}
