package com.playgroundtester.testcases;

import Constants.FrameworkConstants;
import Keywords.WebUi;
import com.playgroundtester.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicIdPage;
import pages.HomePage;

public class DynamicIdTests extends BaseTest {

    @Test
    public void dynamicIdTest(){
        HomePage.openApp();
        HomePage.clickTile(FrameworkConstants.DYNAMIC_ID_TILE);
        DynamicIdPage.clickDynamicButton();
        String firstId = DynamicIdPage.getDynamicIdButtonId();
        WebUi.reloadPage();
        Assert.assertNotEquals(firstId, DynamicIdPage.getDynamicIdButtonId());
    }

}
