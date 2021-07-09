import org.openqa.selenium.WebDriver;

public class BoxesNavigation extends PageObject{
    public BoxesNavigation(WebDriver driver) {
        super(driver);
    }
    enum Steps {
        VirtualBox,
        HybridBox,
        InPersonBox
    }

    public void ReadMoreButton(Steps step) {
        switch (step){
            case VirtualBox:
                Virtual();
                break;
            case HybridBox:
                Hybrid();
                break;
            case InPersonBox:
                InPerson();
                break;
        }
    }

    private void Virtual(){
        Homepage webForm = new Homepage(driver);
        webForm.Virtual();
        Virtual virtual = new Virtual(driver);
        virtual.ReturnVirtual();
    }

    private void Hybrid(){
        Homepage webForm = new Homepage(driver);
        webForm.Hybrid();
        Hybrid hyb = new Hybrid(driver);
        hyb.ReturnHybrid();
    }

    private void InPerson(){
        Homepage webForm = new Homepage(driver);
        webForm.ReadMoreInPerson();
        InPerson in = new InPerson(driver);
        in.ReturnInPerson();
    }
}
