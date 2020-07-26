package com.jocata.dlp.pages;

import java.time.Duration;

import org.openqa.selenium.By;

import net.serenitybdd.core.Serenity;
import start.CPAassignuser;
import start.CPAuser;

public class CPAUserPage extends BasePage {

	public String applicationusername;

	private static final String waitforloading = "//div[@class='loadingOverlay']";

	private static final String currentuser = "//div[@class='current-user']";
	private static final String Logouttheapp = "//a[contains(text(),'Logout')]";

	private static final String USER_NAME_INPUT = "//input[@placeholder='Username']";

	private static final String PASSWORD_INPUT = "//input[@placeholder='Password']";

	private static final String LOGIN_BUTTON = "//div[@class='right-btn login-button']";

	private static final String Invalid_credentials = "//div[contains(text(),' Invalid credentials ')]";

	private static final String application_xpath = "//mat-label[contains(text(),'PLDLP\"+applicationid+\"')]";

	private static final String contiune = "//span[contains(text(),'CONTINUE')]";

	private static final String saveandbutton = "//span[contains(text(),'SAVE & CONTINUE')]";

	private static final String submitbutton = "//span[contains(text(),'SUBMIT')]";

	private static final String documnets = "//div[contains(text(),'DOCUMENTS')]";

	private static final String saveandbuttontwo = "//span[contains(text(),'SAVE & CONTINUE')]";

	private static final String saveandbuttonthree = "//span[contains(text(),'SAVE & CONTINUE')]";

	private static final String CAM = "//a[contains(text(),'Cam')]";

	private static final String TandC = "//span[contains(text(),'T & C')]";

	private static final String Testingbox = "//input[starts-with(@id,'mat-input-')]";

	private static final String calendericon = "//i[starts-with(@class,'material-icons font-')]";

	private static final String icons_text = "//span[contains(text(),'15')]";

	private static final String Arrow_Wrapper = "//div[@class='mat-select-arrow-wrapper']";

	private static final String Standard = "//span[contains(text(),'STANDARD')]";

	private static final String Standard_testing = "(//input[starts-with(@id,'mat-input-')])[position()=3]";

	private static final String Arrowwrapper_seond = "(//div[contains(@class,'mat-select-arrow-wrapper')])[2]";

	private static final String beforedis = "//span[contains(text(),'BEFORE DISBURSEMENT')]";

	private static final String Arrowseond = "(//div[contains(@class,'mat-select-arrow-wrapper')])[3]";

	private static final String Approve = "//span[contains(text(),'Approve')]";

	private static final String Approvedcpauser = "(//input[starts-with(@id,'mat-input-')])[position()=4]";

	private static final String Save = "//span[contains(text(),'SAVE')]";

	private static final String Typetext = "//input[contains(@type,'text')]";

	private static final String Acceptbutton = "//span[contains(text(),'ACCEPT')]";

	public CPAUserPage postgresscpausertest() throws InterruptedException {

		Thread.sleep(9000);

	
		String latestapplicationid = Serenity.sessionVariableCalled("applicationid");

		Thread.sleep(9000);

		CPAuser cpa = new CPAuser();
		String cpausername = cpa.getthecpauser(latestapplicationid);
		System.out.println("assigning the value is " + cpausername); // 204

		Thread.sleep(9000);

		CPAassignuser cpaassign = new CPAassignuser();

		applicationusername = cpaassign.gettcpaassignuser(cpausername);

		System.out.println("assigning the value is " + applicationusername); // 204

		Thread.sleep(9000);

		return this;

	}

