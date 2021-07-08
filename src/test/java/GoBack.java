import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoBack extends PageObject{
    public GoBack(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement goBackButton;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement goBackHeader;

    public String GoBackHeader(){return this.goBackHeader.getText();}

    public void GoBackButton(){
        this.goBackButton.click();
    }

}
