import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Payment extends PageObject{
    public Payment(WebDriver driver) {
        super(driver);
    }

    private final String CardHolderName = "Roger Mutul Gool";
    private final String CardNumberNumbers = "1111 1111 1111 0000";
    private final String vcvnumbers= "101";


    @FindBy(xpath = "//*[@id=\"step4\"]/div/input")
    private WebElement holder;
    @FindBy(xpath = "//*[@id=\"step4\"]/div/div[2]/div[1]/input")
    private WebElement cardNr;
    @FindBy(xpath = "//*[@id=\"step4\"]/div/div[2]/div[2]/input")
    private WebElement cvc;
    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement month;
    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement year;

    @FindBy(xpath = "//*[@id=\"step4\"]/button[2]")
    private WebElement next;

    public void NextPay(){this.next.click();}
    public void YearButton(){this.year.click();}
    public void MonthButton(){this.month.click();}
    public void Holder(){this.holder.sendKeys(CardHolderName);}
    public void CardNumber(){this.cardNr.sendKeys(CardNumberNumbers);}
    public void CVC(){this.cvc.sendKeys(vcvnumbers);}









}
