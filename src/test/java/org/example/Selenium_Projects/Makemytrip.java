package org.example.Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Makemytrip {

    @Test
    public void Makemytrip_Wait() {
        ChromeOptions edgeOptions = new ChromeOptions();
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new ChromeDriver(edgeOptions);
        driver.navigate().to("https://www.makemytrip.com/");

        //<span data-cy="closeModal" class="commonModal__close"></span>
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        WebElement closemodel = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closemodel.click();
    }
}
