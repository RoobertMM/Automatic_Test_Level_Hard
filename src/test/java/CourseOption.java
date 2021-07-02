import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CourseOption extends PageObject{
    public CourseOption(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement manualTester;
    @FindBy(xpath = "//*[@id=\"flexRadioButton2\"]")
    private WebElement automationTester;
    @FindBy(xpath = "//*[@id=\"flexRadioButton3\"]")
    private WebElement automationAndManualTester;
    @FindBy(xpath = "//*[@id=\"flexRadioButton4\"]")
    private WebElement securityTester;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextButton;

    public void CompleteAllSelection(){
        this.manualTester.click();
        this.automationTester.click();
        this.automationAndManualTester.click();
        this.securityTester.click();
    }

    public void NextButton(){
        this.nextButton.click();
    }

}
