package com.morningstar.com.SampleMaven;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Abtest1 {
	private WebDriver driver;
	private String Url1;
	private String Url2;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		Url1 = "http://www.makemytrip.com/";
		// Url2= "http://hdfcbank.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test1() throws Exception {
		driver.get(Url1);
		/*
		 * driver.findElement(By.xpath(
		 * "//a[@id='chf_mtr']//span[@class='new_red_text']//Strong")).click();
		 * 
		 * Thread.sleep(3000); String parentHandle = driver.getWindowHandle();
		 * Set<String> handlles = driver.getWindowHandles();
		 * 
		 * for (String handle: handlles) { if(!handle.equals(parentHandle)) {
		 * driver.switchTo().window(handle); driver.findElement(By.xpath(
		 * ".//*[@id='bannerArea']//div[@class='ghostBtn']//a")).click();
		 * //driver.findElement(By.xpath(".//*[@id='login_btn']")).click();
		 * driver.switchTo().defaultContent();
		 * 
		 * }
		 * 
		 * }
		 */ driver.findElement(By.xpath(".//*[@id='start_date_sec']")).click();
String DesiredMonth = "March";
		String month = driver
				.findElement(By
						.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']"))
				.getText();

		System.out.println("month =" + month);
		//boolean b1 = (!month.equalsIgnoreCase(DesiredMonth));
	//	System.out.println("bbbb   "+b1);
		while (!month.equalsIgnoreCase(DesiredMonth)){
			driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']//div//a//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			 month = driver
					.findElement(By
							.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//span[@class='ui-datepicker-month']"))
					.getText();

			Thread.sleep(5000);
			
			}
		//	break;
		}


	

	@After
	public void tearDown() throws Exception {
		//driver.close();
		driver.quit();
	}
}