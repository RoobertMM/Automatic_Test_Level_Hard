import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkipEnrollment extends PageObject{
    public SkipEnrollment(WebDriver driver) {
        super(driver);
    }

    private final String TD= "Teddy Bear";

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton ;
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

    public void CompleteAllTheInputs(){
        this.passwordInput.sendKeys(TD);
        this.confirmPasswordInput.sendKeys(TD);
        this.userInput.sendKeys(TD);
        this.lastNameInput.sendKeys(TD);
        this.firstNameInput.sendKeys(TD);
    }

    public void NextButton(){
        this.nextButton.click();
    }

}
