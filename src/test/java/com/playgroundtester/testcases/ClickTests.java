package com.playgroundtester.testcases;

import Constants.FrameworkConstants;
import com.playgroundtester.common.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static pages.ClickPage.*;

public class ClickTests extends BaseTest {

    @Test
    public void clickTest() {
        HomePage.openApp();
        HomePage.clickTile(FrameworkConstants.CLICK_TILE);
        clickButtonNotWork();
    }
}
