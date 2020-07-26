package com.jocata.dlp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;



public class PricingandChargesPage extends BasePage {
	
	
	private WebDriver driver;

	public PricingandChargesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String applicationusername;
	
	
	//private static final String Clickingtheapplication = "//mat-label[contains(text(),'PLDLP1327 ')]";

	
	private static final String pricingandcharges = "//a[contains(text(),' Pricing & Charges ')]";
	private static final String pricingicon = "//div[@class='mat-select-arrow-wrapper']";
	private static final String fixed = "//span[contains(text(),'FIXED')]";
	private static final String saveandcontine = "//span[contains(text(),'SAVE & CONTINUE')]";
	private static final String checkboxtext = "//input[contains(@type,'text')]";
	private static final String Accept = "//span[contains(text(),'ACCEPT')]";
	private static final String waitforloading = "//div[@class='loadingOverlay']";

	private static final String currentuser = "//div[@class='current-user']";
	private static final String Logouttheapp = "//a[contains(text(),'Logout')]";
	
	private static final String Loandetails="//div[contains(text(),'LOAN DETAILS')]";
	private static final String ButtonText="//span[contains(text(),'SUBMIT')]";
	
	private static final String wrtietextbox = "//div[@class='mat-form-field-infix'][contains(.,'Comments  *')]/input[@type='text']";

	private static final String Taskboard="//span[contains(text(),'TaskBoard')]";

	/*  driver.findElement(By.xpath("//div[@class='current-user']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	*/ 

	
public PricingandChargesPage getthepricingandchares() {
	
	//waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		
		waitFor(pricingandcharges).$(pricingandcharges).click();
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		
		//waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		
	
		waitFor(pricingicon).$(pricingicon).click();
		waitFor(fixed).$(fixed).click();
		waitFor(saveandcontine).$(saveandcontine).click();
		waitFor(checkboxtext).$(checkboxtext).type("ÄpprovedRmsecond");
		waitFor(Accept).$(Accept).click();

		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));


		
		try {
			
			
			waitFor(Taskboard).$(Taskboard).click();

			
			String latestapplicationid = Serenity.sessionVariableCalled("applicationid");
			//CustomerPage custpage=new CustomerPage(driver);
			//String applicationid= custpage.getApplicationid();

		   System.out.println("The application id is "+latestapplicationid);
		   
		   
			
			clickapplicationlinkcpauser(latestapplicationid);;
			
			waitFor(Loandetails).$(Loandetails).click();
			waitFor(ButtonText).$(ButtonText).click();

			waitFor(wrtietextbox).$(wrtietextbox).type("ApprovedRMuser");

			waitFor(Accept).$(Accept).click();
			
			
			// waitFor(Clickingtheapplication).$(Clickingtheapplication).click();
			 
				waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));
				
				

				waitFor(pricingandcharges).$(pricingandcharges).click();
				waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));


				waitFor(saveandcontine).$(saveandcontine).click();
				waitFor(checkboxtext).$(checkboxtext).type("ApprovedsecondRMuser");
				waitFor(Accept).$(Accept).click();
				waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));


		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(currentuser).$(currentuser).click();
		waitFor(Logouttheapp).$(Logouttheapp).click();
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		return this;
		
		

	}

public void clickapplicationlinkcpauser(String applicationid) throws InterruptedException {
	
Thread.sleep(20000);
		


driver.findElement(By.xpath("//mat-label[contains(text(),'PLDLP"+applicationid+"')]")).click();

Thread.sleep(20000);


}
}
