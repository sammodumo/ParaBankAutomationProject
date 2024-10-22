package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    WebDriver driver;
    public RegistrationPage(WebDriver webDriver){
        driver = webDriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/p[2]/a")
    private WebElement registerLink;

    @FindBy(xpath = "//*[@id=\"customer.firstName\"]")
    private WebElement customerFirstName;

    @FindBy(xpath = "//*[@id=\"customer.lastName\"]")
    private WebElement customerLastName;

    @FindBy(xpath = "//*[@id=\"customer.address.street\"]")
    private WebElement customerAddress;

    @FindBy(xpath = "//*[@id=\"customer.address.city\"]")
    private WebElement customerCity;

    @FindBy(xpath = "//*[@id=\"customer.address.state\"]")
    private WebElement customerState;

    @FindBy(xpath = "//*[@id=\"customer.address.zipCode\"]")
    private WebElement customerZipCode;

    @FindBy(xpath = "//*[@id=\"customer.phoneNumber\"]")
    private WebElement customerPhoneNumber;

    @FindBy(xpath = "//*[@id=\"customer.ssn\"]")
    private WebElement customerSSN;

    @FindBy(xpath = "//*[@id=\"customer.username\"]")
    private WebElement customerUsername;

    @FindBy(xpath = "//*[@id=\"customer.password\"]")
    private WebElement customerPassword;

    @FindBy(xpath = "//*[@id=\"repeatedPassword\"]")
    private WebElement customerPasswordConfirmation;

    @FindBy(xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
    private WebElement RegisterBtn;

    //Methods

    public void registerLink(){
        registerLink.click();
    }

    public void customerFirstName(){
        customerFirstName.sendKeys("Tester");
    }

    public void customerLastName(){
        customerLastName.sendKeys("Quality");
    }

    public void customerAddress(){
        customerAddress.sendKeys("123 Main St");
    }

    public void customerCity(){
        customerCity.sendKeys("City Of Tshwane");
    }

    public void customerState(){
        customerState.sendKeys("Gauteng");
    }

    public void customerZipCode(){
        customerZipCode.sendKeys("62701");
    }

    public void customerPhoneNumber(){
        customerPhoneNumber.sendKeys("555-1234");
    }

    public void customerSSN(){
        customerSSN.sendKeys("123-45-6789");
    }

    public void customerUsername(){
        customerUsername.sendKeys("john_QATester");
    }

    public void customerPassword(){
        customerPassword.sendKeys("SecurePassword123");
    }

    public void customerPasswordConfirmation(){
        customerPasswordConfirmation.sendKeys("SecurePassword123");
    }

    public void RegisterBtn(){
        RegisterBtn.click();
    }

}
