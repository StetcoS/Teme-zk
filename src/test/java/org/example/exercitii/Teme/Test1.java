package org.example.exercitii.Teme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends bassetest {
@Test
    public void testLoginWithValidUser() {
        WebElement menuButton = driver.findElement(By.id("menu-toggle"));
        menuButton.click();

        WebElement loginButton = driver.findElement(By.cssSelector("#sidebar-wrapper > ul > li:nth-child(4) > a"));
        loginButton.click();
        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement loginLastButton = driver.findElement(By.id("btn-login"));
        loginLastButton.click();

        Assert.assertTrue(driver.findElement(By.id("appointment")).isDisplayed());
    }
}
