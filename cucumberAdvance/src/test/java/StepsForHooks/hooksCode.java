package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooksCode {
	WebDriver driver = null;
	
	
	@Before("@Smoke")
	public void setup() {
		
	
		
		System.out.println("Inside: Setup0");
		WebDriverManager.chromedriver().setup();
		System.out.println("Inside: Setup0");
		
		
		 driver= new ChromeDriver();
		   
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		    driver.manage().window().maximize();
		    
		    
			   driver.get("https://example.testproject.io/web/");
	}
	@Before(order=1)
	public void setup1() {
		System.out.println("Inside: Setup1");
	}
	
	@After("@Smoke")
	public void teardown() {
		System.out.println("Inside:teardown1(after1)");
		driver.close();
		driver.quit();
	}
	@After(order=2)
	public void teardown1() {
		System.out.println("Inside:teardown (after2)");
	}
@BeforeStep
	public void bstep() {
		System.out.println("Inside:before step");
		
	}

@AfterStep
public void astep() {
	System.out.println("Inside:After step");
	
}



@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("Inside:I want to write a step with precondition ");
}

@And("some other precondition")
public void some_other_precondition() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
System.out.println("Inside:some othe precondition ");
}

@When("I complete action")
public void i_complete_action() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
    System.out.println("Inside:I complete action ");
}


}
