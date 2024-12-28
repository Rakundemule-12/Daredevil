package org.example.Selenium_Coding_Challenges;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import java.awt.*;

import static utils.GenericUtils.cleanAmountString;

public class Acme_Demo {

    private static final Logger log = LoggerFactory.getLogger(Acme_Demo.class);

    @Description("Verify Acme")
    @Test
    public void addition()
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.id("username"));
        login.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password@123");
        WebElement signin = driver.findElement(By.id("log-in"));
        signin.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String title = driver.getTitle();
        Assert.assertEquals(title,"ACME demo app");

        List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr/td/span[@class=\"text-success\"]"));
        List<String> amount_credited = new ArrayList<>();
        List<String> amount_debited = new ArrayList<>();
        for (WebElement ele: elements)
        {
            String text = ele.getText().trim();
            if (text.startsWith("+")) {
                amount_credited.add(cleanAmountString(text.substring(1)));
            } else if (text.startsWith("-")) {
                amount_debited.add(cleanAmountString(text.substring(1)));
            }
        }
        double totalSum = 0.0;

        for (String amount : amount_credited) {
            totalSum += Double.parseDouble(amount);
        }

        for (String amount : amount_debited) {
            totalSum -= Double.parseDouble(amount);
        }
        totalSum = Math.round(totalSum * 100.0) / 100.0;
        Assert.assertEquals(totalSum,1996.22);

        }


    }

