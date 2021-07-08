import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentInformation extends PageObject{
    public PaymentInformation(WebDriver driver) {
        super(driver);
    }

    private final String Name = "Popescu Pescaru Popa";
    private final String CardNumbers = "1111 0000 1112 2188";
    private final String cVc = "194";

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHolderNameInput;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardNumberInput;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement cvcInput;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInfoHeader;

    public String getPaymentInfoHeader(){return this.paymentInfoHeader.getText();}

    public void CompletePaymentInputs(){
        this.cardHolderNameInput.sendKeys(Name);
        this.cardNumberInput.sendKeys(CardNumbers);
        this.cvcInput.sendKeys(cVc);
    }

    public void NextButton(){
        this.nextButton.click();
    }

}
