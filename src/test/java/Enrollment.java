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

    @FindBy(xpath = "//*[@id=\"step1\"]/button")
    private WebElement nextButton ;
    @FindBy(xpath = "//*[@id=\"step1\"]/div/input[1]")
    private WebElement usernameBox;
    @FindBy(xpath = "//*[@id=\"step1\"]/div/input[2]")
    private WebElement emailBox;
    @FindBy(xpath = "//*[@id=\"step1\"]/div/input[3]")
    private WebElement passwordBox;
    @FindBy(xpath = "//*[@id=\"step1\"]/div/input[4]")
    private WebElement rePassowrdBox;


    public void PasswordBox(){this.passwordBox.sendKeys(Password);this.rePassowrdBox.sendKeys(Password);}
    public void EmailBox(){this.emailBox.sendKeys(Email);}
    public void Next (){this.nextButton.click();}
    public void UserBox(){this.usernameBox.sendKeys(User_Name);}
}
