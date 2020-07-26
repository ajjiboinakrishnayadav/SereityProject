package com.jocata.dlp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jocata.dlp.utils.DatepickerUtiles;

import javafx.scene.control.DatePicker;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class CustomerPage extends BasePage {
	
 /* public static String Applicationid;

  
  

	public static String getApplicationid() {
	return Applicationid;
}

public static void setApplicationid(String applicationid) {
	Applicationid = applicationid;
}
*/


	private WebDriver driver;

	public CustomerPage(WebDriver driver) {
		this.driver = driver;
	}


	
	// .......................Personal
	// details..................................................................//

	private static final String waitforloading = "//div[@class='loadingOverlay']";

	
	
	private static final String ApplicationOverview = "//a[contains(text(),' Application Overview ')]";
	private static final String AppId = "//div[contains(text(),'APP ID')]/..//div[2]";

	private static final String Personaldetails = "//span[contains(text(),'PERSONAL DETAILS')]";

	private static final String Newapplicatin_form = "//a[contains(text(),'Application Form ')]";

	private static final String Salutation = "//div[@class='mat-form-field-infix'][contains(.,'Salutation  *')]//div[@class='mat-select-arrow-wrapper']";

	private static final String selectMr = "//span[contains(text(),'Mr.')]";

	private static final String calenderIcon = "//div[@class='calendar-btn-group']";

	private static final String EmailId = "//input[@type='email']";

	private static final String Gender = "//div[@class='mat-form-field-infix'][contains(.,'Gender  *')]//div[@class='mat-select-arrow-wrapper']";

	private static final String MALE = "//span[@class='mat-option-text'][contains(text(),'MALE')]";

	private static final String Maritalstatus = "//div[@class='mat-form-field-infix'][contains(.,'Marital Status  *')]//div[@class='mat-select-arrow-wrapper']";

	private static final String Singleselection = "//span[@class='mat-option-text'][contains(text(),'Single')]";

	private static final String Mothername = "//div[@class='mat-form-field-infix'][contains(.,'Mother Maiden Name  *')]//input[starts-with(@id,'mat-input-')]";

	private static final String Fathername = "//div[@class='mat-form-field-infix'][contains(.,'Father Name  *')]//input[starts-with(@id,'mat-input-')]";

	private static final String GrossIncome = "//div[@class='mat-form-field-infix'][contains(.,'Gross Income  *')]//input[starts-with(@id,'mat-input-')]";

	private static final String Companyname = "//div[@class='mat-form-field-infix'][contains(.,'Company Name  *')]//div[@class='mat-select-arrow-wrapper']";
	
	private static final String companyselection="//span[contains(text(),'3F INDUSTRIES LIMITED')]";

	private static final String Occupation = "//div[@class='mat-form-field-infix'][contains(.,'Occupation   *')]//div[@class='mat-select-arrow-wrapper']";
	private static final String Occupationselection = "//span[contains(text(),'Salaried (Private ltd)')]";

	private static final String Designation = "//div[@class='mat-form-field-infix'][contains(.,'Designation   *')]//div[@class='mat-select-arrow-wrapper']";
	private static final String Designationselection = "//span[@class='mat-option-text'][contains(text(),'TESTDES')]";

	private static final String Industry = "//div[@class='mat-form-field-infix'][contains(.,'Industry   *')]//div[@class='mat-select-arrow-wrapper']";

	private static final String Industryselection = "//span[@class='mat-option-text'][contains(text(),'IT')]";

	// .......................Address
	// details...............................................................//

	private static final String Addressdetaisicon = "//span[contains(text(),'ADDRESS DETAILS')]/../span[@class='star-icon']";
	private static final String Addressone = "(//input[starts-with(@id,'mat-input-')])[position()=11]";
	private static final String Addresstwo = "(//input[starts-with(@id,'mat-input-')])[position()=12]";
	private static final String addresspin = "(//input[starts-with(@id,'mat-input-')])[position()=13]";
	private static final String AddressState = "(//div[contains(@class,'mat-select-arrow-wrapper')])[8]";
	private static final String AddressTelanaga = "//span[contains(text(),'TELANGANA')]";
	private static final String AddressCity = "(//div[contains(@class,'mat-select-arrow-wrapper')])[9]";
	private static final String AddressHyderabad = "//span[contains(text(),'HYDERABAD')]";
	private static final String AddressMobile = "(//input[starts-with(@id,'mat-input-')])[position()=16]";
	private static final String AddressYes = "(//div[contains(@class,'mat-select-arrow-wrapper')])[10]";
	private static final String AddressYesselection = "//span[contains(text(),'YES')]";

	private static final String AddressOwndedby = "(//div[@class='mat-form-field-infix'][contains(.,'Owned by  *')])[1]//input[starts-with(@id,'mat-input-')]";

	// .......................Company adress address
	// details...............................................................//

	private static final String Checkboxicon = "//div[@class='mat-checkbox-inner-container']";

	private static final String Companytaddressone = "(//input[starts-with(@id,'mat-input-')])[position()=25]";
	private static final String Companyaddresstwo = "(//input[starts-with(@id,'mat-input-')])[position()=26]";

	private static final String Companypincode = "(//input[starts-with(@id,'mat-input-')])[position()=27]";

	private static final String Companystate = "(//div[contains(@class,'mat-select-arrow-wrapper')])[14]";

	private static final String Companytelanana = "//div[starts-with(@id,'cdk-overlay')]//span[contains(text(),'TELANGANA')]";

	private static final String Companycity = "(//div[contains(@class,'mat-select-arrow-wrapper')])[15]";

	private static final String CompanyHyderabad = "//div[starts-with(@id,'cdk-overlay')]//span[contains(text(),'HYDERABAD')]";

	// .......................checkbox tweo
	// details...............................................................//

	private static final String Permentaddessradiobutton = "(//div[contains(@class,'mat-radio-outer-circle')])[1]";

	// .......................CoApplicant...............................................................//

	private static final String YESoRNo = "//div[contains(text(),'No')]";

	private static final String Saveandcontiune = "//span[contains(text(),'SAVE & CONTINUE')]";
	
	
	
	public CustomerPage clickonapplicationoverview() {
		
       waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));
		
		waitForTextToAppear("CUSTOMER");
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));


		waitFor(ApplicationOverview).$(ApplicationOverview).click();

		return this;
		
	}
	
	
	public String gettheapplicationidlink() {
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));
		
		waitForTextToAppear("OVERVIEW");


		String  Applicationid = waitFor(AppId).$(AppId).getText();

		

		//String latestapplicationid = Serenity.sessionVariableCalled("applicationid");

		System.out.println("Application id " + Applicationid);

			return Applicationid;
			
		}
	
	
	public CustomerPage gettheapplicationlink() {
		
          waitFor(Newapplicatin_form).$(Newapplicatin_form).click();
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		return this;

	}
	

	
	
	
	public CustomerPage addtopersonaldetails() throws InterruptedException {

		waitForTextToAppear("PERSONAL DETAILS");

		waitFor(Salutation).$(Salutation).click();

		waitFor(selectMr).$(selectMr).click();

		waitFor(Gender).$(Gender).click();

		waitFor(MALE).$(MALE).click();

		waitFor(calenderIcon).$(calenderIcon).click();
		
		DatepickerUtiles date = new DatepickerUtiles(driver);


		date.selectDateFromCalendar("16/06/1992");

		waitFor(EmailId).$(EmailId).type("raghu.ajjiboina@jocata.com");

		waitFor(Maritalstatus).$(Maritalstatus).click();

		waitFor(Singleselection).$(Singleselection).click();

		waitFor(Mothername).$(Mothername).type("Lakshmi");

		waitFor(Fathername).$(Fathername).type("ACPeddaiah");

		waitFor(GrossIncome).$(GrossIncome).type("1000000");
		waitFor(Companyname).$(Companyname).click();
		
		waitFor(companyselection).$(companyselection).click();

		

		waitFor(Occupation).$(Occupation).click();

		waitFor(Occupationselection).$(Occupationselection).click();

		waitFor(Designation).$(Designation).click();

		waitFor(Designationselection).$(Designationselection).click();
		;

		waitFor(Industry).$(Industry).click();
		;

		waitFor(Industryselection).$(Industryselection).click();
		;

		return this;
	}

	public CustomerPage gettheaddressdetails() {

		waitFor(Addressdetaisicon).$(Addressdetaisicon).click();

		waitFor(Addressone).$(Addressone).type("SR nager");

		waitFor(Addresstwo).$(Addresstwo).type("Maddikera");

		waitFor(addresspin).$(addresspin).type("518385");

		waitFor(AddressState).$(AddressState).click();

		waitFor(AddressTelanaga).$(AddressTelanaga).click();
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));


		waitFor(AddressCity).$(AddressCity).click();

		waitFor(AddressHyderabad).$(AddressHyderabad).click();

		waitFor(AddressMobile).$(AddressMobile).type("9030828504");

		waitFor(AddressYes).$(AddressYes).click();

		waitFor(AddressYesselection).$(AddressYesselection).click();

		waitFor(AddressOwndedby).$(AddressOwndedby).type("KPHB");

		return this;

	}

	public CustomerPage getpermamantaddressdetails() throws InterruptedException {

		waitFor(Checkboxicon).$(Checkboxicon).click();
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));


		waitFor(Companytaddressone).$(Companytaddressone).type("Lingampally");

		waitFor(Companyaddresstwo).$(Companyaddresstwo).type("USA");

		waitFor(Companypincode).$(Companypincode).type("518385");

		waitFor(Companystate).$(Companystate).click();

		waitFor(Companytelanana).$(Companytelanana).click();
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));


		waitFor(Companycity).$(Companycity).click();

		waitFor(CompanyHyderabad).$(CompanyHyderabad).click();
		
		Thread.sleep(13000);

		
		WebElement ele = waitFor(Permentaddessradiobutton).$(Permentaddessradiobutton);
				
			
		//driver.findElement(By.xpath("(//div[contains(@class,'mat-radio-outer-circle')])[1]"));

		DatepickerUtiles date = new DatepickerUtiles(driver);

		date.clickElementByJS(ele,driver);

		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));


		return this;

	}

	/*public CustomerPage performsradiobutton() {

		evaluateJavascript(Permentaddessradiobutton, "arguments[0].click()");

		return this;

	}*/

	public LoandetailsPage coapplicant() {
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

		waitFor(YESoRNo).$(YESoRNo).click();
		waitFor(Saveandcontiune).$(Saveandcontiune).click();
		
		waitForAbsenceOf(waitforloading).shouldNotBeVisible(By.xpath("//div[@class='loadingOverlay']"));

            System.out.println("--------------------Latest-------------");
		
            return this.switchToPage(LoandetailsPage.class);

	}

}
