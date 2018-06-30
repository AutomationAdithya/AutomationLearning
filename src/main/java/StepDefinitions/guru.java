package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class guru {
	WebDriver driver;
	@Given("^Open the Chrome and launch the application$")
	public void openChrome()  {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Adithya\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");	
		   driver= new ChromeDriver();		
		   driver.manage().window().maximize();	
		   driver.navigate().to("http://www.demo.guru99.com/v4/");
	    
	}
	@When("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String username,String password)  {
		driver.findElement(By.name("uid")).sendKeys(username);					
		driver.findElement(By.name("password")).sendKeys(password);
	    
	}

//	@When("^Enter the User(\\d+) and password(\\d+)$")
//	public void enter_the_User_and_password(String username,String password)  {
//		driver.findElement(By.name("uid")).sendKeys(username);					
//	       driver.findElement(By.name("password")).sendKeys(password);
//	}

	@Then("^Reset the credential$")
	public void reset_the_credential() {
		  driver.findElement(By.name("btnReset")).click();		
	}

}

