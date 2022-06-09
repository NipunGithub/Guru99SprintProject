package com.Sprint;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidatingGuruLogoAndTitle {
	public WebDriver driver;
	public String url = "";
	public String verificationError = "";

	@BeforeMethod
	public void setUp() {
		//To invoke The Browser  
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUMJARFILES\\Chromedriver\\chromedriver.exe");
		//To Create an object for the chromedriver class 
		driver = new ChromeDriver();
		//To maximize the Chrome Browser window 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//The URL 
		url = "https://demo.guru99.com/v4/";
	}

	@Test(priority = 1)
	public void VerifyGuruLogoTest() {
		// To get the URL
		driver.get(url);
		// To check whether Guru99 Logo is in homepage or not , by using assert
		boolean flag = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/a/img")).isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("Guru Logo Test Validated Successfully");
	}

	@Test(priority = 2)
	public void VerifyGuru99TtitleTest() {
		// To get the URL
		driver.get(url);
		// To get the Title
		String title = driver.getTitle();
		System.out.println("The Page Title is" + title);
		// To check whether Guru99 Home page title is in homepage or not , by using
		// assert
		Assert.assertEquals(title, "Guru99 Bank Home Page");
		System.out.println("Home Page Title Validated Successfully");
	}

	@AfterMethod
	public void tearDown() {
		// closing chrome browser
		driver.quit();
	}
}
