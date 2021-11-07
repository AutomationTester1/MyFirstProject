package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.TextBox;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testing1 {
	WebDriver driver;
	TextBox text;
	@Given("open browser")
	public void open_browser() {
		System.out.println("BDD framework testing is started");
		System.setProperty("webdriver.chrome.driver", "F:\\company\\Eclipse_Workspace\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("navigate to toolsqa site")
	public void navigate_to_toolsqa_site() {
		driver.get("https://demoqa.com/text-box");
	}

	@When("title is displayed")
	public void title_is_displayed() {
//		text.Title();
		System.out.println(driver.getTitle());
	}

	@And("form is filled")
	public void form_is_filled() throws InterruptedException {
		text=new TextBox(driver);
		text.name("Mohamed Idhris");
		text.mail("Test@gmail.com");
		text.Address1("muthuvel layout");
		text.Address2("Kandasamy layout");
		Thread.sleep(2000);
		text.signin_button();
		Thread.sleep(2000);
	}

	@Then("click submit")
	public void click_submit() {
		
		System.out.println("Successfully completed");
		driver.quit();
}
}
