import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageObject {
    public Homepage(WebDriver driver) {
        super(driver);
    }

    private final String Submit = "mmorpg@gm.coo";
    private final String NonSubmit = "mmorPgd";

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMore;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement boxesVirtual;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridReadMore;
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollmentButton;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement submitInput;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement readMoreInPerson;
    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement scrollUpButton;
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement whatYouWillLearn;
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement questions;
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructors;
    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement fundamentalsButton;
    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement seleniumButton;
    @FindBy(xpath= "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement institutionLocatedIN;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[2]/h3/button")
    private WebElement priceQuestion;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[3]/h3/button")
    private WebElement knowledgeQuestion;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement singupQuestion;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[5]/h3/button")
    private WebElement jobQuestion;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybridHeader;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/h3")
    private WebElement inPersonHeader;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructorsHeader;
    @FindBy(xpath = "/html/body/footer/div/p")
    private WebElement buttonHeader;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[5]/h3/button")
    private WebElement finalQuestionRespons;
    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement navbarHeader;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement headerQuestion1;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[2]/h3/button")
    private WebElement headerQuestion2;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[3]/h3/button")
    private WebElement headerQuestion3;
    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement question4Header;

    public String Question4Header(){return this.question4Header.getText();}

    public String Question3Header(){return this.headerQuestion3.getText();}

    public String HeaderQuestion2(){return this.headerQuestion2.getText();}

    public String Question1Header(){return this.headerQuestion1.getText();}

    public String getNavbarHeader(){return this.navbarHeader.getText();}

    public String getFinalQuestionRespons(){return this.finalQuestionRespons.getText();}

    public String getButtonHeader(){return this.buttonHeader.getText();}

    public String getInstructorsHeader(){return this.instructorsHeader.getText();}

    public String getInPersonHeader(){return this.inPersonHeader.getText();}

    public String GetHybridHeader(){ return this.hybridHeader.getText();}

    public String getBoxesVirtual(){ return this.boxesVirtual.getText();}

    public void JobQuestion(){
        this.jobQuestion.click();
        Utils.waitForElementsToLoad(1);
        this.jobQuestion.click();
    }

    public void SingUpQuestion(){
        this.singupQuestion.click();
        Utils.waitForElementsToLoad(1);
        this.singupQuestion.click();
    }

    public void KnowleadgeQuestion(){
        this.knowledgeQuestion.click();
        Utils.waitForElementsToLoad(1);
        this.knowledgeQuestion.click();
    }

    public void PriceQuestion(){
        this.priceQuestion.click();
        Utils.waitForElementsToLoad(1);
        this.priceQuestion.click();
    }

    public void InstitutionLocatedQuestion(){
        this.questions.click();
        Utils.waitForElementsToLoad(3);
        this.institutionLocatedIN.click();
        Utils.waitForElementsToLoad(1);
        this.institutionLocatedIN.click();
    }

    public void SeleniumButton(){
        Utils.scrollToElement(driver, this.fundamentalsButton);
        Utils.waitForElementsToLoad(3);
        this.seleniumButton.click();
    }

    public void FundamentalsButton(){
        Utils.scrollToElement(driver, this.readMoreInPerson);
        Utils.waitForElementsToLoad(3);
        this.fundamentalsButton.click();
    }

    public void InstructorsButton(){
        this.instructors.click();
        Utils.waitForElementsToLoad(1);
    }

    public void QuestionsButton(){
        this.questions.click();
        Utils.waitForElementsToLoad(2);
        Utils.scrollToElement(driver, this.startEnrollmentButton);
    }

    public void WhatYouWillLearnButton(){
        this.whatYouWillLearn.click();
        Utils.waitForElementsToLoad(2);
        Utils.scrollToElement(driver, this.startEnrollmentButton);
    }

    public void ReadMoreInPerson(){
        Utils.scrollToElement(driver, this.submitButton);
        Utils.waitForElementsToLoad(2);
        this.readMoreInPerson.click();
    }

    public void SubmitButton(){
        this.submitButton.click();
    }

    public void AcceptPopUp() {
        Utils.waitForElementsToLoad(3);
        driver.switchTo().alert().accept();
    }

    public void SubmitInput(){
        this.submitInput.sendKeys(Submit);
    }

    public void NonSubmitInput(){
        this.submitInput.sendKeys(NonSubmit);
    }

    public void StartEnrollment(){
        this.startEnrollmentButton.click();
    }

    public void ScrollDown() {
        Utils.scrollToElement(driver, this.scrollUpButton);
        Utils.waitForElementsToLoad(3);
    }
    public void ScrollUp(){
        this.scrollUpButton.click();
    }

    public void Hybrid() {
        Utils.scrollToElement(driver, this.submitButton);
        Utils.waitForElementsToLoad(2);
        this.hybridReadMore.click();
    }

    public void Virtual() {
        Utils.scrollToElement(driver, this.submitButton);
        Utils.waitForElementsToLoad(1);
        this.virtualReadMore.click();
    }

}