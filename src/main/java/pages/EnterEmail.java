package pages;

import design.ProjectMethods;

public class EnterEmail extends ProjectMethods{

	public ClickFindLeads enterEmail(String email) {
		driver.findElementByXPath("//label[text()='Email Address:']/following::input[@class=' x-form-text x-form-field']").sendKeys(email);
		return new ClickFindLeads();
	}
}