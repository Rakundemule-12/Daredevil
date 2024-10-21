package org.example.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verify_Title_Katalon {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        if (driver.getPageSource().contains("CURA Healthcare Service"))
        {
            System.out.println("Verified");
            Assert.assertTrue(true);

        }
        else
        {
            Assert.assertTrue(false);
        }

        driver.quit();
    }
}
