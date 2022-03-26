package com.steps;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class HomeSteps {
	WebDriver driver;
	HomePage pf;
	
	
	@Given("^user go to Orange HRM home page$")
	public void user_go_to_Orange_HRM_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    
	}

	@When("^user type user name into the user name field$")
	public void user_type_user_name_into_the_user_name_field() throws Throwable {
		pf = new HomePage(driver);
		pf.getUserNameField().sendKeys("Admin");
	    
	}

	@When("^user type password into the password field$")
	public void user_type_password_into_the_password_field() throws Throwable {
		pf.getPasswordField().sendKeys("admin123");
	    
	}

	@Then("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		pf.getLoginBtn().click();
	    
	}

	@Then("^user verify page title as \"([^\"]*)\"$")
	public void user_verify_page_title_as(String expected) throws Throwable {
		//String expected = "OrangeHRM";
		String actual = driver.getTitle();
	    Assert.assertTrue("The page title did not match", actual.contains(expected));
	    
	}
}
