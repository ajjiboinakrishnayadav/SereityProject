package com.jocata.dlp.pages;

public class LoginPage extends BasePage {

	private static final String USER_NAME_INPUT = "//input[@placeholder='Username']";

	private static final String PASSWORD_INPUT = "//input[@placeholder='Password']";

	private static final String LOGIN_BUTTON = "//div[@class='right-btn login-button']";

	private static final String REGISTER_NOW_LINK = "//*[@id='Catalog']//a[contains(text(),'Register Now!')]";

	private static final String INVALID_LOGIN_LABEL = "//*[@id='Content']/ul/li";

	public static String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Method used to login to the store
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */

	public LoginPage enterusername(String userName) {

		waitFor(USER_NAME_INPUT).$(USER_NAME_INPUT).type(userName);

		return this;

	}

	public LoginPage enterpassword(String password) {

		waitFor(PASSWORD_INPUT).$(PASSWORD_INPUT).type(password);

		return this;

	}
	
	public LoginPage clickingonlogin() {

		waitFor(LOGIN_BUTTON).$(LOGIN_BUTTON).click();

		return this;

	}
	

	public LoginPage doLogin(String userName, String password) {
		open();

		// waitForTextToAppear("Please enter your username and password.");

		// waitForTextToAppear("Need a user name and password?");

		waitFor(USER_NAME_INPUT).$(USER_NAME_INPUT).type(userName);

		waitFor(PASSWORD_INPUT).$(PASSWORD_INPUT).type(password);

		setPassword(password);

		waitFor(LOGIN_BUTTON).$(LOGIN_BUTTON).click();

		return this;

	}

	/**
	 * Method to navigate to the Regisration Page
	 * 
	 * @return
	 */
	/*
	 * public AccountsPage navigateToRegistrationPage() {
	 * 
	 * waitForTextToAppear("Please enter your username and password.");
	 * 
	 * waitForTextToAppear("Need a user name and password?");
	 * 
	 * waitFor(REGISTER_NOW_LINK).$(REGISTER_NOW_LINK).click();
	 * 
	 * return this.switchToPage(AccountsPage.class);
	 * 
	 * }
	 */

	/**
	 * Method to return invalid login message
	 * 
	 * @return
	 */
	public String getMessageOnInvalidLogin() {

		return waitFor(INVALID_LOGIN_LABEL).$(INVALID_LOGIN_LABEL).getText();
	}
}
