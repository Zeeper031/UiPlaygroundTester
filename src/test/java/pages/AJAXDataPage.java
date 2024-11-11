package pages;

import org.openqa.selenium.By;

import static Keywords.WebUi.clickElement;
import static Keywords.WebUi.verifyElementPresent;

public class AJAXDataPage {

    public static By buttonTriggeringAJAXRequest = By.xpath("//*[@id=\"ajaxButton\"]");
    public static By successMessage = By.xpath("//*[@class=\"bg-success\"]");

    public static void clickAjaxButtonAndWaitResponse(){
        clickElement(buttonTriggeringAJAXRequest);
    }

    public static boolean validateSuccessRequest(){
        return verifyElementPresent(successMessage);
    }
}
