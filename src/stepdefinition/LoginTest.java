package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

   WebDriver driver;

        @Given("User is on Home Page")
                public void useronhomepage(){
            driver = new FirefoxDriver();
            driver.get("https://learn.letskodeit.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        }

        @When("^User enters UserName and Password$")
    public void user_enter_username_password()throws Exception{
            driver.findElement(By.linkText("Login")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("user_email")).sendKeys("test@email.com");
            driver.findElement(By.id("user_password")).sendKeys("abcabc");
            Thread.sleep(2000);
        }

        @Then("^He can visit the practice page$")
    public void user_visit_practisepage()throws Exception{
            driver.findElement(By.name("commit")).click();
            Thread.sleep(2000);

        }







    }

