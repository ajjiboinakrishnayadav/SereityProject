package com.jocata.dlp.pages;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DashBoardPage extends BasePage {
	
	public static String latestapplicationid;
	
	
	
	/*public DashBoardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
*/

	public static String getLatestapplicationid() {
		return latestapplicationid;
	}


	public static void setLatestapplicationid(String latestapplicationid) {
		DashBoardPage.latestapplicationid = latestapplicationid;
	}

	private static final String waitforloading = "//div[@class='loadingOverlay']";

	private static final String Newapplicatin_link = "//span[contains(text(),' NEW APPLICATION ')]";
	
	private static final String Clickingtheapplication = "//mat-label[contains(text(),'PLDLP1327 ')]";


	private static final String MobileNumber = "//input[starts-with(@id,'mat-input-')]";

	private static final String Pannumber = "//div[@class='mat-form-field-infix'][contains(.,'PAN  *')]//input[starts-with(@id,'mat-input-')]";

	private static final String State = "//div[@class='mat-form-field-infix'][contains(.,'STATE  *')]//div[contains(@class,'mat-select-arrow')]";

	private static final String Telanagastate = "//span[contains(text(),'TELANGANA')]";

	private static final String CITY = "//div[@class='mat-form-field-infix'][contains(.,'CITY  *')]//div[contains(@class,'mat-select-arrow')]";

	private static final String HyderabadLink = "//span[contains(text(),'HYDERABAD')]";

	private static final String submitbutton = "//span[contains(text(),'SUBMIT')]";

	private static final String duplicatepanlink = "//div[contains(text(),'Application exists with this PAN number')]";

	private static final int SECONDS = 50;

	
	
	
	/**
	 * Get the greeting message
	 * 
	 * @return
	 */
	public String getnewapplicationlink() {

		return waitFor(Newapplicatin_link).$(Newapplicatin_link).getText();
	}
	
	
	
	/**
	 * Get the greeting message
	 * 
	 * @return
	 */
	public DashBoardPage clickingonnewapplication() {
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		//waitForTextToAppear("NEW APPLICATION");

		 waitFor(Newapplicatin_link).$(Newapplicatin_link).click();
		 
		 return this;
	}
	
	
	
	public DashBoardPage gettheselectedapplication() {
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));



		 
		String appidis= waitFor(Clickingtheapplication).$(Clickingtheapplication).getText();
		 latestapplicationid= appidis.replaceAll("\\D", "");
		System.out.println("latest appid is "+latestapplicationid); 
		
		setLatestapplicationid(latestapplicationid);
		
		
		 waitFor(Clickingtheapplication).$(Clickingtheapplication).click();
		 return this;
	}


	/**
	 * 
	 * @return
	 */
	
	public DashBoardPage createnewapplication() {
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(Newapplicatin_link).$(Newapplicatin_link).click();
		
		
		return this;
		
		
	}
	
public DashBoardPage clickingtheapplicationselecting() {
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(Newapplicatin_link).$(Newapplicatin_link).click();
		
		
		return this;
		
		
	}

public DashBoardPage enterthephonenumber(String phonenumber) {
	
	//waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

	waitFor(MobileNumber).$(MobileNumber).type(phonenumber);
	
	
	return this;
	
	
}

public DashBoardPage enterthepannumbers(String pannumber) {
	
	//waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

	//waitFor(Pannumber).$(Pannumber).type("AWFPA9541F");

	waitFor(Pannumber).$(Pannumber).type(pannumber);
	
	
	return this;
	
	
}


public DashBoardPage clickingonstate() {
	
	//waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

	waitFor(State).$(State).click();
	
	
	return this;
	
	
}

public DashBoardPage selectingtelanagan() {
	
	//waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

	waitFor(Telanagastate).$(Telanagastate).click();
	
	
	return this;
	
	
}


public DashBoardPage clickingoncitydropdown() {
	
	//waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

	withTimeoutOf(Duration.ofSeconds(30)).waitForAbsenceOf(waitforloading);

	//waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

	waitFor(CITY).$(CITY).click();
	
	
	return this;
	
}

public DashBoardPage selectingcitydropdown() {
	
	waitFor(HyderabadLink).$(HyderabadLink).click();

	return this;
	
}

public DashBoardPage clickingonsubmitbutton() {
	
	waitFor(submitbutton).$(submitbutton).click();

	return this;
	
}




	
	public DashBoardPage fillingnewapplication(String phonenumber , String pannumber){
		
		
		waitForTextToAppear("NEW APPLICATION");
		
		
		waitFor(MobileNumber).$(MobileNumber).type(phonenumber);
		waitFor(Pannumber).$(Pannumber).type(pannumber);
		
		//withTimeoutOf(5, SECONDS).waitForPresenceOf(By.cssSelector("#colors a"))

		//withTimeoutOf(Duration.ofSeconds(20)).waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		withTimeoutOf(Duration.ofSeconds(20)).waitForAbsenceOf(waitforloading);
		
		waitFor(State).$(State).click();

		waitFor(Telanagastate).$(Telanagastate).click();
		
		withTimeoutOf(Duration.ofSeconds(10)).waitForAbsenceOf(waitforloading);

		//waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(CITY).$(CITY).click();
		//waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(HyderabadLink).$(HyderabadLink).click();
		waitFor(submitbutton).$(submitbutton).click();
		
		return this;
	}
	
	public String duplicatepanmessage() {
		

		return waitFor(duplicatepanlink).$(duplicatepanlink).getTextContent();
	}

	
	
	
}
