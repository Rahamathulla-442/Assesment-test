package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Portal_form {
	WebDriver driver;
	@Given("User opens the browser and navigate to the india Registration  form website")
	public void user_opens_the_browser_and_navigate_to_the_india_registration_form_website() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.india.gov.in/user/register");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	   
	}

	@When("user enters the {string},{string}")
	public void user_enters_the(String username, String Email) throws InterruptedException {
		 driver.findElement(By.id("edit-name")).sendKeys(username);
		  driver.findElement(By.id("edit-mail")).sendKeys(Email);
		  Thread.sleep(3000);
	   
	}

	@When("enters the {string},{string},{string}")
	public void enters_the(String FirstName, String LastName, String PinCode) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='edit-profile-main-field-first-name-und-0-value']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@id='edit-profile-main-field-last-name-und-0-value']")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@id='edit-profile-main-field-pin-code-und-0-value']")).sendKeys(PinCode);
		Thread.sleep(2000);

	   
	}

	@When("select the drop downs {string},{string},{string}")
	public void select_the_drop_downs(String country, String state, String education) throws InterruptedException {
		WebElement Dropdown_Country = driver.findElement(By.id("edit-profile-main-field-country-und"));
		Select Country =new Select(Dropdown_Country);
		Country.selectByVisibleText(country);
		Thread.sleep(2000);
		WebElement Dropdown_State = driver.findElement(By.id("edit-profile-main-field-state-und-hierarchical-select-selects-0"));
		Select State =new Select(Dropdown_State);
		State.selectByVisibleText(state);
		
		Thread.sleep(2000);
		WebElement Dropdown_Education = driver.findElement(By.id("edit-profile-main-field-education-und"));
		Select Education =new Select(Dropdown_Education);
		Education.selectByVisibleText(education);
		
		Thread.sleep(2000);
	   
	}

	@When("provide {string} and clicking  the radio button")
	public void provide_and_clicking_the_radio_button(String captcha) throws InterruptedException {
		driver.findElement(By.id("edit-captcha-response")).sendKeys(captcha);
		Thread.sleep(2000);
		WebElement box = driver.findElement(By.xpath("//input[@id='edit-profile-main-field-subscribe-to-our-newslett-und-yes']"));	
		box.click();
		Thread.sleep(2000);
	   
	}

	@Then("click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
