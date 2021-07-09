import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
        BoxesNavigation box = new BoxesNavigation(driver);
        box.ReadMoreButton(BoxesNavigation.Steps.VirtualBox);
        Homepage webForm = new Homepage(driver);
        Assert.assertEquals(webForm.getBoxesVirtual(),"Virtual");
    }

    @Test(testName = "Verify ReadMore Hybrid Button")
    public void VerifyHybridButton(){
        driver.get(Utils.BASE_URL);
        BoxesNavigation box = new BoxesNavigation(driver);
        box.ReadMoreButton(BoxesNavigation.Steps.HybridBox);
        Homepage webForm = new Homepage(driver);
        Assert.assertEquals(webForm.GetHybridHeader(),"Hybrid");
    }

    @Test(testName = "Verify ReadMore InPerson Button")
    public void VerifyInPersonButton(){
        driver.get(Utils.BASE_URL);
        BoxesNavigation box = new BoxesNavigation(driver);
        box.ReadMoreButton(BoxesNavigation.Steps.InPersonBox);
        Homepage webForm = new Homepage(driver);
        Assert.assertEquals(webForm.getInPersonHeader(),"In Person");
    }

    @Test(testName = "Verify The Enrollment")
    public void VerifySite() {
        driver.get(Utils.BASE_URL);
        PageNavigation page = new PageNavigation(driver);
        page.navigateToPage(PageNavigation.Steps.StepOne);
        ContactInfo webContact = new ContactInfo(driver);
        Assert.assertEquals(webContact.getContactInfoHeader(),"Contact information");
    }

    @Test(testName = "Verify Contact Information")
    public void VerifyContactInfo(){
        driver.get(Utils.BASE_URL);
        PageNavigation nav = new PageNavigation(driver);
        nav.navigateToPage(PageNavigation.Steps.StepTwo);
        CourseOption webOption = new CourseOption(driver);
        Assert.assertEquals(webOption.getCourseOptionHeader(),"Course options");
    }

    @Test(testName = "Verify The Empty Inputs In The Enrollment")
    public void VerifyEmptyEnrollment(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.StartEnrollment();
        Enrollment webEnroll = new Enrollment(driver);
        webEnroll.UserInput();
        Utils.waitForElementsToLoad(1);
        webEnroll.NextButton();
        Assert.assertEquals(webEnroll.getEnrollmentHeader(),"Personal information");
    }

    @Test(testName = "Verify Contact With An Empty Input")
    public void VerifyContactWorking(){
        driver.get(Utils.BASE_URL);
        PageNavigation nav = new PageNavigation(driver);
        nav.navigateToPage(PageNavigation.Steps.StepOne);
        ContactInfo webInfo = new ContactInfo(driver);
        webInfo.PostInput();
        webInfo.PhoneInput();
        webInfo.CountryInput();
        Utils.waitForElementsToLoad(1);
        webInfo.NextButton();
        Assert.assertEquals(webInfo.getContactInfoHeader(),"Contact information");
    }

    @Test(testName = "Verify Newsletter")
    public void VerifyNews(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.SubmitInput();
        webForm.SubmitButton();
        webForm.AcceptPopUp();
        Assert.assertEquals(webForm.getBoxesVirtual(),"Virtual");
    }

    @Test(testName = "Verify Submit Button From Newsletter")
    public void VerifySubmitButton(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.NonSubmitInput();
        webForm.SubmitButton();
    }

    @Test(testName = "Verify Empty Newsletter Input")
    public void VerifyEmptyNewsletterInput(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.SubmitButton();
    }

    @Test(testName = "Verify Navbar Buttons")
    public void VerifyNavbar(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.WhatYouWillLearnButton();
        Utils.waitForElementsToLoad(3);
        webForm.QuestionsButton();
        Utils.waitForElementsToLoad(3);
        webForm.InstructorsButton();
        Assert.assertEquals(webForm.getInstructorsHeader(),"Our Instructors");
    }

    @Test(testName = "Verify GoUp Button")
    public void VerifyGoUpButton(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ScrollDown();
        Assert.assertEquals(webForm.getButtonHeader(),"Copyright © 2021 Software Course");
        webForm.ScrollUp();
        Assert.assertEquals(webForm.GetHybridHeader(),"Hybrid");
    }

    @Test(testName = "Verify Learn The Fundamentals Button")
    public void VerifyFundamentalsButton(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.FundamentalsButton();
        Utils.waitForElementsToLoad(2);
        Fundamentals webFund = new Fundamentals(driver);
        webFund.ReturnFundamentalButton();
        Assert.assertEquals(webForm.getBoxesVirtual(),"Virtual");
    }

    @Test(testName = "Verify Selenium Button")
    public void VerifySeleniumButton(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.SeleniumButton();
        Utils.waitForElementsToLoad(1);
        LearnSelenium webSelen = new LearnSelenium(driver);
        webSelen.ReturnSeleniumButton();
        Assert.assertEquals(webForm.getBoxesVirtual(),"Virtual");
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
        Utils.waitForElementsToLoad(3);
        Assert.assertEquals(webForm.getFinalQuestionRespons(),"Will your organization help me find a job?");
    }

    @Test(testName = "Verify the Course Option Selection")
    public void VerifyCourseOption(){
        driver.get(Utils.BASE_URL);
        PageNavigation nav = new PageNavigation(driver);
        nav.navigateToPage(PageNavigation.Steps.StepThree);
        PaymentInformation webPay = new PaymentInformation(driver);
        Assert.assertEquals(webPay.getPaymentInfoHeader(),"Payment information");
    }

    @Test(testName = "Verify the Course Option Without Selecting")
    public void VerifyEmptyCourseOption() {
        driver.get(Utils.BASE_URL);
        PageNavigation nav = new PageNavigation(driver);
        nav.navigateToPage(PageNavigation.Steps.StepThree);
        PaymentInformation webPay = new PaymentInformation(driver);
        Assert.assertEquals(webPay.getPaymentInfoHeader(),"Payment information");
    }

    @Test(testName = "Verify the Payment Information")
    public void VerifyPaymentInformation() {
        driver.get(Utils.BASE_URL);
        PageNavigation nav = new PageNavigation(driver);
        nav.navigateToPage(PageNavigation.Steps.StepFour);
        GoBack webBack = new GoBack(driver);
        Assert.assertEquals(webBack.GoBackHeader(),"Success!");
    }

    @Test(testName = "Verify the Go Back Home Button")
    public void VerifyGoBackHome() {
        driver.get(Utils.BASE_URL);
        PageNavigation nav = new PageNavigation(driver);
        nav.navigateToPage(PageNavigation.Steps.StepFive);
        Homepage webForm = new Homepage(driver);
        Assert.assertEquals(webForm.getNavbarHeader(),"Software testing course");
    }

    @AfterSuite
    public static void cleanUp() {
        Utils.waitForElementsToLoad(1);
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
