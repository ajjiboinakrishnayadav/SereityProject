package com.jocata.dlp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;

public class DatepickerUtiles {

	
	private WebDriver driver;

	public DatepickerUtiles(WebDriver driver) {
		this.driver= driver;
	}
	
	public void selectDateFromCalendar(String date) throws InterruptedException {
		try {

			Thread.sleep(3000);
			WebElement dateMonth = driver.findElement(By.xpath(
					"//*[starts-with(@id,'owl-dt-picker-')]/div[2]/owl-date-time-calendar/div[1]/div/button/span"));
			Thread.sleep(3000);
			// WebElement
			// backward=driver.findElement(By.xpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[1]/button[1]/span"));
			WebElement backward = driver.findElement(By.xpath("//button[@aria-label='Previous month']"));
			Thread.sleep(3000);

			// WebElement
			// forward=driver.findElement(By.xpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[1]/button[2]/span"));
			WebElement forward = driver.findElement(By.xpath("//button[@aria-label='Next month']"));

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// System.out.println(latestp);

			/*
			 * Date currentDate = new Date(); Date dateToBeSelected = new
			 * SimpleDateFormat("dd/MM/yyyy").parse(date); String day = new
			 * SimpleDateFormat("dd").format(dateToBeSelected); String month =
			 * new SimpleDateFormat("MMMM").format(dateToBeSelected); String
			 * year = new SimpleDateFormat("yyyy").format(dateToBeSelected);
			 * String monthYear=month+" "+year;
			 */
			Date currentDate = new Date();
			Date dateToBeSelected = new SimpleDateFormat("dd/MM/yyyy").parse(date);
			String day = new SimpleDateFormat("dd").format(dateToBeSelected);
			String month = new SimpleDateFormat("MMM").format(dateToBeSelected);
			String year = new SimpleDateFormat("yyyy").format(dateToBeSelected);
			String monthYear = month + "-" + year;

			System.out.println(monthYear);
			while (!dateMonth.getText().equals(monthYear)) {
				System.out.println(dateMonth.getText() + " --- " + monthYear);

				if (currentDate.compareTo(dateToBeSelected) > 0)
					backward.click();
				else if (currentDate.compareTo(dateToBeSelected) < 0)
					forward.click();

			}

			// *[@id="owl-dt-picker-0"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr/td/child::span[text()='16']
			driver.findElement(
					By.xpath("//owl-date-time-month-view/table/tbody/tr/td/child::span[text()='" + day + "']")).click();
			//
			// driver.findElement(By.xpath("//div[starts-with(@id,'cdk-overlay-')]//table/tbody/tr/td/child::span[text()='"+day+"']")).click();
			// driver.findElement(By.xpath("//td[text()='"+day+"'")).click();

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

}
