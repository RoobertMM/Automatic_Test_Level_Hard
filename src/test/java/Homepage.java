import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageObject {


    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMore;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridReadMore;
    //@FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement scrollUp;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement scrollToWorkForReadMore;
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollmentButton;


    public void StartEnrollment(){this.startEnrollmentButton.click();}
    public Homepage(WebDriver driver) { super(driver); }
    public void ScrollDown(){Utils.scrollToElement(driver, this.scrollToWorkForReadMore);}


    public void Hybrid() { Utils.scrollToElement(driver, this.virtualReadMore);this.hybridReadMore.click(); }



    public void Virtual() { Utils.scrollToElement(driver, this.virtualReadMore);this.virtualReadMore.click(); }
}