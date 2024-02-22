package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver ldriver;

	public Loginpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id= "Email")
	WebElement email;
	
	@FindBy(id= "Password")
	WebElement password;
	
	@FindBy(xpath= "//button[text()='Log in']")
	WebElement loginbtn;
	

	@FindBy(xpath= "//a[text()='Logout']")
	WebElement logoutbtn;
	
	
	
	public void enteremail(String emailadd) throws InterruptedException {
		email.clear();
		Thread.sleep(5000);
		email.sendKeys(emailadd);
		System.out.println(emailadd);

		
	}
	
	public void enterpassword(String pwd) throws InterruptedException { Thread.sleep(5000);
		password.clear();
		password.sendKeys(pwd);
		System.out.println(pwd);
    }
	
	public void clickloginbtn() 
	{
		loginbtn.click();
	}
	
	public void clicklogoutbtn() 
	{
		logoutbtn.click();
	}
	
}
	
