package org.example.Selenium_Coding_Challenges;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class demoqa {
    @Description("Verify demoqa")
    @Test
    public void addition() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
//<svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 1024 1024" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M880 836H144c-17.7 0-32 14.3-32 32v36c0 4.4 3.6 8 8 8h784c4.4 0 8-3.6 8-8v-36c0-17.7-14.3-32-32-32zm-622.3-84c2 0 4-.2 6-.5L431.9 722c2-.4 3.9-1.3 5.3-2.8l423.9-423.9a9.96 9.96 0 0 0 0-14.1L694.9 114.9c-1.9-1.9-4.4-2.9-7.1-2.9s-5.2 1-7.1 2.9L256.8 538.8c-1.5 1.5-2.4 3.3-2.8 5.3l-29.5 168.2a33.5 33.5 0 0 0 9.4 29.8c6.6 6.4 14.9 9.9 23.8 9.9z"></path></svg>

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/webtables");
        WebElement element = driver.findElement(By.xpath("(//div[contains(@class,'ReactTable')]//div[@role='row']//div[@class='action-buttons']//span[@title='Edit'])[3]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath("(//div[contains(@class,'ReactTable')]//div[@role='row']//div[@class='action-buttons']//span[@title='Edit'])[3]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='registration-form-modal']")));
        String actTitle = driver.findElement(By.xpath("//div[@id='registration-form-modal']")).getText();
        Assert.assertEquals(actTitle, "Registration Form");
        String actAge = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("value");
        Assert.assertEquals(actAge, "29");
        String actSalary = driver.findElement(By.xpath("//input[@id='salary']")).getAttribute("value");
        Assert.assertEquals(actSalary, "2000");
        String actDepartment = driver.findElement(By.xpath("//input[@id='department']")).getAttribute("value");
        Assert.assertEquals(actDepartment, "Legal");
        driver.findElement(By.id("submit")).click();
        driver.quit();
    }
}
