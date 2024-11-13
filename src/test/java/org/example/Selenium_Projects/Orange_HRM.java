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

public class Orange_HRM {

    ChromeDriver chromeDriver;
    //div[@class='oxd-table-body']/div/div/div/div/button[1]
    //div[@class='oxd-table-body']/div[1]/div/div[5]-columns

    //div[@class='oxd-table-body']/div[1]/div/div[9]/div/button[1]-button action

    @BeforeTest
    public void before_Test()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeDriver = new ChromeDriver(options);
    }

    @Description("Automating Orange HRM Tables")
    @Test
    public  void orange()
    {
       chromeDriver.manage().window().maximize();
       chromeDriver.get("https://awesomeqa.com/hr/web/index.php/pim/viewEmployeeList");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //<input class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="" data-v-844e87dc="">
        WebElement username = chromeDriver.findElement(By.name("username"));
        username.sendKeys("admin");

        WebElement password = chromeDriver.findElement(By.name("password"));
        password.sendKeys("Hacker@4321");


        ////button[@type='submit']
        WebElement button = chromeDriver.findElement(By.xpath("//button[@type='submit']"));
        button.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       int rows= chromeDriver.findElements(By.xpath("//div[@class='oxd-table-body']/div")).size();
       int cols =chromeDriver.findElements(By.xpath("//div[@class='oxd-table-body']/div[2]/div/div")).size();

        System.out.println("The number of rows are: "+rows);
        System.out.println("The number of columns are: "+cols);

        WebElement btn_clik = chromeDriver.findElement(By.xpath("//div[@class='oxd-table-body']/div[1]/div/div[9]/div/button[1]"));
        btn_clik.click();


    }


    @AfterTest
    public void close_Browser()
     {
         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }

}
