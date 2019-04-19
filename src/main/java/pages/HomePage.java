package pages;

import design.ProjectMethods;

public class HomePage extends ProjectMethods{

	public LeadPage clickcrm() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new LeadPage();
	}






}
