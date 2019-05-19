package question1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testdata.ReadPropertiesFile;

public class DirectoryPage {
	
	
	private WebDriver driver;

	public DirectoryPage(WebDriver driver) {
	
		this.driver=driver;
	}

	public void Search()
	{
		driver.findElement(By.xpath("//*[@id='menu_directory_viewDirectory']/b")).click();
		driver.findElement(By.xpath("//*[@id='menu_directory_viewDirectory']/b")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("searchDirectory_emp_name_empName")).sendKeys("Linda Anderson");
		
		WebElement sel_jobtitle = driver.findElement(By.xpath(".//*[@id='searchDirectory_job_title']"));		
		Select s = new Select(sel_jobtitle);
		s.selectByIndex(6);
		
		/*WebElement sel_location = driver.findElement(By.xpath(".//*[@id='searchDirectory_location']"));
		Select s1 = new Select(sel_location);
		s.selectByIndex(5);*/
		
		driver.findElement(By.id("searchBtn")).click();
		
	}
	
	public AdminPage Reset()
	{
		driver.findElement(By.id("resetBtn")).click();
		
		return new AdminPage(driver);
	}
	

}
