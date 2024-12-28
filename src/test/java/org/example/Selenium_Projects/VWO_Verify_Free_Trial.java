package org.example.Selenium_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class VWO_Verify_Free_Trial {

    @Description("Verify the free trial")
    @Test
    public void free_Trial()
    {

        ChromeOptions edgeOptions = new ChromeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(edgeOptions);
        driver.get("https://vwo.com/free-trial/");

        //<input class="W(100%) Py(14px) input-text" placeholder="name@yourcompany.com"
        // type="email" id="page-v1-step1-email" name="email" data-qa="page-su-step1-v1-email"
        // required="" data-gtm-form-interact-field-id="0">
        //<label for="page-458cu-gdpr-consent-checkbox" class="Ta(start) Cur(p) Fz($font-size-12) Mstart(10px) Us(n)">
        //I agree to VWO's <a class="C($color-blue) white_C($color-white)" href="https://vwo.com/privacy-policy/" target="_blank">Privacy Policy</a> &amp;
        //<a href="https://vwo.com/terms/" class="C($color-blue) white_C($color-white)" target="_blank">Terms</a>    </label>
        //<input class="Cur(p) Flxs(0) M(0)" type="checkbox"
        // name="gdpr_consent_checkbox" id="page-458cu-gdpr-consent-checkbox" value="true" data-qa="page-gdpr-consent-checkbox">

        WebElement emailbox = driver.findElement(By.id("page-v1-step1-email"));
        emailbox.sendKeys("osdpsdmsdmgfmak");

        WebElement chkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        chkbox.click();

        List<WebElement> buttonlist = driver.findElements(By.tagName("button"));
        buttonlist.get(0).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
