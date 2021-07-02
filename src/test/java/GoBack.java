import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoBack extends PageObject{
    public GoBack(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement goBackButton;

    public void GoBackButton(){
        this.goBackButton.click();
    }
}
