package StepDefinations2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterizationCode {
	WebDriver driver = null ;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("Inside: User in on login  page");
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	    driver.manage().window().maximize();
	    
	   driver.get("https://example.testproject.io/web/");
	}

	@When("^user enters ([^\"]*) and ([^\"]*)$")
	public void user_enters_username_and_password(String username, String password) {
		 System.out.println("Inside:user enters " +username+ " and " +password);
		 driver.findElement(By.id("name")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
		// driver.findElement(By.id("login")).click();
	}

	@And("click on login page")
	public void click_on_login_page() throws InterruptedException {
		  System.out.println("Inside:click on login page ");
		  driver.findElement(By.id("login")).click();
		  Thread.sleep(3000);
	}

	
	
	@Then("^user is navigated to  home and enter ([^\"]*)$")
 public void user_is_navigated_to_home(String country) {
  // Write code here that turns the phrase above into concrete actions
  System.out.println("Inside: user is navigated to home and enter country" + country);
  Select drpcountry = new Select(driver.findElement(By.id("country")));
      drpcountry.selectByVisibleText(country);
  driver.findElement(By.id("logout")).click();
  driver.quit();
 }
	
	
	
	
	
	
	
	
	

	/*@When("user enters mark and {int}")
	public void user_enters_mark_and(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

}
