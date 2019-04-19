package pages;

import design.ProjectMethods;

public class ClickEmail extends ProjectMethods{

	public EnterEmail clickEmail() {
		driver.findElementByXPath("//span[text()='Email']").click();
		return new EnterEmail();
	}
}