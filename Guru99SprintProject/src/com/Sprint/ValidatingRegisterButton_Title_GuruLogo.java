package com.Sprint;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidatingRegisterButton_Title_GuruLogo {
	public WebDriver driver;
	public String url = "";
	public String verificationError = "";

	@BeforeMethod
	public void setUp() {
		// To invoke The Browser
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUMJARFILES\\Chromedriver\\chromedriver.exe");
		// To Create an object for the chromedriver class
		driver = new ChromeDriver();
		// To maximize the Chrome Browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// The URL
		url = "https://demo.guru99.com/v4/";
	}

	@Test(priority = 1)
	public void RegisterButtonTest() {
		try {
			// To Get URL
			driver.get(url);
			// To validate Insurance Project Element
			driver.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
			System.out.println("Insurance Project button is clickable");
			// To validate Register Button Functionality
			driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
			System.out.println("Register Button is clickable");
			Thread.sleep(2000);
		} catch (Exception ex) // To catch Exception
		{
			verificationError = ex.getMessage();
			System.out.println("Caught Error Message : " + verificationError);
		}
	}

	@Test(priority = 2)
	public void VerifyGuruLogoTest() throws InterruptedException {
		// To get URL
		driver.get(url);
		// To validate Insurance Project Element
		driver.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
		// To validate Guru99 Logo is in homepage or not
		driver.findElement(By.xpath("/html/body/div[3]/a")).click();
		boolean flag = driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']")).isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("Guru Logo Validated Successfully");
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void VerifyGuru99TtitleTest() throws InterruptedException {
		// To get URL
		driver.get(url);
		// To validate Insurance Project Element
		driver.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
		// To validate Register Button
		driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
		// To validate Title is in homepage or not , using Assert
		String title = driver.getTitle();
		System.out.println("The Page Title is" + title);
		Assert.assertEquals(title, "Insurance Broker System - Register");
		System.out.println("Title Validated Successfully");
		Thread.sleep(2000);
	}

	@AfterMethod
	public void tearDown() {
		// Close the Browser
		driver.quit();
	}
}
