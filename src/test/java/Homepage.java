import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.XMLFormatter;

public class Homepage extends PageObject {
    public Homepage(WebDriver driver) { super(driver); }
    private final String Submit = "mmorpg@gm.coo";

    private final String NonSubmit = "mmorPgd";

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMore;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridReadMore;
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollmentButton;
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement submitBox;
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
        Utils.waitForElementsToLoad(2);
        Utils.scrollToElement(driver, this.startEnrollmentButton);
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
    public void SubmitBox(){
        this.submitBox.sendKeys(Submit);
    }
    public void NonSubmitBox(){
        this.submitBox.sendKeys(NonSubmit);
    }
    public void StartEnrollment(){
        this.startEnrollmentButton.click();
    }
    public void ScrollDown(){
        Utils.scrollToElement(driver, this.scrollUpButton);
        Utils.waitForElementsToLoad(5);
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