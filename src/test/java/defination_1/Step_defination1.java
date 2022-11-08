package defination_1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_defination1 {

	public static String url="https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	
	
	@When("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(string);
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(string);
	}
	@And("Click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='submit']")).click();
	}
	@Then("I should see title as {string}")
	public void i_should_see_title_as(String string) {
		Assert.assertEquals(string, driver.getTitle());
		  driver.close();
	}
}
