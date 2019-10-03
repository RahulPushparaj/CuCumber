package Facebook.cuuucoooo;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook
{
	WebDriver d;
	@Before
	public void launchbrowser() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ\\CuCumber\\Driver\\chromedriver.exe");
	    d = new ChromeDriver();
	    d.get("https://www.facebook.com"); 
	}
	@After
	public void closebrowser() 
	{
		d.quit();
	}
	
	
	@When("^user click log in button$")
	public void user_click_log_in_button() 
	{
		d.findElement(By.id("loginbutton")).click();
	}
	@Given("^user check the url and title$")
	public void user_check_the_url_and_title()  {
		String url = d.getCurrentUrl();
		System.out.println(url);
		if (url.contains("facebook"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}  
	}
	@When("^user enter username and password \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_username_and_password_and(String uu, String pp)  {
		d.findElement(By.id("email")).sendKeys(uu);
		d.findElement(By.id("pass")).sendKeys(pp);
	}

	@When("^user enter firstname,lastname and phonenumber \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_firstname_lastname_and_phonenumber_and(String aa, String bb, String cc)  {
		d.findElement(By.name("firstname")).sendKeys(aa);
		d.findElement(By.name("lastname")).sendKeys(bb);
		d.findElement(By.name("reg_passwd__")).sendKeys(cc);
	}
	@Then("^user check navigation correct url or not$")
	public void user_check_navigation_correct_url_or_not()  
	{
		String url = d.getCurrentUrl();
		System.out.println(url);
		if(url.contains("regular"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	
}
