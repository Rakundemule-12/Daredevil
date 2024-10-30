package org.example.Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class VWO_Links {

    @Test
    public void links_Works()
    {
        //<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link" data-qa="bericafeqo">Start a free trial</a>

        ChromeOptions edgeOptions = new ChromeOptions();
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new ChromeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());



//        WebElement linksworks  = driver.findElement(By.linkText("Start a free trial"));
//        linksworks.click();

//      partial link text
        WebElement partiallinksworks  = driver.findElement(By.partialLinkText("free trial"));
        partiallinksworks.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();
    }
}
