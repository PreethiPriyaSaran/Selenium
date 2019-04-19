package pages;

import design.ProjectMethods;

public class LeadPage  extends ProjectMethods{

	public FindLeads clickLeads() {
		driver.findElementByXPath("//a[text()='Leads']").click();
		return new FindLeads();
	}

 

}
