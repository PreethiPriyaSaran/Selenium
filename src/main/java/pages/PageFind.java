package pages;

import design.ProjectMethods;

public class PageFind extends ProjectMethods {

	public Check pagefindLeads() {
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		return new Check();
	}
}