package org.example.ex_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Locators_VWO {

    @Test
    public void vWO_Locatior()
    {
        ChromeOptions edgeOptions = new ChromeOptions();
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new ChromeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        //Find the email input by ID and enter the email
        //<input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
        //<input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">
        //<button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
        //<div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>


          WebElement emailinputbox  =driver.findElement(By.id("login-username"));
          emailinputbox.sendKeys("admin@admin.com");

        WebElement passwordbox  =driver.findElement(By.id("login-password"));
        passwordbox.sendKeys("mamemem");

        WebElement buttonclick  =driver.findElement(By.id("js-login-btn"));
        buttonclick.click();

        //after 3 seconds an error message should come, please add try catch block or wait method else test case fails
        //because we have not waited

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement notified = driver.findElement(By.id("js-notification-box-msg"));
        Assert.assertEquals(notified.getText(),"Your email, password, IP address or location did not match");

       driver.quit();
    }


}
