package org.example.Selenium_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class Actions_MakemyTrip {
    ChromeDriver chromeDriver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        chromeDriver = new ChromeDriver(options);
    }

    @Description("Automate Awesome QA Website")
    @Test
    public void Make_trip()
    {
        chromeDriver.manage().window().maximize();
        String URL = "https://www.makemytrip.com/";
        chromeDriver.get(URL);
        chromeDriver.manage().window().maximize();


        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        //<span data-cy="closeModal" class="commonModal__close"></span>
        WebElement source = chromeDriver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        source.click();

//        Actions actions  = new Actions(chromeDriver);
//        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

        WebElement fromCity = chromeDriver.findElement(By.id("fromCity"));

        Actions actions = new Actions(chromeDriver);
        actions.moveToElement(fromCity).click().sendKeys("del").build().perform();

        //<ul role="listbox" class="react-autosuggest__suggestions-list">
        // <li role="option" id="react-autowhatever-1-section-0-item-0" aria-selected="false" class="react-autosuggest__suggestion react-autosuggest__suggestion--first" data-section-index="0" data-suggestion-index="0"><div class="makeFlex"><img class="icLocAlt appendRight8" src="https://imgak.mmtcdn.com/flights/assets/media/dt/common/icons/ic-flight-onward.png" alt="icon"><div class="makeFlex flexOne column"><div class="makeFlex flexOne spaceBetween"><div class="makeFlex flexOne spaceBetween appendRight10"><div class="makeFlex column flexOne appendRight10"><p class="font14 appendBottom5 blackText">Mumbai, India</p></div></div><div class="font14 lightGreyText latoBold">BOM</div></div><p class="font12 greyText appendBottom3 lineHeight14"> Chhatrapati Shivaji International Airport</p></div></div></li><li role="option" id="react-autowhatever-1-section-0-item-1" aria-selected="false" class="react-autosuggest__suggestion" data-section-index="0" data-suggestion-index="1"><div class="makeFlex"><img class="icLocAlt appendRight8" src="https://imgak.mmtcdn.com/flights/assets/media/dt/common/icons/ic-flight-onward.png" alt="icon"><div class="makeFlex flexOne column"><div class="makeFlex flexOne spaceBetween"><div class="makeFlex flexOne spaceBetween appendRight10"><div class="makeFlex column flexOne appendRight10"><p class="font14 appendBottom5 blackText">New Delhi, India</p></div></div><div class="font14 lightGreyText latoBold">DEL</div></div><p class="font12 greyText appendBottom3 lineHeight14"> Indira Gandhi International Airport</p></div></div></li><li role="option" id="react-autowhatever-1-section-0-item-2" aria-selected="false" class="react-autosuggest__suggestion" data-section-index="0" data-suggestion-index="2"><div class="makeFlex"><img class="icLocAlt appendRight8" src="https://imgak.mmtcdn.com/flights/assets/media/dt/common/icons/ic-flight-onward.png" alt="icon"><div class="makeFlex flexOne column"><div class="makeFlex flexOne spaceBetween"><div class="makeFlex flexOne spaceBetween appendRight10"><div class="makeFlex column flexOne appendRight10"><p class="font14 appendBottom5 blackText">Bangkok, Thailand</p></div></div><div class="font14 lightGreyText latoBold">BKK</div></div><p class="font12 greyText appendBottom3 lineHeight14"> Bangkok</p></div></div></li><li role="option" id="react-autowhatever-1-section-0-item-3" aria-selected="false" class="react-autosuggest__suggestion" data-section-index="0" data-suggestion-index="3"><div class="makeFlex"><img class="icLocAlt appendRight8" src="https://imgak.mmtcdn.com/flights/assets/media/dt/common/icons/ic-flight-onward.png" alt="icon"><div class="makeFlex flexOne column"><div class="makeFlex flexOne spaceBetween"><div class="makeFlex flexOne spaceBetween appendRight10"><div class="makeFlex column flexOne appendRight10"><p class="font14 appendBottom5 blackText">Bengaluru, India</p></div></div><div class="font14 lightGreyText latoBold">BLR</div></div><p class="font12 greyText appendBottom3 lineHeight14"> Bengaluru International Airport</p></div></div></li><li role="option" id="react-autowhatever-1-section-0-item-4" aria-selected="false" class="react-autosuggest__suggestion" data-section-index="0" data-suggestion-index="4"><div class="makeFlex"><img class="icLocAlt appendRight8" src="https://imgak.mmtcdn.com/flights/assets/media/dt/common/icons/ic-flight-onward.png" alt="icon"><div class="makeFlex flexOne column"><div class="makeFlex flexOne spaceBetween"><div class="makeFlex flexOne spaceBetween appendRight10"><div class="makeFlex column flexOne appendRight10"><p class="font14 appendBottom5 blackText">Pune, India</p></div></div><div class="font14 lightGreyText latoBold">PNQ</div></div><p class="font12 greyText appendBottom3 lineHeight14"> Pune Airport</p></div></div></li><li role="option" id="react-autowhatever-1-section-0-item-5" aria-selected="false" class="react-autosuggest__suggestion" data-section-index="0" data-suggestion-index="5"><div class="makeFlex"><img class="icLocAlt appendRight8" src="https://imgak.mmtcdn.com/flights/assets/media/dt/common/icons/ic-flight-onward.png" alt="icon"><div class="makeFlex flexOne column"><div class="makeFlex flexOne spaceBetween"><div class="makeFlex flexOne spaceBetween appendRight10"><div class="makeFlex column flexOne appendRight10"><p class="font14 appendBottom5 blackText">Hyderabad, India</p></div></div><div class="font14 lightGreyText latoBold">HYD</div></div><p class="font12 greyText appendBottom3 lineHeight14"> Rajiv Gandhi International Airport</p></div></div></li><li role="option" id="react-autowhatever-1-section-0-item-6" aria-selected="false" class="react-autosuggest__suggestion" data-section-index="0" data-suggestion-index="6"><div class="makeFlex"><img class="icLocAlt appendRight8" src="https://imgak.mmtcdn.com/flights/assets/media/dt/common/icons/ic-flight-onward.png" alt="icon"><div class="makeFlex flexOne column"><div class="makeFlex flexOne spaceBetween"><div class="makeFlex flexOne spaceBetween appendRight10"><div class="makeFlex column flexOne appendRight10"><p class="font14 appendBottom5 blackText">Kolkata, India</p></div></div><div class="font14 lightGreyText latoBold">CCU</div></div><p class="font12 greyText appendBottom3 lineHeight14"> Netaji Subhash Chandra Bose International Airport</p></div></div></li><li role="option" id="react-autowhatever-1-section-0-item-7" aria-selected="false" class="react-autosuggest__suggestion" data-section-index="0" data-suggestion-index="7"><div class="makeFlex"><img class="icLocAlt appendRight8" src="https://imgak.mmtcdn.com/flights/assets/media/dt/common/icons/ic-flight-onward.png" alt="icon"><div class="makeFlex flexOne column"><div class="makeFlex flexOne spaceBetween"><div class="makeFlex flexOne spaceBetween appendRight10"><div class="makeFlex column flexOne appendRight10"><p class="font14 appendBottom5 blackText">Chennai, India</p></div></div><div class="font14 lightGreyText latoBold">MAA</div></div><p class="font12 greyText appendBottom3 lineHeight14"> Chennai International Airport</p></div></div></li><li role="option" id="react-autowhatever-1-section-0-item-8" aria-selected="false" class="react-autosuggest__suggestion" data-section-index="0" data-suggestion-index="8"><div class="makeFlex"><img class="icLocAlt appendRight8" src="https://imgak.mmtcdn.com/flights/assets/media/dt/common/icons/ic-flight-onward.png" alt="icon"><div class="makeFlex flexOne column"><div class="makeFlex flexOne spaceBetween"><div class="makeFlex flexOne spaceBetween appendRight10"><div class="makeFlex column flexOne appendRight10"><p class="font14 appendBottom5 blackText">Goa - Dabolim Airport, India</p></div></div><div class="font14 lightGreyText latoBold">GOI</div></div><p class="font12 greyText appendBottom3 lineHeight14"> Goa Dabolim International Airport</p></div></div></li><li role="option" id="react-autowhatever-1-section-0-item-9" aria-selected="false" class="react-autosuggest__suggestion" data-section-index="0" data-suggestion-index="9"><div class="makeFlex"><img class="icLocAlt appendRight8" src="https://imgak.mmtcdn.com/flights/assets/media/dt/common/icons/ic-flight-onward.png" alt="icon"><div class="makeFlex flexOne column"><div class="makeFlex flexOne spaceBetween"><div class="makeFlex flexOne spaceBetween appendRight10"><div class="makeFlex column flexOne appendRight10"><p class="font14 appendBottom5 blackText">Dubai, United Arab Emirates</p></div></div><div class="font14 lightGreyText latoBold">DXB</div></div><p class="font12 greyText appendBottom3 lineHeight14"> Dubai International</p></div></div></li></ul>

        List<WebElement> list_auto_complete = chromeDriver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
        for(WebElement e : list_auto_complete){
            if(e.getText().contains("New Delhi")){
                e.click();
                break;
            }
        }


        try {
            Thread.sleep(13000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chromeDriver.quit();
    }
}
