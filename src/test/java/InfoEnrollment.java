import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfoEnrollment extends PageObject{
    public InfoEnrollment(WebDriver driver) {
        super(driver);
    }
    private final String IName = "Roberto";
    private final String IIName = "Roby";
    private final String Nr= "0729566810";


    @FindBy(xpath = "//*[@id=\"step2\"]/div/input[1]")
    private WebElement firstName;
    @FindBy(xpath = "//*[@id=\"step2\"]/div/input[2]")
    private WebElement secondName;
    @FindBy(xpath = "//*[@id=\"step2\"]/div/input[3]")
    private WebElement number;
    @FindBy(xpath = "//*[@id=\"step2\"]/button[2]")
    private WebElement nextinfo;

    public void NextInfo(){this.nextinfo.click();}
    public void PhoneNumber(){this.number.sendKeys(Nr);}
    public void SecondName(){this.secondName.sendKeys(IIName);}
    public void FirstName(){this.firstName.sendKeys(IName);}






}
