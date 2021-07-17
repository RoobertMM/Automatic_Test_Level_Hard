import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearnSelenium extends PageObject{
    public LearnSelenium(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/a")
    private WebElement returnSeleniumButton;
    @FindBy(xpath = "/html/body/h1")
    private WebElement headerSelenium;

    public String HeaderSelenium(){return this.headerSelenium.getText();}

    public void ReturnSeleniumButton(){
        this.returnSeleniumButton.click();
    }

}
