import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Option extends PageObject{
    public Option(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"flexRadioButton4\"]")
    private WebElement Choose1;
    @FindBy(xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement Choose2;
    @FindBy(xpath = "//*[@id=\"step3\"]/button[2]")
    private WebElement next;

    public void ChoseBox(){this.Choose1.click();this.Choose2.click();}
    public void NextOption(){this.next.click();}

}
