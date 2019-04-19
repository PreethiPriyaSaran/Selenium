package pages;

import design.ProjectMethods;

public class FindLeads  extends ProjectMethods{

	public ClickEmail clickfindLeads() {
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		return new ClickEmail();
	}
}