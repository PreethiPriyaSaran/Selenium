package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import design.ProjectMethods;
import pages.LoginPage;

public class TC101_Login extends ProjectMethods{

	@BeforeTest
	public void setData() {
		dataSheetName = "merge";
	}
	
	@Test(dataProvider = "fetchData")
	public void logIn(String userName,String password,String email) throws InterruptedException {		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickcrm()
		.clickLeads()
		.clickfindLeads()
		.clickEmail()
		.enterEmail(email)
		.findLeads()
		.firstLeads()
		.deleteLeads()
		.pagefindLeads()
		.checkLeads()
		.checkfind();
	
	}
	
}






