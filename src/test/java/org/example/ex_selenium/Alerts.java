package org.example.ex_selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts {

    @Description("Alerts to be Verified")
    @Test
    public void alerts()
    {
        ChromeOptions edgeOptions = new ChromeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(edgeOptions);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//        WebElement alert1 = driver.findElement(By.xpath("//button[@onClick = 'jsAlert()']"));
//        alert1.click();

//        WebElement confirmalert = driver.findElement(By.xpath("//button[@onClick = 'jsConfirm()']"));
//        confirmalert.click();

        WebElement propmtalert = driver.findElement(By.xpath("//button[@onClick = 'jsPrompt()']"));
        propmtalert.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("KEERTI");
        alert.accept();
        //alert.dismiss();


        WebElement button = driver.findElement(By.id("result"));
//        Assert.assertEquals(button.getText(),"You clicked: Ok");
        Assert.assertEquals(button.getText(),"You entered: KEERTI");


    }
}
