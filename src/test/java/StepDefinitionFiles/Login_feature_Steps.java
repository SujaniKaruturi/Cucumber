package StepDefinitionFiles;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_feature_Steps {

	@Given("User is on NetBanking LandingPage")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User landed on netbanking page");
	   Assert.assertTrue(false);  //to make some testcase fail wantedly
	   
	   }
	
	@Given("setup the entries in database")
	public void setup_the_entries_in_database() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("setup the entries in database");
	}
	@When("Launch the browser using URL from config properties file")
	public void launch_the_browser_using_url_from_config_properties_file() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Launch the browser using URL from config properties file");
	}
	@When("Hit the Home page Url on banking site")
	public void hit_the_home_page_url_on_banking_site() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Hit the Home page Url on banking site");
	}
	@When("User login into application")
	public void user_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User landed on netbanking page");
	}

	/*
	 * @When("User login into application with {string} and password {string}")
	 * public void user_login_into_application_with_and_password(String username,
	 * String password) { // Write code here that turns the phrase above into
	 * concrete actions System.out.println("Username is " + username +
	 * " password is " + password); }
	 */
	@When("^User login into application with (.+) and password (.+)$")
	//need to applicable for any datatype then we need to use regular expression patterns like (.+)
	//When User login into application with "manager" and password "1234"
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Username is " + username + " password is " + password);
	}
	@Then("HomePage is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("HomePage is displayed");
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cards are displayed");
		
	}
	

@Given("User is on Facebook LandingPage")
public void user_is_on_facebook_landing_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User is on Facebook LandingPage");
}
@When("User signup into application")
public void user_signup_into_application(List<String> data) {
	//driver.findElements(xpath);
	System.out.println("User signup into application using list of data inputs");
	for(int i =0 ;i< data.size(); i++)
	{
		System.out.println("data at index "+ i +" is " + data.get(i));
	}
	
	

	
}
}
