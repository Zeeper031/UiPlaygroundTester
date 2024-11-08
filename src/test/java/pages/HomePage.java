package pages;

import org.openqa.selenium.By;
import Constants.FrameworkConstants;

import static Keywords.WebUi.*;

public class HomePage {

    private static By dynamicIdTile = By.xpath("//a[@href='/dynamicid']");
    private static By classAtributeTile = By.xpath("//a[@href='/classattr']");
    private static By hiddenLayersTile = By.xpath("//a[@href='/hiddenlayers']");
    private static By loadDelayTile = By.xpath("//a[@href='/loaddelay']");
    private static By ajaxDataTile = By.xpath("//a[@href='/ajax']");
    private static By clienSideDelayTile = By.xpath("//a[@href='/clientdelay']");
    private static By clickTile = By.xpath("//a[@href='/click']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");
//    private By classAtributeTile = By.xpath("//a[@href='/classattr']");

    public static void openApp(){
        openPlaygroundApp();
    }

    public static void clickTile(String Tile){
        switch (Tile){
            case FrameworkConstants.DYNAMIC_ID_TILE:
                clickElement(dynamicIdTile);
                break;
            case FrameworkConstants.CLASS_ATTRIBUTE_TILE:
                clickElement(classAtributeTile);
                break;
            default:
                throw new IllegalArgumentException("Tile Opción not válid: " + Tile);
        }
    }
}
