package com.jocata.dlp.pages;

public class FiUserPage extends BasePage {
	
	private static final String Arrowrapper = "//div[@class='mat-select-arrow-wrapper']";
	private static final String Officeaddress = "//span[contains(text(),'OFFICE ADDRESS')]";

	private static final String Arrow = "(//div[contains(@class,'mat-select-arrow-wrapper')])[3]";
	
	private static final String Approver = "//span[contains(text(),'Approve')]";

	private static final String typeandtext = "//input[contains(@type,'text')]";
	
	private static final String saveandcontiune = "//span[contains(text(),'SAVE & CONTINUE')]";

	private static final String fiapproved = "(//input[contains(@type,'text')])[2]";

	private static final String Accept = "//span[contains(text(),'ACCEPT')]";


}
