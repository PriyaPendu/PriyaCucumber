package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLoginTest
{
	public WebDriver driver = null;
	private CharSequence string;
	
	@Given("i open browser {string}")
	public void i_open_browser(String string) 
	{
	   if(string.equals("chrome"))
	   {
		   System.setProperty ("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver");
		   driver = new ChromeDriver();
	   }
	   else if (string.equals("firefox"))
	   {
		   
	   }
	}
	@Given("i navigate to {string}")
	public void i_navigate_to(String string) {
	    driver.navigate().to(string);
	    driver.manage().window().maximize();
	}
	@When("i enter username\"priyapendu1508@gmail.com\"")
	public void i_enter_username_priyapendu1508_gmail_com() 
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(string);
	}
	@When("i enter password {string}")
	public void i_enter_password(String string) 
	{
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(string);
	}
	@When("click submit")
	public void click_submit() 
	{
	   driver.findElement(By.xpath("//*[@id=\"u_0_5_aP\"]")).click();
	}
	@Then("error message must come")
	public void error_message_must_come() 
	{
	    driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]").getText();
	}

}
