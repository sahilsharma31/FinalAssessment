package question1;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testdata.ReadPropertiesFile;

public class LoginPage {
	
	public WebDriver driver;
		
	public DirectoryPage SubmitPage(){
		
		/*
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		/*
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver=new FirefoxDriver();*/
		
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//maximize the browser
		driver.manage().window().maximize(); 
		
		String titlebeforelogin=driver.getTitle();
		System.out.println("Page title before logging into the application is : " + titlebeforelogin);
		//Validate the page title before login
		if(titlebeforelogin.equals("OrangeHRM")){
			System.out.println("OrangeHRM Login page is displayed");
		}
		else{
			System.out.println("OrangeHRM Login page is not displayed");
		}
		//Login to the application
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		return new DirectoryPage(driver);
	}
	

}
