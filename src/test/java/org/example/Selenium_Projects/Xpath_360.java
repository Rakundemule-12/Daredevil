package org.example.Selenium_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Xpath_360 {

    @Description("Automation of the student login and verification")
    @Test
    public void login_360()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //<input _ngcontent-fbw-c4="" autofocus="" class="id-form-ctrl ng-pristine ng-valid ng-touched"
        // id="username" name="username" type="email">

        WebElement email_name = driver.findElement(By.id("username"));
       // WebElement email_name = driver.findElement(By.xpath("//input[@id = 'username'"));
        email_name.sendKeys("augtest_040823@idrive.com");

        //<input _ngcontent-fbw-c4="" class="id-form-ctrl ng-untouched ng-pristine ng-valid" id="password"
        // maxlength="20" name="password" tabindex="0" type="password">
        WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
        password.sendKeys("123456");

        //<span _ngcontent-fbw-c4="" class="id-checkmark" tabindex="-1"></span>
        WebElement remember = driver.findElement(By.xpath("//span[@class='id-checkmark']"));
        remember.click();

        //<button _ngcontent-fbw-c4="" class="id-btn id-info-btn-frm"
        // id="frm-btn" type="submit">Sign in</button>


        WebElement signin = driver.findElement(By.id("frm-btn"));
        //WebElement signin = driver.findElement(By.Xpath("//button[@id='frm-btn']"));
        signin.click();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




        //<h5 _ngcontent-dgc-c10="" class="id-card-title">Your free trial has expired</h5>

//         WebElement verify = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
//        //WebElement signin = driver.findElement(By.Xpath("//button[@id='frm-btn']"));
//        Assert.assertEquals(verify.getText(),"Your free trial has expired");

        WebElement error_message_free_trial = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        Assert.assertEquals(error_message_free_trial.getText(),"Your free trial has expired");


        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }

}
