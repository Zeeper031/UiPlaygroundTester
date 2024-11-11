package pages;

import org.openqa.selenium.By;

import static Keywords.WebUi.clickElement;

public class LoadDelayPage {

    private static By buttonAppearingAfterDelay = By.xpath("//*[@class=\"btn btn-primary\"]");

    public static void clickButtonAfterDelay(){
        clickElement(buttonAppearingAfterDelay);
    }
}
