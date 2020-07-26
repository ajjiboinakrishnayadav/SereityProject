package com.jocata.cucumber.steps;

import java.io.IOException;

import org.assertj.core.api.SoftAssertions;

import com.jocata.cucumber.serenity.steps.DLPPLSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import start.deletepannumbers;

public class PLJounerySteps {
	
	
	@Steps
	DLPPLSteps dlpplsteps;
 
	
	

	@Given("^user navigate to the DLP PL URL page$")
	public void user_navigate_to_the_DLP_PL_URL_page() {
		
		dlpplsteps.getlunch();

	}


	@Given("^user enters username with \"([^\"]*)\"$")
	public void user_enters_username_with(String userName) {
		
		dlpplsteps.gettheusername(userName);
		
	}

	@Given("^user enters password with \"([^\"]*)\"$")
	public void user_enters_password_with(String password) {

		dlpplsteps.getthepassword(password);

		
	}

	@Given("^user clicks login button$")
	public void user_clicks_login_button() {

		dlpplsteps.byclickinglogin();
		
	}

	@Then("^taskboard page should be displayed$")
	public void taskboard_page_should_be_displayed() {
		
		System.out.println("takboard page is displayed");
		
		

	}

	@When("^the user clicks on newapplication link$")
	public void the_user_clicks_on_newapplication_link() {

		dlpplsteps.byclickingonnewapplicationlink();
	}

	@Then("^New application submission form displayed$")
	public void new_application_submission_form_displayed() {

		System.out.println("new application form diaplyed");

	}

	@Then("^user enters in  mobile number with \"([^\"]*)\"$")
	public void user_enters_in_mobile_number_with(String phonenumber) {

		dlpplsteps.byenteringthephonenumber(phonenumber);
	}

	@Then("^user enters Pan number from Database$")
	public void user_enters_Pan_number_from_Database() throws InterruptedException {
		
		deletepannumbers deletepannum = new deletepannumbers();
		String deletenumber = deletepannum.deletepannumber();
		System.out.println("deleted pan number --" + deletenumber);
		Thread.sleep(6000);
		System.out.println("enter the pan number");

		
       dlpplsteps.byenterthepannumbers(deletenumber);
      // dlpplsteps.byenterthepannumbers("AWFPA9541F");

	
	}

	@Then("^user clicks on the state dropdown$")
	public void user_clicks_on_the_state_dropdown() {

		dlpplsteps.byclickingonstatedropdown();
	}

	@Then("^user selects the state as TELANGANA$")
	public void user_selects_the_state_as_TELANGANA() {
	
		dlpplsteps.byselectingtelanagadropdown();

	}


	@Then("^user clicks on the city dropdown$")
	public void user_clicks_on_the_city_dropdown() {
		
		dlpplsteps.byclickingoncitydropdown();

	}

	@Then("^user selects the city as HYDERABAD$")
	public void user_selects_the_city_as_HYDERABAD() {
		dlpplsteps.byselectingcitydropdown();

	}

	@Then("^user clicks on the submit button$")
	public void user_clicks_on_the_submit_button() {
		dlpplsteps.byclickingsubmitbutton();

	}

	@Then("^user must able to see the application form screen$")
	public void user_must_able_to_see_the_application_form_screen() {
		
		System.out.println("üser able to see the application form");
		
	/*	String errormessage=dlpplsteps.verifyerrormessage();
		
		  SoftAssertions softAssertion = new SoftAssertions();

		  softAssertion.assertThat(errormessage).contains("Application exists with this PAN number");
		  
		  softAssertion.assertAll();
*/
		  
		  
	}

	

	@When("^user click on application overview link$")
	public void user_click_on_application_overview_link() throws InterruptedException, IOException {
		
		
		dlpplsteps.gettheapplicationoverviewlink();

	}

	@Then("^Application id is dispalyed in overview screen$")
	public void application_id_is_dispalyed_in_overview_screen() throws InterruptedException, IOException {
		

		String applicationid= dlpplsteps.getthelatestapplicationid();
		
		Thread.sleep(3000);
		
		Serenity.setSessionVariable("applicationid").to(applicationid);
		
		System.out.println("The application id  is displayed");

	}

	@Then("^the page redirected to the application form screen$")
	public void the_page_redirected_to_the_application_form_screen() throws InterruptedException, IOException {
		
		dlpplsteps.getthenewapplicationform();

	}

	@Then("^user fill the personal details$")
	public void user_fill_the_personal_details() throws InterruptedException, IOException {
		
		dlpplsteps.gethepersonaldetails();

	}
	
	@Then("^user fill the address details$")
	public void user_fill_the_address_details() throws InterruptedException, IOException {
		
		dlpplsteps.gettheaddressdetails();

	}
	
	@Then("^user fill the companyaddress details$")
	public void user_fill_the_companyaddress_details() throws InterruptedException, IOException {
		
		dlpplsteps.getpermentaddress();

	}
	
	@Then("^user verify the coapplicant and click and save and continue button$")
	public void user_verify_the_coapplicant_and_click_and_save_and_continue_button() throws InterruptedException, IOException {
		
		dlpplsteps.getthecoapplicant();

	}
	
	
	@And("^user fill the loan details$")
	public void user_fill_the_loan_details() throws InterruptedException, IOException {
		
		dlpplsteps.loandetails();

	}
	
	@And("^user uploads some docments$")
	public void user_uploads_some_docments() throws InterruptedException, IOException {
		
		dlpplsteps.documentdetailsection();

	}
	
	@And("^user fill the pricingadcharges$")
	public void user_fill_the_pricingadcharges() throws InterruptedException, IOException {
		
		dlpplsteps.pricingandchares();

	}
	
	@And("^the user logged in as CPA user$")
	public void the_user_logged_in_as_CPA_user() throws InterruptedException, IOException {
		
		dlpplsteps.gethecpauserdetails();

	}
	
	@And("^CPA user perform actions$")
	public void CPA_user_perform_actions() throws InterruptedException, IOException {
		
		dlpplsteps.performactionscpauser();

	}
	
	@And("^User perform actions on RM,FI,CM user levels$")
	public void User_perform_actions_on_RM_FI_CM_user_levels() throws InterruptedException, IOException {
		
		dlpplsteps.getperformthreelevles();

	}
}
