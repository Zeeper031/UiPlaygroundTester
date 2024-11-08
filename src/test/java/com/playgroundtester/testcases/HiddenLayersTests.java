package com.playgroundtester.testcases;

import Constants.FrameworkConstants;
import Keywords.WebUi;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicIdPage;
import pages.HomePage;
import pages.HiddenLayersPage;

public class HiddenLayersTests {

    @Test
    public void dynamicIdTest(){
        HomePage.openApp();
        HomePage.clickTile(FrameworkConstants.HIDDEN_LAYERS_TILE);
        HiddenLayersPage.clickprimaryButtonHiddenLayer();
        String firstId = DynamicIdPage.getDynamicIdButtonId();
        WebUi.reloadPage();
        Assert.assertNotEquals(firstId, DynamicIdPage.getDynamicIdButtonId());
    }
}
