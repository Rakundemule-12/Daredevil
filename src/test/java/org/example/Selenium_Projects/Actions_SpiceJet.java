package org.example.Selenium_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_SpiceJet {


    ////div[@data-testid='to-testID-origin']/div/div/input
    ChromeDriver chromeDriver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        chromeDriver = new ChromeDriver(options);
    }

    @Description("Automate Awesome QA Website")
    @Test
    public void awesome_qa()
    {
        chromeDriver.manage().window().maximize();
        String URL = "https://www.spicejet.com/";
        chromeDriver.get(URL);
        chromeDriver.manage().window().maximize();

        WebElement source = chromeDriver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        // Keyboards - > keyDown -> Shift -> send key -> key Up

        Actions actions  = new Actions(chromeDriver);
        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

        try {
            Thread.sleep(13000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chromeDriver.quit();
    }
}
