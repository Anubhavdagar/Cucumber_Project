package Stepdefinition;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Loginpage;
import io.cucumber.java.en.*;
import org.openqa.selenium.chrome.ChromeOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class StepdefLogin {
	
	public WebDriver driver;
	public Loginpage loginpg;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory","jdk-http-client");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUBHAV DAGAR\\Desktop\\CucumberProject\\src\\test\\resources\\driver\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		driver =new ChromeDriver();

		
		loginpg = new Loginpage(driver);
	   
	}

	@When("User open URL {string}")
	public void user_open_url(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();
	  
	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String emailadd, String pwd) throws InterruptedException {
	    loginpg.enteremail(emailadd);
	    loginpg.enterpassword(pwd);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		loginpg.clickloginbtn();
	  
	}

	@Then("Page Title should be displayed {string}")
	public void page_title_should_be_displayed(String expectedtitle) {
	    String actualtitle=driver.getTitle();
	    if(actualtitle.equals(expectedtitle)) {
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	    
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() {
	  loginpg.clicklogoutbtn();
	}

}
