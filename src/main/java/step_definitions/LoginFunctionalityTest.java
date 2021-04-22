package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionalityTest {

	System.setProperty("webdriver.chrome.driver", "/Users/Gurjit/Desktop/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://transfotechacademy.com");
	   
	
	
	
		@Given("user is in homepage")
		public void user_is_in_homepage() {
		System.out.println("Inside step - user is on login page");
		}

		@When("user click the profile button")
		public void user_click_the_profile_button() {
		System.out.println("Inside step user clicks the profile button");
		}

		@Then("user should see new profile buttons")
		public void user_should_see_new_profile_buttons() {
		System.out.println("Inside step user sees profile button");

		}
}
