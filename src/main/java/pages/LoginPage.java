package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import design.ProjectMethods;

public class LoginPage extends ProjectMethods{

	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "USERNAME")
	WebElement eleUserName;
	
	@FindBy(how = How.ID, using = "password")
	WebElement elePassword;	
	
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement eleLogin;
	
	// FindBys - Multiple FindBy with AND condition
	// FindAll - Multiple FindBy with OR condition
	@FindBys({
		@FindBy(how = How.ID, using = "username"),
		@FindBy(how = How.NAME, using = "USERNAME")
	})
	WebElement eleUser;	
	
	@FindAll({
		@FindBy(how = How.ID,using = "username"),
		@FindBy(how = How.NAME, using = "USERNAME")})
	WebElement eleUser1;
	
	public LoginPage getUserNameValue() {
		eleUserName.getAttribute("value");		
		return this;
	}	
	
	public LoginPage enterUserName(String userName) {
		eleUserName.clear();
		eleUserName.sendKeys(userName);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		elePassword.clear();
		elePassword.sendKeys(password);
		return this;
	}
	
	public HomePage clickLogin() {
		eleLogin.click();
		return new HomePage();
	}
	
	
	
	
	
	
}
