package pages;

import design.ProjectMethods;

public class DeleteLead extends ProjectMethods {

	public PageFind deleteLeads() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Delete']").click();
		Thread.sleep(5000);
		return new PageFind();
		
	
	
		/*
		 public DeleteLead deleteLeads() throws InterruptedException {
		 driver.findElementByXPath("//a[text()='Delete']").click();
		Thread.sleep(5000);
		return new DeleteLead();*/
		
	}
}