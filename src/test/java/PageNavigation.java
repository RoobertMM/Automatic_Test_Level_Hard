import org.openqa.selenium.WebDriver;

public class PageNavigation extends PageObject{
    public PageNavigation(WebDriver driver) {
        super(driver);
    }
    enum Steps {
        StepOne,
        StepTwo,
        StepThree,
        StepFour,
        StepFive
    }

    public void navigateToPage(Steps step) {
        switch (step) {
            case StepOne:
                navigateToStepOne();
                break;
            case StepTwo:
                navigateToStepOne();
                navigateToStepTwo();
                break;
            case StepThree:
                navigateToStepOne();
                navigateToStepTwo();
                navigateToStepThree();
                break;
            case StepFour:
                navigateToStepOne();
                navigateToStepTwo();
                navigateToStepThree();
                navigateToStepFour();
                break;
            case StepFive:
                navigateToStepOne();
                navigateToStepTwo();
                navigateToStepThree();
                navigateToStepFour();
                navigateToStepFive();
                break;
        }
    }

    public void navigateToStepOne(){
       Enrollment form = new Enrollment(driver);
       form.UserInput();
       form.EmailInput();
       form.PasswordInput();
       form.NextButton();
    }
    public void navigateToStepTwo(){
        ContactInfo info = new ContactInfo(driver);
        info.EmailInput();
        info.PhoneInput();
        info.CountryInput();
        info.CityInput();
        info.PostInput();
        info.NextButton();

    }
    public void navigateToStepThree(){
        CourseOption option = new CourseOption(driver);
        option.NextButton();
    }
    public void navigateToStepFour(){
        PaymentInformation pay = new PaymentInformation(driver);
        pay.CompletePaymentInputs();
        pay.NextButton();
    }
    public void navigateToStepFive(){
        GoBack back = new GoBack(driver);
        back.GoBackButton();
    }


}
