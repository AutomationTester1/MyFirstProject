package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBox {

	WebDriver driver;
	public TextBox(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="main-header")
	WebElement Title;

	@FindBy(id="userName")
	WebElement name;

	@FindBy(id="userEmail")
	WebElement mail;

	@FindBy(id="currentAddress")
	WebElement currentAddress;

	@FindBy(id="permanentAddress")
	WebElement permanentAddress;

	@FindBy(id="submit")
	WebElement submit;

	public void Title()
	{
		System.out.println(driver.getTitle());
		//	return driver.getTitle();
	}

	public void name(String username)
	{
		name.sendKeys(username);
	}
	public void mail(String userEmail)
	{
		mail.sendKeys(userEmail);
	}
	public void Address1(String currentAddress1)
	{
		currentAddress.sendKeys(currentAddress1);
	}
	public void Address2(String permanentAddress1)
	{
		permanentAddress.sendKeys(permanentAddress1);
	}
	public void signin_button()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,250)");
		submit.click();
	}
}
