package org.example.JavaPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Edgeoptions {
    public static void main(String[] args) {

//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--start-maximized");
//
//        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
//        chromeDriver.get("http://bollywoodhungama.com");

        //OR

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://bollywoodhungama.com");

    }
}
