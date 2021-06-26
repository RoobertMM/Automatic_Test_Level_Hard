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
    private WebElement firstBox;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastBox;
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userBox;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordBox;
    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement rePassowrdBox;


    public void PasswordBox(){this.passwordBox.sendKeys(Password);this.rePassowrdBox.sendKeys(Password);}
    public void EmailBox(){this.userBox.sendKeys(Email);}
    public void Next (){this.nextButton.click();}
    public void UserBox(){this.lastBox.sendKeys(User_Name);this.firstBox.sendKeys(User_Name);}
}
