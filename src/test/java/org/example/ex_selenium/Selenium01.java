package org.example.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://bollywoodhungama.com");
        chromeDriver.quit();
    }
}
