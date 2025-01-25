package com.app.stepdefinition;

import com.app.pageobjectexe.Mobile_PageExe;

import io.cucumber.java.en.*;

public class LoginPage extends Mobile_PageExe
{
	// snippets 
		@Given("Launch the browser")
		public void launch_the_browser() {
			System.out.println("browserluanch");
		}

		@When("Enter the username {string}")
		public void enter_the_username(String user) {
		   System.out.println(user);
		}

		@When("Enter the password {string}")
		public void enter_the_password(String pass) {
		   System.out.println(pass); 
		}

		@When("Click the login button")
		public void click_the_login_button() {
		 System.out.println("login button");
		}

		@Then("Validate the home page")
		public void validate_the_home_page() {
			System.out.println("validate the home page");
		}
		
		@Then("Validate the Error message")
		public void validate_the_error_message() {
		   System.out.println("Validate the error message");
		}
		@When("Enter the emp name {string}")
		public void enter_the_emp_name(String name) {
		    System.out.println("Name " + name );
		}
		@When("Enter the emp email {string}")
		public void enter_the_emp_email(String email) {
			System.out.println("Name " + email );
		}
		@Then("Validate the emp details")
		public void validate_the_emp_details() {
		    System.out.println("validation completed");
		}


}
