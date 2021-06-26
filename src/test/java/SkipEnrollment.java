import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkipEnrollment extends PageObject{
    public SkipEnrollment(WebDriver driver) {
        super(driver);
    }
    private final String TD= "TD";
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

    public void PasswordBox(){this.passwordBox.sendKeys(TD);this.rePassowrdBox.sendKeys(TD);this.userBox.sendKeys(TD);
    this.lastBox.sendKeys(TD);this.firstBox.sendKeys(TD);}
    public void Next (){this.nextButton.click();}
}
