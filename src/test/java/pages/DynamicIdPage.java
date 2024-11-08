package pages;

import Driver.DriverManager;
import org.openqa.selenium.By;

import static Keywords.WebUi.*;


public class DynamicIdPage {

    private static By buttonWithDynamicId = By.xpath("//*[@class=\"btn btn-primary\"]");

    public static void clickDynamicButton(){
        clickElement(buttonWithDynamicId);
    }

    public static String getDynamicIdButtonId(){
        return DriverManager.getDriver().findElement(buttonWithDynamicId).getAttribute("id");
    }

}
