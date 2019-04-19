package pages;

import design.ProjectMethods;

public class Verify extends ProjectMethods {

	public Verify checkverify() throws InterruptedException {
		String text1 = driver.findElementByClassName("x-paging-info").getText();
		if (text1.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		return new Verify();
	}
}