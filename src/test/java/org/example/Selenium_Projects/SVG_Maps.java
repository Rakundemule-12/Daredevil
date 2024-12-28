package org.example.Selenium_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SVG_Maps {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }


    @Description("Verify that the tripura is in india and click on it.")
    @Test
    public void test_svg_india_search_click() throws InterruptedException {


        String URL = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);
        driver.manage().window().maximize();
        // local-name() , name()- Xpath (built in)
        // document.querySelectorAll("#login-username"); - JS
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        List<WebElement> states = driver.findElements
                (By.xpath("//*[local-name()='svg']/*[local-name()='g'][7]/*[local-name()='g']/*[local-name()='g']/*[local-name()='path']"));


        for (WebElement state : states) {
            System.out.println(state.getAttribute("aria-label"));
            if (state.getAttribute("aria-label").contains("Delhi")) {
                wait.until(ExpectedConditions.elementToBeClickable(state)).click();
                Thread.sleep(30000);

            }

        }


    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}