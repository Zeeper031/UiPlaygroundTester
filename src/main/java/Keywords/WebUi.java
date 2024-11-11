package Keywords;


import Constants.FrameworkConstants;
import Driver.DriverManager;
import Utils.LogUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class WebUi {

    public static void openPlaygroundApp(){
        DriverManager.getDriver().get(FrameworkConstants.UITestAutomationPlaygroundURL);
        waitForPageLoaded();
        DriverManager.getDriver().manage().window().maximize();
    }

    public static void navigateToURL(String URL){
        DriverManager.getDriver().get(URL);
        waitForPageLoaded();
    }

    public static void clickElement(By by) {
        waitForElementClickable(by).click();
        LogUtils.info("Clicked on the element " + by.toString());

    }

    public static boolean verifyElementPresent(By by){

        try{
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.WAIT_EXPLICIT), Duration.ofMillis(500));
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            return true;
        }catch(Exception e){
            return false;
        }
    }


    public static WebElement waitForElementClickable(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.WAIT_EXPLICIT), Duration.ofMillis(500));
            return wait.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Throwable error) {
            LogUtils.error("❌ Timeout waiting for the element ready to click. " + by.toString());
        }
        return null;
    }

    public static boolean verifyElementClickable(By by){
        try{
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.WAIT_EXPLICIT), Duration.ofMillis(500));
            wait.until(ExpectedConditions.elementToBeClickable(by));
            return true;
        }catch(Throwable error) {
            LogUtils.error("❌ Timeout waiting for the element ready to click. " + by.toString());
            return false;
        }
    }

    public static void reloadPage() {
        DriverManager.getDriver().navigate().refresh();
        waitForPageLoaded();
        LogUtils.info("Reloaded page " + DriverManager.getDriver().getCurrentUrl());

    }

    public static boolean verifyAlertPresent(int timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeOut), Duration.ofMillis(500));
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        } catch (Throwable error) {
            LogUtils.error("Alert NOT Present.");
            return false;
        }
    }

    public static void acceptAlert() {
        DriverManager.getDriver().switchTo().alert().accept();
        LogUtils.info("Click Accept on Alert.");
    }


    public static void waitForPageLoaded() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOADED));
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

        // wait for Javascript to loaded
        ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");

        //Get JS is Ready
        boolean jsReady = js.executeScript("return document.readyState").toString().equals("complete");

        //Wait Javascript until it is Ready!
        if (!jsReady) {
            LogUtils.info("Javascript in NOT Ready!");
            //Wait for Javascript to load
            try {
                wait.until(jsLoad);
            } catch (Throwable error) {
                LogUtils.error("Timeout waiting for page load. (" + FrameworkConstants.WAIT_PAGE_LOADED + "s)");
            }
        }
    }
}
