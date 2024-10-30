package org.example.Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Automate_opencart {

    @Test
    public void open_cart()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");

        //<input type="text"
        // name="firstname"
        // value="" placeholder="First Name" id="input-firstname" class="form-control">

        WebElement first_name = driver.findElement(By.id("input-firstname"));
        first_name.sendKeys("vbfgh");


        //<input type="text" name="lastname" value="" placeholder="Last Name"
        // id="input-lastname" class="form-control">

        WebElement last_name = driver.findElement(By.id("input-lastname"));
        last_name.sendKeys("rrte");


       //<input type="email" name="email" value="" placeholder="E-Mail"
        // id="input-email" class="form-control">
        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("rtvv@gmail.com");


        //<input type="tel" name="telephone" value="" placeholder="Telephone"
        // id="input-telephone" class="form-control">
        WebElement telephone = driver.findElement(By.id("input-telephone"));
        telephone .sendKeys("9876546745");

        //<input type="password" name="password" value="" placeholder="Password"
        // id="input-password" class="form-control">
        WebElement password = driver.findElement(By.id("input-password"));
        password .sendKeys("abc123");

       //<input type="password" name="confirm" value="" placeholder="Password Confirm"
        // id="input-confirm" class="form-control">
        WebElement passwordconfirm = driver.findElement(By.id("input-confirm"));
        passwordconfirm .sendKeys("abc123");

        //<label class="radio-inline">
        //<input type="radio" name="newsletter" value="0" checked="checked">
        //No</label>
        WebElement newsletter = driver.findElement(By.className("radio-inline"));
        newsletter.click();

       // <input type="checkbox" name="agree" value="1">
        WebElement agree = driver.findElement(By.name("agree"));
        agree.click();

        //<input type="submit" value="Continue" class="btn btn-primary">
        //<input type="submit" value="Continue" class="btn btn-primary">
        WebElement button_continue = driver.findElement(By.className("btn-primary"));
        button_continue.click();

        //<div id="content" class="col-sm-9">
        //      <h1>Your Account Has Been Created!</h1>
        //      <p>Congratulations! Your new account has been successfully created!</p> <p>You can now take advantage of member privileges to enhance your online shopping experience with us.</p> <p>If you have ANY questions about the operation of this online shop, please e-mail the store owner.</p> <p>A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please <a href="https://awesomeqa.com/ui/index.php?route=information/contact">contact us</a>.</p>
        //      <div class="buttons">
        //        <div class="pull-right"><a href="https://awesomeqa.com/ui/index.php?route=account/account" class="btn btn-primary">Continue</a></div>
        //

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        WebElement created = driver.findElement(By.id("content"));
        String actualText = created.getText();
        Assert.assertTrue(actualText.contains("Your Account Has Been Created!"));


    }
}
