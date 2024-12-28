package org.example.Selenium_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SVG_Flipkart {
    ChromeDriver driver;


   @BeforeTest
    public void open_Browser()
   {
       ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//       chromeOptions.addArguments()
       chromeOptions.addArguments("--start-maximized");
       driver = new ChromeDriver(chromeOptions);

   }

    @Description("Verify SVG Elements")
    @Test
    public void flips_cart()
    {
      driver.get("https://www.flipkart.com/");
      //<input class="Pke_EE" type="text" title="Search for Products, Brands and More" name="q" autocomplete="off"
        // placeholder="Search for Products, Brands and More" value="">
      WebElement webElement = driver.findElement(By.name("q"));
      webElement.sendKeys("macmini");

        List<WebElement> svg_list = driver.findElements(By.xpath("//*[name()='svg']"));
        svg_list.get(0).click();


        List<WebElement> title_list = driver.findElements(By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));
        for(WebElement title:title_list)
        {
            System.out.println(title.getText());
        }


    }

    @AfterTest
    public void close_Browser()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
