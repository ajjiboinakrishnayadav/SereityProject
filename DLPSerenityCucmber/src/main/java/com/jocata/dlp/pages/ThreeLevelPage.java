package com.jocata.dlp.pages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import furs.UsernameListlevels;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import java.util.Map.Entry;

import org.openqa.selenium.By;

import start.RaghuCmuser;
import start.RaghuFIUser;
import start.RaghuRcuuser;

public class ThreeLevelPage extends BasePage{

	
	private static final String CM = "Assigning to CM";

	private static final String RCU = "Assigning to RCU";
	private static final String FI = "Assigning to FI";
	// private static final String Rops = "Assigning to FI";
	private static final String Ops = "Assigning to Ops";

	public static RaghuCmuser cmuser;
	public static String cmusername;

	public static RaghuRcuuser rcuuser;
	public static String rcuuserlatest;

	public static RaghuFIUser fiuser;
	public static String fiusername;
	
	
	
	
	public ThreeLevelPage performthreelevels() throws InterruptedException {

		UsernameListlevels user = new UsernameListlevels();
		
		
		String latestapplicationid = Serenity.sessionVariableCalled("applicationid");

		
		Thread.sleep(9000);


		HashMap<String, String> userList = user.getname(latestapplicationid);

		Set<Entry<String, String>> userlist = userList.entrySet();
		Iterator iterator = userlist.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey());
			System.out.println(" Value is: " + mentry.getValue().toString());

			String value = mentry.getValue().toString();

			switch (value) {
			case CM:
				System.out.println("perform CM actions" + mentry.getKey());

				// select user_name from jg_um.jum_user_credentials where
				// user_id=107;
				cmuser = new RaghuCmuser();
				cmusername = cmuser.getthecmuser(mentry.getKey().toString());

				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				System.out.println(" Login CM username " + cmusername);

				Thread.sleep(13000);

				//shopper.getlunch();
				Thread.sleep(13000);

				getcmuseractions(cmusername);
				Thread.sleep(13000);

				break;
			case RCU:
				System.out.println("perform RCU actions" + mentry.getKey());

				rcuuser = new RaghuRcuuser();
				rcuuserlatest = rcuuser.getthercususer(mentry.getKey().toString());

				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				System.out.println(" Login RCU username " + rcuuserlatest);
				Thread.sleep(13000);
				//shopper.getlunch();
				Thread.sleep(13000);

				getrmuseractions(rcuuserlatest);
				Thread.sleep(13000);

				break;
			case FI:
				System.out.println("perform FI actions");

				fiuser = new RaghuFIUser();
				fiusername = fiuser.getfiuser(mentry.getKey().toString());

				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				System.out.println(" Login FI username " + fiusername);
				Thread.sleep(13000);

				//shopper.getlunch();
				Thread.sleep(13000);

				getFIuseractions(fiusername);
				Thread.sleep(13000);

				break;
			case Ops:
				System.out.println("perform ops actions");
				break;

			default:
				break;
			}

		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Thread.sleep(13000);

