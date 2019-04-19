package pages;

import design.ProjectMethods;

public class ClickFindLeads  extends ProjectMethods{

	public FirstleadClick findLeads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		return new FirstleadClick();
	}
}