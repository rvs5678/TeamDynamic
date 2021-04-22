package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class tuitionAndFinancingPage extends TestBase{

	@FindBy(linkText= "Pay Upfront")
	WebElement payUpfrontLink;
	
	@FindBy(linkText= "Contact Us")
	WebElement contactUsLink;
	
	public tuitionAndFinancingPage() {
	
	PageFactory.initElements(driver, this);	
	
	}
	
	public void tuitionAndinancingLink() {
		tuitionAndFinancingLink.click();
		
	}
	
	public void contactUsLink() {
		contactUsLink.click();
	}
	
	public String getHomeTitle() {
		return driver.getTitle();
	}
	
		
		
}
