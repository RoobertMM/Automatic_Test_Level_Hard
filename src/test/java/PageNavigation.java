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

    private void navigateToStepOne(){
        Homepage webForm = new Homepage(driver);
        webForm.StartEnrollment();
       Enrollment form = new Enrollment(driver);
       form.UserInput();
       form.EmailInput();
       form.PasswordInput();
       form.NextButton();
    }

    private void navigateToStepTwo(){
        ContactInfo info = new ContactInfo(driver);
        info.EmailInput();
        info.PhoneInput();
        info.CountryInput();
        info.CityInput();
        info.PostInput();
        info.NextButton();
    }

    private void navigateToStepThree(){
        CourseOption option = new CourseOption(driver);
        option.NextButton();
    }

    private void navigateToStepFour(){
        PaymentInformation pay = new PaymentInformation(driver);
        pay.CompletePaymentInputs();
        pay.NextButton();
    }

    private void navigateToStepFive(){
        GoBack back = new GoBack(driver);
        back.GoBackButton();
    }

}
