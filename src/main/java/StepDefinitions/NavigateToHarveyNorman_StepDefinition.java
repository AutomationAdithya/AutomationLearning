package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigateToHarveyNorman_StepDefinition {
	WebDriver driver;
	@Given("^user has already opened the browser$")
	public void user_has_already_opened_the_browser()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adithya\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		//open chrome browser
	  driver= new ChromeDriver();
		//maximize chrome browser
		driver.manage().window().maximize();
	}

	@When("^Browser is Visible$")
	public void browser_is_Visible() {
	    System.out.println("Browser is visible");
	}

	@Then("^Enter Url of HN and press enter$")
	public void enter_Url_of_HN_and_press_enter() throws InterruptedException  {
		driver.get("https://www.harveynorman.com.au");
		Thread.sleep(2000);

	}

	@Then("^Homepage of HN website should appear$")
	public void homepage_of_HN_website_should_appear()  {
	    	
		System.out.println("Home page is visible");
	}
	

	@Then("^verify page Title$")
	public void verify_page_Title()  {
		String mesa = driver.getTitle();
		System.out.println(mesa);
		
	    
	}

}
