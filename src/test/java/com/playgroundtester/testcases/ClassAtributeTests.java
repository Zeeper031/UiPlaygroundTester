package com.playgroundtester.testcases;

import Constants.FrameworkConstants;
import Keywords.WebUi;
import com.playgroundtester.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ClassAttributePage;
import pages.HomePage;

public class ClassAtributeTests extends BaseTest {

    @Test
    public void classAtribute(){
        HomePage.openApp();
        HomePage.clickTile(FrameworkConstants.CLASS_ATTRIBUTE_TILE);
        ClassAttributePage.clickButtonAlert();
        Assert.assertTrue(WebUi.verifyAlertPresent(1));
        WebUi.acceptAlert();
        Assert.assertFalse(WebUi.verifyAlertPresent(1));
    }
}
