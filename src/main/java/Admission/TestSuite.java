package Admission;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


public class TestSuite 
{
	
	WebDriver driver;
	static WebDriverWait wait;
	
	/*
	 * Browser Instantiation and Launching the URL
	 */	
	
	@BeforeTest
	public void Setup() throws Exception
	{
                System.setProperty("webdriver.chrome.driver","/home/test/Downloads/chromedriver");
		//System.setProperty("webdriver.chrome.logfile", "/home/sysadmin/Downloads/chromedriver_log.txt");
		//System.setProperty("webdriver.chrome.verboseLogging", "true");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1024,768));
		//driver.driver.manage().window().maximize();
                //driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.getTitle();
	} 
	
	@AfterTest
	public void tearDown()
	{
	
		//driver.quit();
	} 
	

	
	/*
	 * Verifying Login Functionality
	 */
	
	@Test
	public void Login() throws InterruptedException
	{
		System.out.println("Test");
	}
	
}	


