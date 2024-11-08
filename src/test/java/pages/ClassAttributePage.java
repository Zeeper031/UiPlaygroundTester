package pages;

import org.openqa.selenium.By;

import static Keywords.WebUi.clickElement;

public class ClassAttributePage {

    private static By buttonAlert = By.xpath("//button[contains(@class, 'btn') and contains(@class, 'btn-primary') and contains(@class, 'btn-test')]");

    public static void clickButtonAlert(){
        clickElement(buttonAlert);
    }

}
