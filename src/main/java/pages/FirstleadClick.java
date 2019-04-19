package pages;

import org.openqa.selenium.WebElement;

import design.ProjectMethods;

public class FirstleadClick  extends ProjectMethods{

	public DeleteLead firstLeads() throws InterruptedException  {
		WebElement text = driver.findElementByXPath("(//*[@class='linktext'])[4]");
		String Leadnumber = text.getText();
		System.out.println(Leadnumber);
		driver.findElementByXPath("(//*[@class='linktext'])[4]").click();
		Thread.sleep(5000);
		return new DeleteLead();
	}
}