		return this;

	}
	
	
	
	
	public void getcmuseractions(String cmusername) throws InterruptedException {
		// find(By.xpath("//input[@placeholder='Username']")).type(cmusername);
		// Thread.sleep(1000);
		System.out.println("CM user level is===one  " + cmusername);

		
		Thread.sleep(13000);


		find(By.xpath("//input[@placeholder='Username']")).type(cmusername);
		Thread.sleep(3000);

		find(By.xpath("//input[@placeholder='Password']")).type("Joc@123");
		Thread.sleep(3000);

		find(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);

		try {

			String invalidcredentails = find(By.xpath("//div[contains(text(),' Invalid credentials ')]"))
					.getAttribute("innerHTML");

			System.out.println("�nvalid credentails message" + invalidcredentails);

			if (invalidcredentails.contains("Invalid credentials")) {
				System.out.println("Please enter current password");
			} else {
				System.out.println("Test Case Failed");
			}

			// Please enter current credentails

			Thread.sleep(4000);

			find(By.xpath("//input[@placeholder='Username']")).clear();
			Thread.sleep(3000);

			find(By.xpath("//input[@placeholder='Username']")).type(cmusername);
			Thread.sleep(3000);
			find(By.xpath("//input[@placeholder='Password']")).clear();

			find(By.xpath("//input[@placeholder='Password']")).type("Jocata@111");
			Thread.sleep(3000);
			find(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {

			System.out.println("Elementfound: " + e.getMessage() + "\n-----------------------");

		}

		Thread.sleep(20000);
		
		//CustomerPage custpage=shopper.getcustomerpersonaldetails();
		String latestapplicationid = Serenity.sessionVariableCalled("applicationid");


		Thread.sleep(9000);

		find(By.xpath("//mat-label[contains(text(),'PLDLP" + latestapplicationid + "')]")).click();

		Thread.sleep(40000);
		Thread.sleep(40000);

		find(By.xpath("//span[contains(text(),'CONTINUE')]")).click();

		Thread.sleep(29000);

		find(By.xpath("//span[contains(text(),'SAVE & CONTINUE')]")).click();
		Thread.sleep(19000);

		//find(By.xpath("//span[contains(text(),'SAVE & CONTINUE')]")).click();


		Thread.sleep(19000);
		find(By.xpath("//span[contains(text(),'SUBMIT')]")).click();
		Thread.sleep(9000);

		find(By.xpath("//div[contains(text(),'DOCUMENTS')]")).click();
		Thread.sleep(9000);
		find(By.xpath("//span[contains(text(),'SAVE & CONTINUE')]")).click();
		Thread.sleep(9000);
		find(By.xpath("//span[contains(text(),'SAVE & CONTINUE')]")).click();
		Thread.sleep(9000);
		find(By.xpath("//a[contains(text(),'Cam')]")).click();
		Thread.sleep(9000);
		find(By.xpath("//span[contains(text(),'T & C')]")).click();
		Thread.sleep(9000);
		find(By.xpath("//span[contains(text(),'APPROVE')]")).click();
		Thread.sleep(9000);
		find(By.xpath("//input[contains(@type,'text')]")).type("cmuserapproved");
		Thread.sleep(9000);
		find(By.xpath("//span[contains(text(),'ACCEPT')]")).click();

		Thread.sleep(9000);

		Thread.sleep(50000);

		find(By.xpath("//div[@class='current-user']")).click();
		Thread.sleep(15000);
		find(By.xpath("//a[contains(text(),'Logout')]")).click();

		Thread.sleep(35000);

	}
	
	public void getrmuseractions(String rcuuserlatest) throws InterruptedException {
		// find(By.xpath("//input[@placeholder='Username']")).type(cmusername);
		// Thread.sleep(1000);
		System.out.println("RCU user level is --->two" + rcuuserlatest);

		// find(By.xpath("//input[@placeholder='Password']")).type("Joc@123");
		// Thread.sleep(1000);

		// find(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(5000);

		find(By.xpath("//input[@placeholder='Username']")).type(rcuuserlatest);
		Thread.sleep(3000);

		find(By.xpath("//input[@placeholder='Password']")).type("Joc@123");
		Thread.sleep(3000);

		find(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);

		try {

			String invalidcredentails = find(By.xpath("//div[contains(text(),' Invalid credentials ')]"))
					.getAttribute("innerHTML");

			System.out.println("�nvalid credentails message" + invalidcredentails);

			if (invalidcredentails.contains("Invalid credentials")) {
				System.out.println("Please enter current password");
			} else {
				System.out.println("Test Case Failed");
			}

			// Please enter current credentails

			Thread.sleep(14000);

			find(By.xpath("//input[@placeholder='Username']")).clear();
			Thread.sleep(13000);

			find(By.xpath("//input[@placeholder='Username']")).type(rcuuserlatest);
			Thread.sleep(13000);
			find(By.xpath("//input[@placeholder='Password']")).clear();

			find(By.xpath("//input[@placeholder='Password']")).type("Jocata@111");
			Thread.sleep(3000);
			find(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {

			System.out.println("Elementfound: " + e.getMessage() + "\n-----------------------");

		}

		Thread.sleep(40000);
		
		//CustomerPage custpage=shopper.getcustomerpersonaldetails();
		String latestapplicationid = Serenity.sessionVariableCalled("applicationid");
		Thread.sleep(9000);


		find(By.xpath("//mat-label[contains(text(),'PLDLP" + latestapplicationid + "')]")).click();

		Thread.sleep(40000);
		//Thread.sleep(40000);

		find(By.xpath("//textarea[starts-with(@id,'mat-input-')]")).type("Approvedrcuuser");
		Thread.sleep(9000);
		find(By.xpath("//div[@class='mat-select-arrow-wrapper']")).click();
		// Thread.sleep(9000);
		// find(By.xpath("//mat-select[@role='listbox']//div[@class='mat-select-arrow-wrapper']")).click();
		Thread.sleep(9000);
		find(By.xpath("//span[contains(text(),'Approve')]")).click();
		Thread.sleep(9000);
		find(By.xpath("//span[contains(text(),'SAVE & CONTINUE')]")).click();
		Thread.sleep(9000);

		find(By.xpath("//input[contains(@type,'text')]")).type("rcuuserapproved");
		Thread.sleep(9000);
		find(By.xpath("//span[contains(text(),'ACCEPT')]")).click();

		Thread.sleep(50000);

		find(By.xpath("//div[@class='current-user']")).click();
		Thread.sleep(5000);
		find(By.xpath("//a[contains(text(),'Logout')]")).click();

		Thread.sleep(15000);

	}

	public void getFIuseractions(String fiusername) throws InterruptedException {
		// find(By.xpath("//input[@placeholder='Username']")).type(cmusername);
		// Thread.sleep(1000);
		System.out.println("FI user level two--->three" + fiusername);

		// find(By.xpath("//input[@placeholder='Password']")).type("Joc@123");
		// Thread.sleep(1000);

		// find(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(15000);

		find(By.xpath("//input[@placeholder='Username']")).type(fiusername);
		Thread.sleep(3000);

		find(By.xpath("//input[@placeholder='Password']")).type("Joc@123");
		Thread.sleep(3000);

		find(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);

		try {

			String invalidcredentails = find(By.xpath("//div[contains(text(),' Invalid credentials ')]"))
					.getAttribute("innerHTML");

			System.out.println("�nvalid credentails message" + invalidcredentails);

			if (invalidcredentails.contains("Invalid credentials")) {
				System.out.println("Please enter current password");
			} else {
				System.out.println("Test Case Failed");
			}

			// Please enter current credentails

			Thread.sleep(4000);

			find(By.xpath("//input[@placeholder='Username']")).clear();
			Thread.sleep(3000);

			find(By.xpath("//input[@placeholder='Username']")).type(fiusername);
			Thread.sleep(3000);
			find(By.xpath("//input[@placeholder='Password']")).clear();

			find(By.xpath("//input[@placeholder='Password']")).type("Jocata@111");
			Thread.sleep(3000);
			find(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {

			System.out.println("Elementfound: " + e.getMessage() + "\n-----------------------");

		}

		Thread.sleep(20000);

		
		//CustomerPage custpage=shopper.getcustomerpersonaldetails();
		String latestapplicationid = Serenity.sessionVariableCalled("applicationid");
		Thread.sleep(9000);

		find(By.xpath("//mat-label[contains(text(),'PLDLP" + latestapplicationid + "')]")).click();

		Thread.sleep(60000);
		//Thread.sleep(40000);

		find(By.xpath("//div[@class='mat-select-arrow-wrapper']")).click();
		Thread.sleep(9000);
		find(By.xpath("//span[contains(text(),'OFFICE ADDRESS')]")).click();
		Thread.sleep(9000);

		find(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]")).click();
		Thread.sleep(9000);

		find(By.xpath("//span[contains(text(),'Approve')]")).click();
		Thread.sleep(9000);

		find(By.xpath("//input[contains(@type,'text')]")).type("raghufiapproved");
		;
		Thread.sleep(9000);

		find(By.xpath("//span[contains(text(),'SAVE & CONTINUE')]")).click();

		Thread.sleep(9000);

		find(By.xpath("(//input[contains(@type,'text')])[2]")).type("raghufiapproved");
		Thread.sleep(9000);

		find(By.xpath("//span[contains(text(),'ACCEPT')]")).click();
		Thread.sleep(33000);

		Thread.sleep(60000);

		find(By.xpath("//div[@class='current-user']")).click();
		Thread.sleep(5000);
		find(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(15000);

	}

}
