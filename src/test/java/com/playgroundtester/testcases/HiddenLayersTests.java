package com.playgroundtester.testcases;

import Constants.FrameworkConstants;
import Keywords.WebUi;
import com.playgroundtester.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicIdPage;
import pages.HomePage;
import pages.HiddenLayersPage;

public class HiddenLayersTests extends BaseTest {

    @Test
    public void dynamicIdTest(){
        HomePage.openApp();
        HomePage.clickTile(FrameworkConstants.HIDDEN_LAYERS_TILE);
        HiddenLayersPage.clickprimaryButtonHiddenLayer();
        HiddenLayersPage.clickprimaryButtonSecondTime();
        HiddenLayersPage.clicksecondaryButtonHiddenLayer();

    }
}