	public CPAUserPage Loginwiththecpauser() throws InterruptedException {
		Thread.sleep(9000);


		waitFor(USER_NAME_INPUT).$(USER_NAME_INPUT).type(applicationusername);
		waitFor(PASSWORD_INPUT).$(PASSWORD_INPUT).type("Joc@123");
		Thread.sleep(9000);

		waitFor(LOGIN_BUTTON).$(LOGIN_BUTTON).click();

		Thread.sleep(4000);

		try {

			String invalidcredentails = waitFor(Invalid_credentials).$(Invalid_credentials).getAttribute("innerHTML");

			System.out.println("�?nvalid credentails message" + invalidcredentails);

			if (invalidcredentails.contains("Invalid credentials")) {
				System.out.println("Please enter current password");
			} else {
				System.out.println("Test Case Failed");
			}

			Thread.sleep(5000);

			waitFor(USER_NAME_INPUT).$(USER_NAME_INPUT).clear();
			waitFor(USER_NAME_INPUT).$(USER_NAME_INPUT).type(applicationusername);
			waitFor(PASSWORD_INPUT).$(PASSWORD_INPUT).clear();

			waitFor(PASSWORD_INPUT).$(PASSWORD_INPUT).type("Jocata@111");

			waitFor(LOGIN_BUTTON).$(LOGIN_BUTTON).click();

			Thread.sleep(4000);
		} catch (Exception e) {

			System.out.println("Elementfound: " + e.getMessage() + "\n-----------------------");

		}

		Thread.sleep(14000);

		String latestapplicationid = Serenity.sessionVariableCalled("applicationid");

		withTimeoutOf(Duration.ofSeconds(40)).waitForAbsenceOf(waitforloading);

		clickapplicationlinkcpauser(latestapplicationid);
		Thread.sleep(4000);

		actionsperformedcpauser();
		return this;

	}

	public void clickapplicationlinkcpauser(String applicationid) throws InterruptedException {

		Thread.sleep(30000);

		withTimeoutOf(Duration.ofSeconds(30)).find(By.xpath("//mat-label[contains(text(),'PLDLP"+applicationid+"')]")).click();

		/*String addToCartP1 = "+\"')]";
		String ANCHOR = "//mat-label[contains(text(),'PLDLP\"+";

		String addToCartButton = ANCHOR + applicationid + addToCartP1;

		waitFor(addToCartButton).$(addToCartButton).click();*/

		withTimeoutOf(Duration.ofSeconds(40)).waitForAbsenceOf(waitforloading);

		Thread.sleep(20000);

	}

	public void actionsperformedcpauser() throws InterruptedException {
		// Thread.sleep(19000);
		// Thread.sleep(60000);

		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(contiune).$(contiune).click();

		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(saveandbutton).$(saveandbutton).click();
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));
		
		Thread.sleep(19000);
	    Thread.sleep(19000);


		waitFor(submitbutton).$(submitbutton).click();
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));
		
	    Thread.sleep(6000);


		waitFor(documnets).$(documnets).click();
		
		withTimeoutOf(Duration.ofSeconds(40)).waitForAbsenceOf(waitforloading);

	    Thread.sleep(6000);
		
		withTimeoutOf(Duration.ofSeconds(40)).waitForAbsenceOf(waitforloading);

		waitFor(saveandbuttonthree).$(saveandbuttonthree).click();

	    Thread.sleep(6000);

		waitFor(CAM).$(CAM).click();
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(TandC).$(TandC).click();
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(Testingbox).$(Testingbox).type("Testing");
		
	    Thread.sleep(6000);

		//withTimeoutOf(Duration.ofSeconds(40)).waitForAbsenceOf(waitforloading);

		waitFor(calendericon).$(calendericon).click();
		
		
	    Thread.sleep(6000);

		waitFor(icons_text).$(icons_text).click();
		
	    Thread.sleep(6000);

		waitFor(Arrow_Wrapper).$(Arrow_Wrapper).click();
		
	    Thread.sleep(6000);

		waitFor(Standard).$(Standard).click();

	    Thread.sleep(6000);

		waitFor(Standard_testing).$(Standard_testing).type("Testing");
		
	    Thread.sleep(6000);


		waitFor(Arrowwrapper_seond).$(Arrowwrapper_seond).click();
	    Thread.sleep(5000);


		waitFor(beforedis).$(beforedis).click();
	    Thread.sleep(5000);


		waitFor(Arrowseond).$(Arrowseond).click();
	    Thread.sleep(5000);

		waitFor(Approve).$(Approve).click();
	    Thread.sleep(5000);

		waitFor(Approvedcpauser).$(Approvedcpauser).type("approvedcpauser");
	    Thread.sleep(5000);

		waitFor(Save).$(Save).click();
		;
	    Thread.sleep(5000);

		waitFor(Typetext).$(Typetext).type("cpauserapproved");
		;
	    Thread.sleep(5000);


		waitFor(Acceptbutton).$(Acceptbutton).click();
		;

		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(currentuser).$(currentuser).click();
	    Thread.sleep(5000);

		waitFor(Logouttheapp).$(Logouttheapp).click();

		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));
		

	}

}
