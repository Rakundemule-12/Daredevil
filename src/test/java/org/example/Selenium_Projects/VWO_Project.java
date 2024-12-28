package org.example.Selenium_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VWO_Project {

    @Test
    public void project_vwo()
    {


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        //title verification
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }

}
