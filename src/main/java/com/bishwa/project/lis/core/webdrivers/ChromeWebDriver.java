package com.bishwa.project.lis.core.webdrivers;

import com.bishwa.project.lis.core.specification.IDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Author: Bishwa
 * Date: 30/01/2021
 * Time: 15:12
 */
public class ChromeWebDriver extends IDriverManager {
    private static final String DRIVER_PATH = "C:\\apps\\webdriver\\bin\\chromedriver.exe";

    @Override
    protected void setupDriver() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
    }

    @Override
    public void initDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--window-size=1366,768");

         webDriver = new ChromeDriver(options);
    }
}
