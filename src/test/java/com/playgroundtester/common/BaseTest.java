package com.playgroundtester.common;


import Driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod
    public void createDriver() {
        Properties properties = new Properties();

        try (InputStream input = BaseTest.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("There is no Config file added in resources folder");
                return;
            }
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String chromeDriverPath = properties.getProperty("ChromeDriver");
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        DriverManager.setDriver(driver);
    }



    @AfterMethod
    public void closeDriver(){
        if (driver != null) {
            driver.quit();
        }
    }
}
