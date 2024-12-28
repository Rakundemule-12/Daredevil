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

import java.util.List;

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
//        Assert.assertEquals(actualText,"Your Account Has Been Created!");


    }

    public static class Ebay_Selenium {
        @Description("Verify that Ebay Print the Prices")
        @Test
        public void ebay_Verify_Prices() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            chromeOptions.addArguments("--start-maximized");
            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.get("https://www.ebay.com/");

            //<input type="text" class="gh-tb ui-autocomplete-input" aria-autocomplete="list" aria-expanded="true" size="50"
            // maxlength="300" aria-label="Search for anything" placeholder="Search for anything"
            // id="gh-ac" name="_nkw" autocapitalize="off" autocorrect="off" spellcheck="false" autocomplete="off" aria-haspopup="true" role="combobox" aria-owns="ui-id-1">


            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            //<input type="text" class="gh-tb ui-autocomplete-input" aria-autocomplete="list" aria-expanded="true" size="50"
            // maxlength="300" aria-label="Search for anything" placeholder="Search for anything"
            // id="gh-ac" name="_nkw" autocapitalize="off" autocorrect="off" spellcheck="false" autocomplete="off" aria-haspopup="true" role="combobox" aria-owns="ui-id-1">

            WebElement search_box = driver.findElement(By.id("gh-ac"));
            search_box.sendKeys("macmini");

            //<input type="submit" class="btn btn-prim gh-spr" id="gh-btn"
            // value="Search" form="gh-f">
            WebElement btnclick = driver.findElement(By.id("gh-btn"));
            btnclick.click();

            //<span role="heading" aria-level="3"> <div class="s-item__title"><span role="heading" aria-level="3"><!--F#f_0-->Apple 2018 Mac Mini 3GHz 6 Core i5 8GB RAM 512GB SSD 1 YEAR WARRANTY- Excellent<!--F/--></span></div>
            // <!--F#f_0-->Apple 2018 Mac Mini 3GHz 6 Core i5 8GB RAM 512GB SSD 1 YEAR WARRANTY- Excellent<!--F/--></span>

            List<WebElement> searchtitiles = driver.findElements(By.xpath("//div[@class='s-item__title']/span"));
            List<WebElement> searchprices = driver.findElements(By.xpath("//span[@class='s-item__price']"));

            int size = Math.min(searchtitiles.size(), searchprices.size());

            for (int i = 0; i < size; i++)
            {
                System.out.println("Title: " + searchtitiles.get(i).getText() + "||" + "Price: " + searchprices.get(i).getText());
                System.out.println();

            }

    //        try {
    //            Thread.sleep(20000);
    //        } catch (InterruptedException e) {
    //            throw new RuntimeException(e);
    //        }



        }
    }
}
