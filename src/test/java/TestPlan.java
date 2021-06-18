import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Verify ReadMore Buttons")
    public void VerifyButtons() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        Virtual webForms = new Virtual(driver);
        Hybrid websForm = new Hybrid(driver);
        Utils.waitForElementsToLoad(2);
        webForm.ScrollDown();
        Utils.waitForElementsToLoad(5);
        webForm.Virtual();
        Utils.waitForElementsToLoad(5);
        webForms.ReturnVirtual();
        Utils.waitForElementsToLoad(5);
        webForm.Hybrid();
        Utils.waitForElementsToLoad(5);
        websForm.ReturnHybrid();

    }
    @Test(testName = "Verify The Enrollment")
    public void VerifySite() {
        driver.get(Utils.BASE_URL);
        Homepage wwebForm = new Homepage(driver);
        Enrollment webForm = new Enrollment(driver);
        wwebForm.StartEnrollment();
        Utils.waitForElementsToLoad(3);
        webForm.UserBox();
        webForm.EmailBox();
        webForm.PasswordBox();
        Utils.waitForElementsToLoad(3);
        webForm.Next();
        Utils.waitForElementsToLoad(2);
    }
    @Test(testName = "Verify Personal Information")
    public void VerifyInfo(){
        driver.get(Utils.BASE_URL);
        Homepage wwebForm = new Homepage(driver);
        InfoEnrollment webForm = new InfoEnrollment(driver);
        Enrollment wForm = new Enrollment(driver);
        wwebForm.StartEnrollment();
        Utils.waitForElementsToLoad(2);
        wForm.Next();
        Utils.waitForElementsToLoad(2);
        webForm.FirstName();
        webForm.SecondName();
        webForm.PhoneNumber();
        Utils.waitForElementsToLoad(1);
        webForm.NextInfo();
        Utils.waitForElementsToLoad(2);
    }
    @Test(testName = "Verify Option")
    public void VerifyOption(){
        driver.get(Utils.BASE_URL);
        Homepage wwebForm = new Homepage(driver);
        InfoEnrollment webForm = new InfoEnrollment(driver);
        Enrollment wForm = new Enrollment(driver);
        Option WebForm = new Option(driver);
        wwebForm.StartEnrollment();
        Utils.waitForElementsToLoad(2);
        wForm.Next();
        Utils.waitForElementsToLoad(2);
        webForm.NextInfo();
        Utils.waitForElementsToLoad(2);
        WebForm.ChoseBox();
        Utils.waitForElementsToLoad(1);
        WebForm.NextOption();
        Utils.waitForElementsToLoad(2);
    }

    @Test(testName = "Payment Verify")
    public void VerifyPayment(){
        driver.get(Utils.BASE_URL);
        Homepage wwebForm = new Homepage(driver);
        InfoEnrollment webForm = new InfoEnrollment(driver);
        Enrollment wForm = new Enrollment(driver);
        Option WebForm = new Option(driver);
        Payment form = new Payment(driver);
        wwebForm.StartEnrollment();
        Utils.waitForElementsToLoad(1);
        wForm.Next();
        Utils.waitForElementsToLoad(1);
        webForm.NextInfo();
        Utils.waitForElementsToLoad(1);
        WebForm.NextOption();
        Utils.waitForElementsToLoad(1);
        form.Holder();
        form.CardNumber();
        form.CVC();
        Utils.waitForElementsToLoad(1);
        form.MonthButton();
        form.YearButton();
        Utils.waitForElementsToLoad(1);
        form.NextPay();
        Utils.waitForElementsToLoad(2);

    }
    @Test (testName = "Full Test")
    public void FullTest(){
        driver.get(Utils.BASE_URL);
        Homepage m = new Homepage(driver);
        Enrollment fForm = new Enrollment(driver);
        InfoEnrollment rm = new InfoEnrollment(driver);
        Option orm = new Option(driver);
        Payment Form = new Payment(driver);
        ReturnToHome webForm = new ReturnToHome(driver);
        Utils.waitForElementsToLoad(2);
        m.StartEnrollment();
        Utils.waitForElementsToLoad(2);
        fForm.Next();
        Utils.waitForElementsToLoad(2);
        rm.NextInfo();
        Utils.waitForElementsToLoad(2);
        orm.NextOption();
        Utils.waitForElementsToLoad(2);
        Form.NextPay();
        Utils.waitForElementsToLoad(2);
        webForm.Return();
        Utils.waitForElementsToLoad(2);

    }


    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
