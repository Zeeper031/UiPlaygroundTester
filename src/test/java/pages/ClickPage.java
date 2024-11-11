package pages;

import org.openqa.selenium.By;

import static Keywords.WebUi.clickElement;


public class ClickPage {

    private static By clickButton = By.xpath("//*[@id=\"badButton\"]");

    public static void clickButtonNotWork(){
        clickElement(clickButton);
    }

}
