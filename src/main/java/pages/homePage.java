package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class homePage extends TestBase{

	@FindBy(linkText= "tuiton-and-financing")
	WebElement tuitionAndFinancingLink;
	
	@FindBy(linkText= "Contact Us")
	WebElement contactUsLink;
	
	public homePage() {
	
	PageFactory.initElements(driver, this);	
	
	}
	
	public void clickTuitionAndFinancingLink() {
		tuitionAndFinancingLink.click();
		
	}
	
	public void contactUsLink() {
		contactUsLink.click();
	}
	
	public String getHomeTitle() {
		return driver.getTitle();
	}
	
		
		
}
