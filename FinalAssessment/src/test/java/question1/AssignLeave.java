package question1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AssignLeave {

	private WebDriver driver;

	public AssignLeave(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void GrantLeave()
	{
		driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']/b")).click();
		driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']/b")).click();
		
		driver.findElement(By.xpath("//*[@class='menu']/ul/li[3]/ul/child::li[5]")).click();
		
		driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("Linda Anderson");
		WebElement sel_leavetype = driver.findElement(By.id("assignleave_txtLeaveType"));		
		Select s = new Select(sel_leavetype);
		s.selectByIndex(2);
		
		//driver.findElement(By.id("assignleave_txtFromDate")).click();
		driver.findElement(By.id("assignleave_txtFromDate")).sendKeys("2019-05-01");
		driver.findElement(By.id("assignleave_txtToDate")).click();
		driver.findElement(By.id("assignleave_txtToDate")).sendKeys("2019-07-01");
		driver.findElement(By.id("assignBtn")).click();	
		
		
	}

}
