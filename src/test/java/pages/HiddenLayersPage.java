package pages;

import org.openqa.selenium.By;

import static Keywords.WebUi.clickElement;

public class HiddenLayersPage {

    private static By primaryButtonHiddenLayer = By.xpath("//*[@id=\"greenButton\"]");
    private static By secondaryButtonHiddenLayer = By.xpath("//*[@id=\"blueButton\"]");

    public static void clickprimaryButtonHiddenLayer(){
        clickElement(primaryButtonHiddenLayer);
    }

    public static void clicksecondaryButtonHiddenLayer(){
        clickElement(secondaryButtonHiddenLayer);
    }

}
