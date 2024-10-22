package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import page.RegistrationPage;

public class RegisterStep {
    private WebDriver driver;
    private RegistrationPage registrationPage;

    @Given("I am on the Parabank registration page")
    public void I_am_on_the_Parabank_registration_page() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        registrationPage = new RegistrationPage(driver);

        registrationPage.registerLink();
        Thread.sleep(2000);
    }

    @When("I fill in {string} with {string}")
    public void iFillInWith(String arg0, String arg1) throws InterruptedException {
        registrationPage.customerFirstName();
        Thread.sleep(2000);
    }


    @And("I fill in Last Name with {string}")
    public void iFillInLastNameWith(String arg0) throws InterruptedException {
        registrationPage.customerLastName();
        Thread.sleep(2000);
    }

    @And("I fill in Address with {string}")
    public void iFillInAddressWith(String arg0) throws InterruptedException {
        registrationPage.customerAddress();
        Thread.sleep(2000);
    }

    @And("I fill in City with {string}")
    public void iFillInCityWith(String arg0) throws InterruptedException {
        registrationPage.customerCity();
        Thread.sleep(2000);
    }

    @And("I fill in State with {string}")
    public void iFillInStateWith(String arg0) throws InterruptedException {
        registrationPage.customerState();
        Thread.sleep(2000);
    }

    @And("I fill in Zip Code with {string}")
    public void iFillInZipCodeWith(String arg0) throws InterruptedException {
        registrationPage.customerZipCode();
        Thread.sleep(2000);
    }

    @And("I fill in Phone # with {string}")
    public void iFillInPhoneWith(String arg0) throws InterruptedException {
        registrationPage.customerPhoneNumber();
        Thread.sleep(2000);
    }

    @And("I fill in SSN with {string}")
    public void iFillInSSNWith(String arg0) throws InterruptedException {
        registrationPage.customerSSN();
        Thread.sleep(2000);
    }

    @And("I fill in Username with {string}")
    public void iFillInUsernameWith(String arg0) throws InterruptedException {
        registrationPage.customerUsername();
        Thread.sleep(2000);
    }

    @And("I fill in Password with {string}")
    public void iFillInPasswordWith(String arg0) throws InterruptedException {
        registrationPage.customerPassword();
        Thread.sleep(2000);
    }

    @And("I fill in Confirm with {string}")
    public void iFillInConfirmWith(String arg0) throws InterruptedException {
        registrationPage.customerPasswordConfirmation();
        Thread.sleep(2000);
    }

    @When("I click {string}")
    public void iClick(String arg0) throws InterruptedException {
        registrationPage.RegisterBtn();
        Thread.sleep(2000);
    }
}
