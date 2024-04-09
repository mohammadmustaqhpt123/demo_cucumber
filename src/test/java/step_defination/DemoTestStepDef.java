package step_defination;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestStepDef {


	WebDriver driver;

	@Given("Open the browser")
	public void open_the_browser() {
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--headless=new");
//		options.setCapability("headless", true );
//		driver = new EdgeDriver(options);
		WebDriverManager.chromedriver().setup();
////		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUSTMOHA\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
//		options.addArguments("--headless=new");
//		options.addArguments("window-size=10240,780");
//		options.addArguments("--disable-gpu");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--headless");
////		options.setHeadless(true);
		driver = new ChromeDriver(options);
//	    WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.addArguments("--headless");  // Run Firefox in headless mode
        
//         Set up Firefox WebDriver
    
//        driver = new FirefoxDriver(firefoxOptions);

//		EdgeOptions edgeOptions = new EdgeOptions();
//        edgeOptions.setCapability("--headless");
//        
//        // Set up Edge WebDriver
//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver(edgeOptions);
		
		
		System.out.println("------------------------Browser Started----------------");
	}

	@Given("Navigate to demoqa")
	public void navigate_to_demoqa() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/text-box");
	    
	}

	@When("Fill the form")
	public void fill_the_form() {
	    driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Mohammad Mustaq");
	    driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("MohammadMustaq@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("Bangalore");
	    
//	    Actions actions = new Actions(driver);
//	    actions.click(driver.findElement(By.xpath("//*[@id=\"submit\"]"))).build().perform();
	  
	}

	@Then("validate the output")
	public void validate_the_output() {
//	    Assert.assertEquals(driver.getTitle(), "DEMOQA");
	}
	@Then("Close the browser")
	public void close_the_browser() {
	   driver.quit();
	}

}
