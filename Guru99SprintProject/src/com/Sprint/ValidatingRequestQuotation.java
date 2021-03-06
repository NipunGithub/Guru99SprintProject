package com.Sprint;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidatingRequestQuotation {
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

	@Test (priority=1 , groups={"regression"})
	public void ValidatingCalculatePremiumTest() // To calculate Premium
	{
		try {
			// To get the URL
			driver.get(url);
			// To validate insurance Project Button functionality
			driver.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
			// To Enter valid Email
			driver.findElement(By.id("email")).sendKeys("nipunbin2698@gmail.com");
			Thread.sleep(2000);
			// To enter valid Password
			driver.findElement(By.id("password")).sendKeys("Hello#123");
			Thread.sleep(2000);
			// To Validate Login Button Functionality
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			// To validate Request Quotation Button Functionality
			driver.findElement(By.xpath("//a[@href='#tabs-2']")).click();
			// To Enter Valid Breakdown Cover from Dropdown Button
			Select title1 = new Select(driver.findElement(By.xpath("//select[@id=\"quotation_breakdowncover\"]")));
			// Selected European From Dropdown Button
			title1.selectByVisibleText("European");
			title1.selectByIndex(3);
			Thread.sleep(2000);
			// To Enter Valid Incidents Credentials
			driver.findElement(By.id("quotation_incidents")).sendKeys("3");
			Thread.sleep(2000);
			// To Enter valid Registration Number
			driver.findElement(By.id("quotation_vehicle_attributes_registration")).sendKeys("3214");
			Thread.sleep(2000);
			// To enter valid Annual Mileage
			driver.findElement(By.id("quotation_vehicle_attributes_mileage")).sendKeys("25");
			Thread.sleep(2000);
			// To enter valid Estimated Value
			driver.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("2500");
			Thread.sleep(2000);
			// To Enter Valid Parking Location from Dropdown Button
			Select title2 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_parkinglocation\"]")));
			title2.selectByVisibleText("Private Property");
			title2.selectByIndex(4);
			Thread.sleep(2000);
			// To Enter Valid Start Of Policy from Dropdown Button
			Select title3 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_policystart_1i\"]")));
			// Selecting 2024 As year from Dropdown button
			title3.selectByVisibleText("2024");
			title3.selectByIndex(10);
			Thread.sleep(2000);
			Select title4 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_policystart_2i\"]")));
			// Selecting August As month from Dropdown Button
			title4.selectByVisibleText("August");
			title4.selectByIndex(7);
			Thread.sleep(2000);
			Select title5 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_policystart_3i\"]")));
			// Selecting 9 as date from Dropdown Button
			title5.selectByVisibleText("9");
			title5.selectByIndex(8);
			// To validate calculate Premium button Functionality
			driver.findElement(By.xpath("//input[@value='Calculate Premium']")).click();
			Thread.sleep(2000);
		} catch (Exception ex) {
			verificationError = ex.getMessage();
			System.out.println("Caught Error Message : " + verificationError);
		}
	}

	@Test(priority = 2)
	public void ValidatingResetFormButtonTest() // To reset all values
	{
		try {
			// To get the URL
			driver.get(url);
			// To validate insurance Project Button functionality
			driver.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
			// To Enter valid Email
			driver.findElement(By.id("email")).sendKeys("nipunbin2698@gmail.com");
			Thread.sleep(2000);
			// To enter valid Password
			driver.findElement(By.id("password")).sendKeys("Hello#123");
			Thread.sleep(2000);
			// To Validate Login Button Functionality
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			// To validate Request Quotation Button Functionality
			driver.findElement(By.xpath("//a[@href='#tabs-2']")).click();
			// To Enter Valid Breakdown Cover from Dropdown Button
			Select title1 = new Select(driver.findElement(By.xpath("//select[@id=\"quotation_breakdowncover\"]")));
			// Selected European From Dropdown Button
			title1.selectByVisibleText("European");
			title1.selectByIndex(3);
			Thread.sleep(2000);
			// To Enter Valid Incidents Credentials
			driver.findElement(By.id("quotation_incidents")).sendKeys("3");
			Thread.sleep(2000);
			// To Enter valid Registration Number
			driver.findElement(By.id("quotation_vehicle_attributes_registration")).sendKeys("3214");
			Thread.sleep(2000);
			// To enter valid Annual Mileage
			driver.findElement(By.id("quotation_vehicle_attributes_mileage")).sendKeys("25");
			Thread.sleep(2000);
			// To enter valid Estimated Value
			driver.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("2500");
			Thread.sleep(2000);
			// To Enter Valid Parking Location from Dropdown Button
			Select title2 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_parkinglocation\"]")));
			title2.selectByVisibleText("Private Property");
			title2.selectByIndex(4);
			Thread.sleep(2000);
			// To Enter Valid Start Of Policy from Dropdown Button
			Select title3 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_policystart_1i\"]")));
			// Selecting 2024 As year from Dropdown button
			title3.selectByVisibleText("2024");
			title3.selectByIndex(10);
			Thread.sleep(2000);
			Select title4 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_policystart_2i\"]")));
			// Selecting August As month from Dropdown Button
			title4.selectByVisibleText("August");
			title4.selectByIndex(7);
			Thread.sleep(2000);
			Select title5 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_policystart_3i\"]")));
			// Selecting 9 as date from Dropdown Button
			title5.selectByVisibleText("9");
			title5.selectByIndex(8);
			// To validate functionality Of Reset Button
			driver.findElement(By.xpath("//*[@id=\"resetquote\"]")).click();
			Thread.sleep(2000);
		} catch (Exception ex) {
			verificationError = ex.getMessage();
			System.out.println("Caught Error Message : " + verificationError);
		}
	}

	@Test(priority = 3)
	public void ValidatingSaveQuotationButtonTest() // To Validate Save Quotation
	{
		try {
			// To get the URL
			driver.get(url);
			// To validate insurance Project Button functionality
			driver.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
			// To Enter valid Email
			driver.findElement(By.id("email")).sendKeys("nipunbin2698@gmail.com");
			Thread.sleep(2000);
			// To enter valid Password
			driver.findElement(By.id("password")).sendKeys("Hello#123");
			Thread.sleep(2000);
			// To Validate Login Button Functionality
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			// To validate Request Quotation Button Functionality
			driver.findElement(By.xpath("//a[@href='#tabs-2']")).click();
			// To Enter Valid Breakdown Cover from Dropdown Button
			Select title1 = new Select(driver.findElement(By.xpath("//select[@id=\"quotation_breakdowncover\"]")));
			// Selected European From Dropdown Button
			title1.selectByVisibleText("European");
			title1.selectByIndex(3);
			Thread.sleep(2000);
			// To Enter Valid Incidents Credentials
			driver.findElement(By.id("quotation_incidents")).sendKeys("3");
			Thread.sleep(2000);
			// To Enter valid Registration Number
			driver.findElement(By.id("quotation_vehicle_attributes_registration")).sendKeys("3214");
			Thread.sleep(2000);
			// To enter valid Annual Mileage
			driver.findElement(By.id("quotation_vehicle_attributes_mileage")).sendKeys("25");
			Thread.sleep(2000);
			// To enter valid Estimated Value
			driver.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("2500");
			Thread.sleep(2000);
			// To Enter Valid Parking Location from Dropdown Button
			Select title2 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_parkinglocation\"]")));
			title2.selectByVisibleText("Private Property");
			title2.selectByIndex(4);
			Thread.sleep(2000);
			// To Enter Valid Start Of Policy from Dropdown Button
			Select title3 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_policystart_1i\"]")));
			// Selecting 2024 As year from Dropdown button
			title3.selectByVisibleText("2024");
			title3.selectByIndex(10);
			Thread.sleep(2000);
			Select title4 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_policystart_2i\"]")));
			// Selecting August As month from Dropdown Button
			title4.selectByVisibleText("August");
			title4.selectByIndex(7);
			Thread.sleep(2000);
			Select title5 = new Select(
					driver.findElement(By.xpath("//select[@id=\"quotation_vehicle_attributes_policystart_3i\"]")));
			// Selecting 9 as date from Dropdown Button
			title5.selectByVisibleText("9");
			title5.selectByIndex(8);
			// To validate Save Quotation Button Functionality
			driver.findElement(By.xpath("//input[@value='Save Quotation']")).click();
			Thread.sleep(2000);
			System.out.println("Request Quotation Successful");
		} catch (Exception ex) // To catch Exception
		{
			verificationError = ex.getMessage();
			System.out.println("Caught Error Message : " + verificationError);
		}
	}

	@AfterMethod
	public void tearDown() {
		// To close the browser
		driver.quit();
	}
}
