package com.jocata.dlp.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import start.CPAassignuser;
import start.CPAuser;

public class PostgressCPAuser extends DashBoardPage {
	
	private WebDriver driver;
	
	//public String cpausername;
	
	//public String applicationusername;
	
	/*public String getApplicationidassign() {
		return applicationidassign;
	}


	public void setApplicationidassign(String applicationidassign) {
		this.applicationidassign = applicationidassign;
	}
*/
	
	public PostgressCPAuser(WebDriver driver) {
		//super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public PostgressCPAuser cpauserloginapplicationid(String Applicationid) throws InterruptedException {

	    Thread.sleep(13000);

	    
	    CPAuser cpa =new CPAuser();
	   String  cpausername=cpa.getthecpauser(Applicationid);
		System.out.println("assigning the value is "+cpausername); // 204
		
	    Thread.sleep(3000);

		CPAassignuser cpaassign= new CPAassignuser();
		
		String applicationusername=cpaassign.gettcpaassignuser(cpausername);
		
		System.out.println("assigning the value is "+applicationusername); // 204
		
	    Thread.sleep(3000);
	    
	    Thread.sleep(5000);

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
			Thread.sleep(4000);
		} catch (Exception e) {

			System.out.println("Elementfound: " + e.getMessage() + "\n-----------------------");

		}
		
		return this;
	
	  }


public PostgressCPAuser clickapplicationlinkcpauser(String Applicationid) throws InterruptedException {
	
	  Thread.sleep(20000);


driver.findElement(By.xpath("//mat-label[contains(text(),'PLDLP"+Applicationid+"')]")).click();

	  Thread.sleep(40000);

		return this;

}

public PostgressCPAuser actionsperformedcpauser() throws InterruptedException, IOException {
	Thread.sleep(19000);
	  Thread.sleep(60000);

	  Thread.sleep(60000);

	
	/*ExtentManager.test.log(Status.PASS,
			MarkupHelper.createLabel(" - Test Case pass", ExtentColor.GREEN));
	String imgPath = BaseClass.screenShot(BaseClass.driver,"CPA user ");
	
	ExtentManager.test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
*/
	 
	 driver.findElement(By.xpath("//span[contains(text(),'CONTINUE')]")).click();
	 
		Thread.sleep(33000);
		
		 driver.findElement(By.xpath("//span[contains(text(),'SAVE & CONTINUE')]")).click();
			Thread.sleep(9000);

		 driver.findElement(By.xpath("//span[contains(text(),'SUBMIT')]")).click();
			Thread.sleep(9000);

         driver.findElement(By.xpath("//div[contains(text(),'DOCUMENTS')]")).click();
			Thread.sleep(9000);

         driver.findElement(By.xpath("//span[contains(text(),'SAVE & CONTINUE')]")).click();
			Thread.sleep(9000);

         driver.findElement(By.xpath("//span[contains(text(),'SAVE & CONTINUE')]")).click();
			Thread.sleep(9000);

		 driver.findElement(By.xpath("//a[contains(text(),'Cam')]")).click();
			Thread.sleep(9000);

		 driver.findElement(By.xpath("//span[contains(text(),'T & C')]")).click();
			Thread.sleep(9000);

		 
		 
        driver.findElement(By.xpath("//input[starts-with(@id,'mat-input-')]")).sendKeys("Testing");
		Thread.sleep(9000);

        driver.findElement(By.xpath("//i[starts-with(@class,'material-icons font-')]")).click();
		Thread.sleep(9000);

        
        driver.findElement(By.xpath("//span[contains(text(),'15')]")).click();
		Thread.sleep(9000);

        driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper']")).click();
		Thread.sleep(9000);

        driver.findElement(By.xpath("//span[contains(text(),'STANDARD')]")).click();
		Thread.sleep(12000);

        driver.findElement(By.xpath("(//input[starts-with(@id,'mat-input-')])[position()=3]")).sendKeys("Testing");
		Thread.sleep(9000);

        driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]")).click();        
		Thread.sleep(9000);

        driver.findElement(By.xpath("//span[contains(text(),'BEFORE DISBURSEMENT')]")).click();
		Thread.sleep(9000);

        driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]")).click();        
		Thread.sleep(9000);

        driver.findElement(By.xpath("//span[contains(text(),'Approve')]")).click();
		Thread.sleep(9000);

        
        driver.findElement(By.xpath("(//input[starts-with(@id,'mat-input-')])[position()=4]")).sendKeys("approvedcpauser");
		Thread.sleep(9000);

        driver.findElement(By.xpath("//span[contains(text(),'SAVE')]")).click();
		Thread.sleep(9000);

        driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("cpauserapproved");
		Thread.sleep(9000);

        driver.findElement(By.xpath("//span[contains(text(),'ACCEPT')]")).click();
        
        
		//Thread.sleep(49000);

		System.out.println("<----final test--------->");
        
		Thread.sleep(19000);
		//threelevels();
		//Thread.sleep(9000);
		System.out.println("<----final RCU,FI,CM--------->");
		
		//logoutapplication();
		
		System.out.println("<----final RCU,FI,CM second--------->");
		
		 driver.findElement(By.xpath("//div[@class='current-user']")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		   
		  Thread.sleep(19000);
		
		return this;


 }

}
