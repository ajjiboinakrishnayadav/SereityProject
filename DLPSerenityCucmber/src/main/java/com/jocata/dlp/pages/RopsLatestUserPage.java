package com.jocata.dlp.pages;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import start.Ropsassignuser;
import start.Ropsuser;


public class RopsLatestUserPage extends  PageObject{

	
	
	private WebDriver driver;
	
	
	
	

	public RopsLatestUserPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String applicationusername;
	
	
	public void  ropsuserloginapplicationid() throws InterruptedException {
		
		/*CustomerPage custpage= new CustomerPage(driver);
		String applicationid= custpage.getApplicationid();
*/
	    Thread.sleep(13000);

		
	    Thread.sleep(13000);

		Ropsuser rops =new Ropsuser();
		//String appId = CustomerPage.Applicationid;

	    /* String applicationidassign=rops.gettheropsuser(applicationid);
		
	     System.out.println("assigning application the value in DB is "+applicationidassign); // 
		*/
			Thread.sleep(9000);

	     Ropsassignuser ropsassign= new Ropsassignuser();
			
	      //applicationusername=ropsassign.gettheropsuser(applicationidassign);
		
		System.out.println("assigning the username value in DB is "+applicationusername);
		
	
	}
		
	
	public void ropsusersecond() throws InterruptedException {
		
		 Thread.sleep(20000);

			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(applicationusername);
			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Joc@123");
			Thread.sleep(3000);

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(4000);

			try {

				String invalidcredentails = driver.findElement(By.xpath("//div[contains(text(),' Invalid credentials ')]"))
						.getAttribute("innerHTML");

				System.out.println("Ã�nvalid credentails message" + invalidcredentails);

				if (invalidcredentails.contains("Invalid credentials")) {
					System.out.println("Please enter current password");
				} else {
					System.out.println("Test Case Failed");
				}
				

				// Please enter current credentails
				
				Thread.sleep(4000);

				driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
				Thread.sleep(3000);

				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(applicationusername);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();

				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Jocata@111");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(14000);
			} catch (Exception e) {

				System.out.println("Elementfound: " + e.getMessage() + "\n-----------------------");

			}
			
			Thread.sleep(4000);
			
		/*	CustomerPage custpage= new CustomerPage(driver);
			String applicationid= custpage.getApplicationid();
*/
		   
			Thread.sleep(9000);

		//	clickapplicationlink(applicationid);
			Thread.sleep(4000);

			clickonropsbutton();
			
		
		
	}
	
	
	
	public void  clickapplicationlink(String applicationid) throws InterruptedException {
		
		  Thread.sleep(20000);

 	
 	driver.findElement(By.xpath("//mat-label[contains(text(),'PLDLP"+applicationid+"')]")).click();
 	
		  Thread.sleep(60000);


 }
	//@Step("Perform Rops user")

	 public void clickonropsbutton() throws InterruptedException {
		 
		  Thread.sleep(60000);
		  //Thread.sleep(60000);


		 driver.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(text(),'Reopen')]")).click();
		  Thread.sleep(19000);

		 driver.findElement(By.xpath("//textarea[@placeholder='Comments']")).sendKeys("approvedropsuser");
		  Thread.sleep(9000);

		 driver.findElement(By.xpath("//span[contains(text(),'SUBMIT')]")).click();
		 
		  Thread.sleep(60000);
	    	
		    driver.findElement(By.xpath("//div[@class='current-user']")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		   
		  Thread.sleep(29000);
			
			

	 }
}
