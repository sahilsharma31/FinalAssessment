package question1;

import org.testng.annotations.Test;

public class TestLogin {
	
	@Test
	
	public void LoginFun()
	{
		LoginPage l1= new LoginPage();
		DirectoryPage d=l1.SubmitPage();
		d.Search();
		AdminPage reset=d.Reset();
			
		reset.Search();
		reset.Reset();
		
		AssignLeave leave=reset.Add();
		leave.GrantLeave();
		
	}

}
