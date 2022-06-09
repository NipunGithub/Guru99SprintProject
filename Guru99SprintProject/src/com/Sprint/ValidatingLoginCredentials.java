package com.Sprint;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidatingLoginCredentials {
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

	@Test (priority=1 , groups={"Sanity"})
	public void ValidatingLogInCredentialsTest() {
		try {
			//To get the URL
			driver.get(url);
			//To validate Insurance Project Element 
			driver.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
			Thread.sleep(2000);
			//To enter valid Email
			driver.findElement(By.id("email")).sendKeys("nipunbin2698@gmail.com");
			Thread.sleep(2000);
			//To enter valid Password 
			driver.findElement(By.id("password")).sendKeys("Hello#123");
			Thread.sleep(2000);
			//To Validate Log in Button 
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).click();
		} catch (Exception ex) // To catch exception 
		{
			verificationError = ex.getMessage();
			System.out.println("Caught Error Message : " + verificationError);
		}
	}
	@Test(priority = 2)
	public void Screenshot() {
		try {
			driver.get(url);
			driver.findElement(By.xpath("//a[contains(text(),'Bank Project')]"));
			// method to obtain screenShot
			TakesScreenshot ts = (TakesScreenshot) driver;
			File ram = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./photo/Guru99.png");
			FileUtils.copyFile(ram, dest);	
		} catch (Exception ex) {
			verificationError = ex.getMessage();
			System.out.println("Caught Error Message : " + verificationError);
		}
	}
	@AfterMethod
	public void tearDown() {
		//Closing Chrome Browser 
		driver.quit();
	}
}
