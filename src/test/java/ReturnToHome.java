import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnToHome extends PageObject{
    public ReturnToHome(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"step5\"]/a")
    private WebElement homeReturn;

    public void Return(){this.homeReturn.click(); }
}
