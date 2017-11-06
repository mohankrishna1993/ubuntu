package Admission;


import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
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
		try{
		// /Test/chromedriver
		//File chromeDriver = new File("chromedriver");
		//String absolutePath = chromeDriver.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver","/home/sysadmin/Downloads/geckodriver");
		/*String cloudURL = "http://preprodapp3.clictest.com:8080/chromedrivers/2.33/linux/chromedriver";
		File f = File.createTempFile("chromedriver", null );
		f.setExecutable( true );
		FileUtils.copyURLToFile(new URL( cloudURL ), f);*/
		//System.setProperty("webdriver.chrome.driver",f.getAbsolutePath() );
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--headless");
		//options.addArguments("start-maximized");
		
		driver = new FirefoxDriver();
		//driver.manage().window().setSize(new Dimension(1024,768));
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.getTitle();
	      }catch(Exception ex){
			
			throw ex;
		}
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

