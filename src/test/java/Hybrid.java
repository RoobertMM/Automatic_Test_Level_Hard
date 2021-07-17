import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hybrid extends PageObject{
    public Hybrid(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/a")
    private WebElement hybridReturn;
    @FindBy(xpath = "/html/body/h1")
    private WebElement hybridHeader;

    public String HeaderHybrid(){return this.hybridHeader.getText();}

    public void ReturnHybrid(){
        this.hybridReturn.click();
    }

}
