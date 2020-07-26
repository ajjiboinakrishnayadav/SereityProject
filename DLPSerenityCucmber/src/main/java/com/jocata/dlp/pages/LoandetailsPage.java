package com.jocata.dlp.pages;

import org.openqa.selenium.By;

public class LoandetailsPage extends BasePage {

	private static final String waitforloading = "//div[@class='loadingOverlay']";

	private static final String Loanamout = "//input[starts-with(@id,'mat-input-')]";
	private static final String desiredmonths = "(//input[starts-with(@id,'mat-input-')])[position()=2]";
	private static final String purposeofloanicon = "(//div[contains(@class,'mat-select-arrow-wrapper')])[2]";
	private static final String purposeselection = "//span[contains(text(),'PURCHASE OF VEHICLE')]";
	private static final String ROI = "(//input[starts-with(@id,'mat-input-')])[position()=4]";
	private static final String submitbutton = "//span[contains(text(),'SUBMIT')]";
	private static final String wrtietextbox = "//div[@class='mat-form-field-infix'][contains(.,'Comments  *')]/input[@type='text']";
	private static final String Accept = "//span[contains(text(),'ACCEPT')]";

	
	
	public DocumentsPage gettheloandetails() {
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		
		waitFor(Loanamout).$(Loanamout).type("500000");
		waitFor(desiredmonths).$(desiredmonths).type("18");
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(purposeofloanicon).$(purposeofloanicon).click();
		waitFor(purposeselection).$(purposeselection).click();

		waitFor(ROI).$(ROI).type("11.90");
		
		waitFor(submitbutton).$(submitbutton).click();
		
		//waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(wrtietextbox).$(wrtietextbox).type("ApprovedRMuser");

		waitFor(Accept).$(Accept).click();
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		return this.switchToPage(DocumentsPage.class);
		
		

	}
	
}
