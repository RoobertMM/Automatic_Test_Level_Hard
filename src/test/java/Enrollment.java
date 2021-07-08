import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enrollment extends PageObject{
    public Enrollment(WebDriver driver) {
        super(driver);
    }

    private final String User_Name = "Robert";
    private final String Email = "vreaulamborghini@yahoo.com";
    private final String Password = "taratara242326";

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton ;
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameInput;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameInput;
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userNameInput;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordInput;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement enrollmentHeader;

    public String getEnrollmentHeader(){return this.enrollmentHeader.getText();}

    public void PasswordInput(){
        this.passwordInput.sendKeys(Password);
        this.confirmPasswordInput.sendKeys(Password);
    }

    public void EmailInput(){
        this.userNameInput.sendKeys(Email);
    }

    public void NextButton(){
        this.nextButton.click();
    }

    public void UserInput(){
        this.lastNameInput.sendKeys(User_Name);
        this.firstNameInput.sendKeys(User_Name);
    }

}
