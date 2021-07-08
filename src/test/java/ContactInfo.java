import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfo extends PageObject{
    public ContactInfo(WebDriver driver) {

        super(driver);
    }

    private final String Email = "lovelambo@dadoo.cos";
    private final String Phone = "+122334499802";
    private final String Country = "Polish";
    private final String City = "Russia";
    private final String PostCode = "!@@!!!21234";

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInfoHeader;
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phone;
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement country;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement city;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postcode;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement next;

    public String getContactInfoHeader(){return this.contactInfoHeader.getText();}

    public void NextButton(){this.next.click();}

    public void PostInput(){this.postcode.sendKeys(PostCode);}

    public void CityInput(){
     this.city.sendKeys(City);
    }

    public void CountryInput(){
     this.country.sendKeys(Country);
    }

    public void PhoneInput(){
     this.phone.sendKeys(Phone);
    }

    public void EmailInput(){
        this.email.sendKeys(Email);
    }

}
