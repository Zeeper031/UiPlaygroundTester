package com.playgroundtester.testcases;

import Constants.FrameworkConstants;
import com.playgroundtester.common.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoadDelayPage;

public class LoadDelayTests extends BaseTest {

    @Test
    public void loadDelayTest(){
        HomePage.openApp();
        HomePage.clickTile(FrameworkConstants.LOAD_DELAY_TILE);
        LoadDelayPage.clickButtonAfterDelay();
    }

}
