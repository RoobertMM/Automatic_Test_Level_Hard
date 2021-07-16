import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InPerson extends PageObject{
    public InPerson(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/a")
    private WebElement returnInPerson;

    public void ReturnInPerson(){
        Utils.waitForElementsToLoad(2);
        this.returnInPerson.click();
    }

}
