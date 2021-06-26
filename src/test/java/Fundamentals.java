import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fundamentals extends PageObject{
    public Fundamentals(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/a")
    private WebElement returnFundamentalsButton;

    public void ReturnFundamentalButton(){this.returnFundamentalsButton.click();}



}
