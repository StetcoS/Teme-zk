package org.example.exercitii.Teme;

import org.example.exercitii.setup.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static org.example.exercitii.Constante.Constante.DURATION;
import static org.example.exercitii.setup.BrowserType.CHROME;
import static org.example.exercitii.setup.WebDriverFactory.createWebDriver;

public class bassetest {
    public static WebDriver driver;
    public static String siteURL = "https://katalon-demo-cura.herokuapp.com/";
public static BrowserType browserType;

    @BeforeClass
    public void setupBrowser() {
        browserType= CHROME;
    }

    @BeforeMethod
    public void setupTest() {
driver=createWebDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION));
        driver.get(siteURL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
