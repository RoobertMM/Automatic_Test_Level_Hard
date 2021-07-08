import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkipAllTheEnrollment extends PageObject{
    public SkipAllTheEnrollment(WebDriver driver) {
        super(driver);
    }
    private final String A = "a";

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameInput;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameInput;
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userInput;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordInput;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButtonEnrollment;

    public void SkipEnrollment(){
        this.firstNameInput.sendKeys(A);
        this.lastNameInput.sendKeys(A);
        this.userInput.sendKeys(A);
        this.passwordInput.sendKeys(A);
        this.confirmPasswordInput.sendKeys(A);
        this.nextButtonEnrollment.click();
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailInput;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneInput;
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement countryInput;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement cityInput;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postCodeInput;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButtonContactInfo;

    public void SkipContactInfo(){
        this.emailInput.sendKeys(A);
        this.phoneInput.sendKeys(A);
        this.countryInput.sendKeys(A);
        this.cityInput.sendKeys(A);
        this.postCodeInput.sendKeys(A);
        this.nextButtonContactInfo.click();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextButtonCourseOption;

    public void SkipCourseOption(){
        this.nextButtonCourseOption.click();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHolderNameInput;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardNumberInput;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement cvcInput;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextButtonPayment;

    public void SkipPayment(){
        this.cardHolderNameInput.sendKeys(A);
        this.cardNumberInput.sendKeys(A);
        this.cvcInput.sendKeys(A);
        this.nextButtonPayment.click();
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement goBackHomeButton;

    public void GoBackHome(){
        this.goBackHomeButton.click();
    }
    public void SkipAll(){
        this.SkipEnrollment();
        this.SkipContactInfo();
        this.SkipCourseOption();
        this.SkipPayment();
        this.GoBackHome();
    }
}
