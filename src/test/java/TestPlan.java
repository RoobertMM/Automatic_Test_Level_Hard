import org.openqa.selenium.Dimension;
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

    @Test(testName = "Verify ReadMore Virtual Button")
    public void VerifyVirtualButton() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.Virtual();
        Utils.waitForElementsToLoad(2);
        Virtual webVirtual = new Virtual(driver);
        webVirtual.ReturnVirtual();

    }

    @Test(testName = "Verify ReadMore Hybrid Button")
    public void VerifyHybridButton(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.Hybrid();
        Utils.waitForElementsToLoad(2);
        Hybrid webHybrid = new Hybrid(driver);
        webHybrid.ReturnHybrid();
    }

    @Test(testName = "Verify InPerson readmore Button")
    public void VerifyInPersonButton(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ReadMoreInPerson();
        InPerson webPerson = new InPerson(driver);
        webPerson.ReturnInPerson();
    }
    @Test(testName = "Verify The Enrollment")
    public void VerifySite() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.StartEnrollment();
        Utils.waitForElementsToLoad(3);
        Enrollment webEnroll = new Enrollment(driver);
        webEnroll.UserBox();
        webEnroll.EmailBox();
        webEnroll.PasswordBox();
        Utils.waitForElementsToLoad(3);
        webEnroll.Next();
    }
    @Test(testName = "Verify Contact Information")
    public void VerifyContactInfo(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        SkipEnrollment webEnroll = new SkipEnrollment(driver);
        webForm.StartEnrollment();
        Utils.waitForElementsToLoad(2);
        webEnroll.PasswordBox();
        Utils.waitForElementsToLoad(1);
        webEnroll.Next();
        ContactInfo webContact = new ContactInfo(driver);
        webContact.CityBox();
        webContact.CountryBox();
        webContact.PhoneBox();
        webContact.PostBox();
        webContact.EmailBox();
        Utils.waitForElementsToLoad(2);
        webContact.Next();
    }
    @Test(testName = "Verify Enrollment Doesn't Empty")
    public void VerifyEmptyEnrollment(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.StartEnrollment();
        Enrollment webEnroll = new Enrollment(driver);
        webEnroll.UserBox();
        Utils.waitForElementsToLoad(1);
        webEnroll.Next();
    }

    @Test(testName = "Verify Empty Enrollment #2")
    public void VerifyEmptyEnrollmentPassword(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.StartEnrollment();
        Utils.waitForElementsToLoad(1);
        Enrollment webEnroll = new Enrollment(driver);
        webEnroll.UserBox();
        webEnroll.EmailBox();
        Utils.waitForElementsToLoad(1);
        webEnroll.Next();
    }
    @Test(testName = "Verify Contact Without A Box")
    public void VerifyContactWorking(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.StartEnrollment();
        Utils.waitForElementsToLoad(1);
        SkipEnrollment webSkip = new SkipEnrollment(driver);
        webSkip.PasswordBox();
        webSkip.Next();
        Utils.waitForElementsToLoad(1);
        ContactInfo webInfo = new ContactInfo(driver);
        webInfo.PostBox();
        webInfo.PhoneBox();
        webInfo.CountryBox();
        Utils.waitForElementsToLoad(1);
        webInfo.Next();
    }
    @Test(testName = "Verify Newsletter")
    public void VerifyNews(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.SubmitBox();
        webForm.SubmitButton();
        webForm.AcceptPopUp();
    }
    @Test(testName = "Verify Submit Button From Newsletter")
    public void VerifySubmittButton(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.NonSubmitBox();
        webForm.SubmitButton();
    }
    @Test(testName = "Verify Empty Newsletter Box")
    public void VerifyEmptyNewsletterBox(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.SubmitButton();
    }

    @Test(testName = "Verify Navbar Buttons")
    public void VerifyNavbar(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.WhatYouWillLearnButton();
        Utils.waitForElementsToLoad(1);
        webForm.QuestionsButton();
        Utils.waitForElementsToLoad(2);
        webForm.InstructorsButton();

    }
    @Test(testName = "Verify GoUp Button")
    public void VerifyGoUpButton(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ScrollDown();
    }
    @Test(testName = "Verify Learn The Fundamentals Button")
    public void VerifyFundamentalsButton(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.FundamentalsButton();
        Utils.waitForElementsToLoad(2);
        Fundamentals webFund = new Fundamentals(driver);
        webFund.ReturnFundamentalButton();
    }
    @Test(testName = "Verify Selenium Button")
    public void VerifySeleniumButton(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.SeleniumButton();
        Utils.waitForElementsToLoad(1);
        LearnSelenium webSelen = new LearnSelenium(driver);
        webSelen.ReturnSeleniumButton();
    }
    @Test(testName = "Verify the Questions Bar ")
    public void VerifyQuestionsBar(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.InstitutionLocatedQuestion();
        Utils.waitForElementsToLoad(1);
        webForm.PriceQuestion();
        Utils.waitForElementsToLoad(1);
        webForm.KnowleadgeQuestion();
        Utils.waitForElementsToLoad(1);
        webForm.SingUpQuestion();
        Utils.waitForElementsToLoad(1);
        webForm.JobQuestion();
    }



    @AfterSuite
    public static void cleanUp() {
        Utils.waitForElementsToLoad(1);
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
