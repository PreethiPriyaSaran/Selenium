package pages;

import design.ProjectMethods;

public class Check extends ProjectMethods {

	public Findpage checkLeads() {
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys(Leadnumber)
		return new Findpage();
	}
}