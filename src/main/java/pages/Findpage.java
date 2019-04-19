package pages;

import design.ProjectMethods;

public class Findpage extends ProjectMethods {

	public Verify checkfind() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		return new Verify();
	}
}