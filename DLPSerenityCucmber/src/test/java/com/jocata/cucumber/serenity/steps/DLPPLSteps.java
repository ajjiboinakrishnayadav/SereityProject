package com.jocata.cucumber.serenity.steps;

import java.io.IOException;

import com.jocata.dlp.pages.CPAUserPage;
import com.jocata.dlp.pages.CustomerPage;
import com.jocata.dlp.pages.DashBoardPage;
import com.jocata.dlp.pages.DocumentsPage;
import com.jocata.dlp.pages.LoandetailsPage;
import com.jocata.dlp.pages.LoginPage;
import com.jocata.dlp.pages.Lunchbrowserpage;
import com.jocata.dlp.pages.PostgressCPAuser;
import com.jocata.dlp.pages.PostgressRopsuser;
import com.jocata.dlp.pages.PricingandChargesPage;
import com.jocata.dlp.pages.ThreeLevelPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DLPPLSteps extends ScenarioSteps {

	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	CustomerPage customerpage;
	LoandetailsPage loandetailspage;
	DocumentsPage documentpage;
	PricingandChargesPage pricingpage;

	PostgressRopsuser postgressropsuser;

	PostgressCPAuser postgresscpauser;

	Lunchbrowserpage lunchbrowserpage;
	
	ThreeLevelPage   threeLevelPage;
	
	CPAUserPage cpauserpage;

	@Step("Lunch the browser in DLP PL application")
	public Lunchbrowserpage getlunch() {
		return lunchbrowserpage.browsertest();
	}
	
	

	@Step("Enter the username in userName: {0} ")
	public LoginPage gettheusername(String userName) {
		return loginPage.enterusername(userName);
	}
	
	@Step("Enter the username in password: {0} ")
	public LoginPage getthepassword(String password) {
		return loginPage.enterpassword(password);
	}
	
	@Step("Clicking on Login button")
	public LoginPage byclickinglogin() {
		return loginPage.clickingonlogin();
	}
	
	
	@Step("Clicking on new application link ")
	public DashBoardPage byclickingonnewapplicationlink() {
		return dashBoardPage.clickingonnewapplication();
	}
	
	
	@Step("Clicking on new application link ")
	public DashBoardPage byenteringthephonenumber(String phonenumber) {
		return dashBoardPage.enterthephonenumber(phonenumber);
	}
	
	
	@Step("Clicking on new application link ")
	public DashBoardPage byenterthepannumbers(String pannumbers) {
		return dashBoardPage.enterthepannumbers(pannumbers);
	}
	

	@Step("Clicking on the state dropdown ")
	public DashBoardPage byclickingonstatedropdown() {
		return dashBoardPage.clickingonstate();
	}
	
	@Step("selecting telanagana from state dropdown ")
	public DashBoardPage byselectingtelanagadropdown() {
		return dashBoardPage.selectingtelanagan();
	}
	
	
	@Step("Clicking on city dropdown ")
	public DashBoardPage byclickingoncitydropdown() {
		return dashBoardPage.clickingoncitydropdown();
	}
	
	@Step("selecting hyderabad from city dropdown")
	public DashBoardPage byselectingcitydropdown() {
		return dashBoardPage.selectingcitydropdown();
	}
	
	@Step("Clicking on submit button")
	public DashBoardPage byclickingsubmitbutton() {
		return dashBoardPage.clickingonsubmitbutton();
	}
	
	
	@Step("Verify the error message")
	public String verifyerrormessage() {
		return dashBoardPage.duplicatepanmessage();
	}
	
	
	@Step("Logging into the application with userName: {0} & passsword: {1}")
	public LoginPage doLogin(String userName, String password) {

		// basePage.clickSignOnLink();

		return loginPage.doLogin(userName, password);
	}
	
	

	// @Step("Connecting which user login to the application with appid: {0} &
	// ropsuserlogin: {1}")

	@Step("Getting the new application button link")
	public String getNewapplicationLink() {

		return dashBoardPage.getnewapplicationlink();
	}

	@Step("clicking on new application link")
	public DashBoardPage clickonnewapplication() {

		return dashBoardPage.createnewapplication();
	}

	@Step("Verify the application link ")
	public DashBoardPage gettheselectedapplicationlink() {

		return dashBoardPage.gettheselectedapplication();
	}

	@Step("Adding new application fields - phonenumber:{0} , pannumber:{1},")
	public DashBoardPage addAccountInformation(String phonenumber, String pannumber) {

		return dashBoardPage.fillingnewapplication(phonenumber, pannumber);
	}

	@Step("Verify the error message for pan nummber exits or  not")
	public String getverifymessage() {

		return dashBoardPage.duplicatepanmessage();
	}
/*
	@Step("Verify the personal details- application id ")
	public CustomerPage getcustomerpersonaldetails() throws InterruptedException {

		return customerpage.addtopersonaldetails();
	}*/

	/*
	 * @Step("Verify the clicking permanetaddress radiobutton") public
	 * CustomerPage getpermentradiobutton() throws InterruptedException {
	 * 
	 * return customerpage.performsradiobutton(); }
	 */

	@Step("Verify the clicking address details")
	public CustomerPage gettheaddressdetails() throws InterruptedException {

		return customerpage.gettheaddressdetails();
	}

	@Step("Verify the pernamant address details")
	public CustomerPage getpermentaddress() throws InterruptedException {

		return customerpage.getpermamantaddressdetails();
	}

	@Step("Verify the coapplicant ")
	public LoandetailsPage getthecoapplicant() throws InterruptedException {

		return customerpage.coapplicant();
	}

	@Step("Verify the address details")
	public CustomerPage addressdetails() throws InterruptedException {

		return customerpage.getpermamantaddressdetails();
	}

	@Step("Verify the Loan  details")
	public DocumentsPage loandetails() throws InterruptedException {

		return loandetailspage.gettheloandetails();
	}

	@Step("Verify the document  details")
	public PricingandChargesPage documentdetailsection() throws InterruptedException {

		return documentpage.getthedocumentdetails();
	}

	@Step("Verify the pricingandchares  details")
	public PricingandChargesPage pricingandchares() throws InterruptedException {

		return pricingpage.getthepricingandchares();
	}

	
	@Step("Verify the CPA user loginned or not ")
	public CPAUserPage gethecpauserdetails() throws InterruptedException {

		return cpauserpage.postgresscpausertest();
	}
	
	@Step("Performactions on CPA user")
	public CPAUserPage performactionscpauser() throws InterruptedException {

		return cpauserpage.Loginwiththecpauser();
	}
	
	
	@Step("Verify the PostgressRopsuser  details applicationid:{0} ")
	public PostgressRopsuser getheropsuser(String applicationid) throws InterruptedException {

		// return
		// postgressropsuser.ropsuserlogin(applicationid,applicationusername);
		return postgressropsuser.ropsuserloginapplicationid(applicationid);

	}
	/*
	 * @Step("Verify the PostgressRopsuser  details applicationid:{0} ") public
	 * PostgressRopsuser getheropsusername(String applicationidassign) throws
	 * InterruptedException {
	 * 
	 * //return
	 * postgressropsuser.ropsuserlogin(applicationid,applicationusername);
	 * return postgressropsuser.ropsuserapplicationid(applicationidassign);
	 * 
	 * }
	 */

	@Step("Verify the PostgressRopsuser  details applicationusername:{0}")
	public PostgressRopsuser getthelunchapplicationuser(String applicationusername) throws InterruptedException {

		return postgressropsuser.getthelunchapplication(applicationusername);
	}

	@Step("Verify the PostgressRopsuser  details applicationusername:{0}")
	public PostgressRopsuser gettheapplicationlink(String applicationid) throws InterruptedException {

		return postgressropsuser.clickapplicationlink(applicationid);
	}

	@Step("Verify the perormactionsrops user  details ")
	public PostgressRopsuser performactionsrops() throws InterruptedException {

		return postgressropsuser.clickonropsbutton();
	}

	@Step("Verify the cpauser  details applicationid:{0} ")
	public PostgressCPAuser gethecpauserlogindetails(String applicationid) throws InterruptedException {

		// return
		// postgressropsuser.ropsuserlogin(applicationid,applicationusername);
		return postgresscpauser.cpauserloginapplicationid(applicationid);

	}

	@Step("Verify the cpauser assign link  details applicationid:{0} ")
	public PostgressCPAuser gethecpauserassign(String applicationid) throws InterruptedException {

		// return
		// postgressropsuser.ropsuserlogin(applicationid,applicationusername);
		return postgresscpauser.clickapplicationlinkcpauser(applicationid);

	}

	@Step("Verify the cpauser actions link  details  ")
	public PostgressCPAuser getheactionsperfomed() throws InterruptedException, IOException {

		// return
		// postgressropsuser.ropsuserlogin(applicationid,applicationusername);
		return postgresscpauser.actionsperformedcpauser();

	}
	
	@Step("Click on application overview link")
	public CustomerPage gettheapplicationoverviewlink() throws InterruptedException, IOException {

		// return
		// postgressropsuser.ropsuserlogin(applicationid,applicationusername);
		return customerpage.clickonapplicationoverview();

	}
	
	@Step("The Created new application id is applicationid:{0}")
	public String getthelatestapplicationid() throws InterruptedException, IOException {

		// return
		// postgressropsuser.ropsuserlogin(applicationid,applicationusername);
		return customerpage.gettheapplicationidlink();

	}
	
	
	@Step("Clicking on new application form link")
	public CustomerPage getthenewapplicationform() throws InterruptedException, IOException {

		// return
		// postgressropsuser.ropsuserlogin(applicationid,applicationusername);
		return customerpage.gettheapplicationlink();

	}
	
	@Step("Fill  the all details in  Personal details screen")
	public CustomerPage gethepersonaldetails() throws InterruptedException, IOException {

		// return
		// postgressropsuser.ropsuserlogin(applicationid,applicationusername);
		return customerpage.addtopersonaldetails();

	}
	
	@Step("User perform actions on RM,FI,CM user levels")
	public ThreeLevelPage getperformthreelevles() throws InterruptedException, IOException {

		// return
		// postgressropsuser.ropsuserlogin(applicationid,applicationusername);
		return threeLevelPage.performthreelevels();

	}
}
