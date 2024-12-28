package org.example.Selenium_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RL3 {

        ChromeDriver driver;

        @BeforeTest
        public void openBrowser() {
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            options.addArguments("--guest");
            driver = new ChromeDriver(options);
        }


        @Description("Verify RL")
        @Test
        public void test_RL_P3() throws InterruptedException {


            driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
            driver.manage().window().maximize();
            Thread.sleep(15000);

            // iframe
            driver.switchTo().frame("result");

            WebElement submit = driver.findElement(By.xpath("//form[@id=\"form\"]/button"));

            submit.click();

            WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
            WebElement errorElement = driver.findElement(with(By.tagName("small")).below(element));

            String errorText = errorElement.getText();
            Assert.assertTrue(errorElement.isDisplayed());
            Assert.assertEquals(errorText, "Username must be at least 3 characters");

            Thread.sleep(5000);


        }
    }

