package com.playgroundtester.testcases;

import Constants.FrameworkConstants;
import com.playgroundtester.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import static pages.AJAXDataPage.*;


public class AJAXDataTests extends BaseTest {

    @Test
    public void aJAXData(){
        HomePage.openApp();
        HomePage.clickTile(FrameworkConstants.AJAX_Data_TILE);
        clickAjaxButtonAndWaitResponse();
        Assert.assertTrue(validateSuccessRequest());
    }

}
