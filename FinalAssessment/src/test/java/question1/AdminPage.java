package question1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

	
	private WebDriver driver;

	public AdminPage(WebDriver driver) {
		this.driver=driver;
	}

	public void Search()
	{
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("john.smith");
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("John Smith");
		
		/*WebElement sel_jobtitle = driver.findElement(By.xpath(".//*[@id='searchDirectory_job_title']"));		
		Select s = new Select(sel_jobtitle);
		s.selectByIndex(6);
		
		WebElement sel_location = driver.findElement(By.xpath(".//*[@id='searchDirectory_location']"));
		Select s1 = new Select(sel_location);
		s.selectByIndex(5);*/
		
		driver.findElement(By.id("searchBtn")).click();		
		
	}
	
	public void Reset()
	{
		driver.findElement(By.id("resetBtn")).click();
	}
	
	public AssignLeave Add()
	{
		System.out.println("No User exists to be added as Admin");
		
		return new AssignLeave(driver);
		/*driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_17']/b")).click();
		driver.findElement(By.id("btnAdd")).click();*/
	}
	
}
