package com.jocata.dlp.pages;

import org.openqa.selenium.By;

public class DocumentsPage  extends BasePage {

	private static final String waitforloading = "//div[@class='loadingOverlay']";

	private static final String documnets = "//div[contains(text(),'DOCUMENTS')]";
	
	private static final String saveandcontiune = "//span[contains(text(),'SAVE & CONTINUE')]";

	
	
	
public PricingandChargesPage getthedocumentdetails() {
	     waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(documnets).$(documnets).click();
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		
	
		waitFor(saveandcontiune).$(saveandcontiune).click();

		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		return this.switchToPage(PricingandChargesPage.class);
		
		

	}
}
