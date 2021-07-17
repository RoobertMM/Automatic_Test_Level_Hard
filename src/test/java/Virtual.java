import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Virtual extends PageObject{

    public Virtual(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/a")
    private WebElement returnVirtual;
    @FindBy(xpath = "/html/body/h1")
    private WebElement virtualHeader;

    public String VirtualHeader(){return this.virtualHeader.getText();}

    public void ReturnVirtual(){
        this.returnVirtual.click();
    }


}
