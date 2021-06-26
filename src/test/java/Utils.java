import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Utils {
    final static String CHROME_DRIVER_LOCATION = "chromedriver.exe";
    final static String BASE_URL = "file:///C:/Users/Roby/OneDrive/Documente/manual%20testing%20in%20class/Testing-Env/index.html#";
    public static void waitForElementsToLoad(int timeUnit){
        try{
            TimeUnit.SECONDS.sleep(timeUnit);}
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}