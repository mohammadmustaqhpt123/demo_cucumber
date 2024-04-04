package step_defination;


import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoTestStepDef {


	WebDriver driver;

	@Given("Open the browser")
	public void open_the_browser() {
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless=new");
		driver = new ChromeDriver(options);
		System.out.println("------------------------Browser Started----------------");
	}

	@Given("Navigate to demoqa")
	public void navigate_to_demoqa() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demoqa.com/text-box");
	    
	}

	@When("Fill the form")
	public void fill_the_form() {
	    driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Mohammad Mustaq");
	    driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("MohammadMustaq@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).submit();
	  
	}

	@Then("validate the output")
	public void validate_the_output() {
	    Assert.assertEquals(driver.getTitle(), "DEMOQA");
	}
	@Then("Close the browser")
	public void close_the_browser() {
	   driver.quit();
	}

}
