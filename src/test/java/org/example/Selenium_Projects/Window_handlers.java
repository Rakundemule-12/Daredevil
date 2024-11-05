package org.example.Selenium_Projects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class Window_handlers {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }


    @Description("To Verify Windows handler")
    @Test
    public void test_windows_p4() throws InterruptedException {

        driver.manage().window().maximize();
        String URL = "https://the-internet.herokuapp.com/windows";

        driver.get(URL);
        driver.manage().window().maximize();

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles: " + windowHandles);

        for (String handle:windowHandles){
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("Testcase Passed!!");
                break;
            }
        }
//<li class="screenshot-thumb-wrap ng-scope" id="js-heatmap-thumbnail" ng-repeat="variation in variationsToShow track by variation.id" ng-show="campaignUtils.shouldShowVariation(variation, campaign)"> <div class="D(f) Ai(c) Mb(20px)"> <div class="Fxs(0) Mend(10px) Mend(0):lc variation-icon ng-binding" vwo-color="variation" color-on="icon" style="background-color: rgb(62, 148, 224);"> V1 </div> <!-- ngIf: !isScreenshotCompareMode --><div class="variation-name Miw(0) Mend(10px) Mend(0):lc ng-scope" vwo-dynamic-tooltip-next="" tooltip-position="TooltipPosition.RIGHT" ng-if="!isScreenshotCompareMode" is-tooltip-disabled="campaign.type !== CampaignTypeEnum.MVT" tooltip-width="240">  <div class="C(dataTextColor) Fw(semi-bold) ng-binding ng-scope ellipsis" vwo-ellipsize="">Variation 1</div> </div><!-- end ngIf: !isScreenshotCompareMode --> <!-- ngIf: isScreenshotCompareMode --> </div> <div ng-click="openModal(variation)" class="screenshot-thumb" vwo-segment-event="SegmentAnalyticsEnum.CAMPAIGNS.HEATMAP_CLICKMAP_OPENED" event-properties="{campaignType: campaign.type, campaignId: campaign.id, variationId: variation.id}" event-name-meta="{campaignType: campaign.type}"> <div class="screenshot-thumb ng-isolate-scope" ng-style="(campaign.type === CampaignTypeEnum.ANALYZE_HEATMAP || campaign.type === CampaignTypeEnum.HEATMAP) &amp;&amp; { 'width': '100%' }" data-qa="yedexafobi" data-quick-img-url="//storage.googleapis.com/qss.vwo.com/666400/13_2_afbf156c64c5ce88733d87b9cfec2fbd.png" data-heatmap-thumb-url="//heatmap.visualwebsiteoptimizer.com/h/viswebopt-666400_13_2_calc-0.png" data-variation="2" data-campaign="campaign" evaluation-product="insights"> <img class="screenshot-thumb__img" ng-src="//storage.googleapis.com/qss.vwo.com/666400/13_2_afbf156c64c5ce88733d87b9cfec2fbd.png" ng-hide="!imgUrl" vwo-on-error="onImgError()" data-qa="danawobuqa" src="//storage.googleapis.com/qss.vwo.com/666400/13_2_afbf156c64c5ce88733d87b9cfec2fbd.png"> <img ng-hide="hasHeatmapImgFailed" vwo-on-error="onHeatmapImgError()" class="screenshot-thumb__img ng-hide" ng-src="//heatmap.visualwebsiteoptimizer.com/h/viswebopt-666400_13_2_calc-0.png" ng-style="((campaign.type === CampaignTypeEnum.ANALYZE_HEATMAP) || (campaign.type === CampaignTypeEnum.HEATMAP)) &amp;&amp; { 'width': '100%' }" data-qa="hanavajido" src="//heatmap.visualwebsiteoptimizer.com/h/viswebopt-666400_13_2_calc-0.png"> <div class="screenshot-thumb__overlay" ng-class="{'D(b)' : (isHeatmapAvailable || isHeatmapAvailable === false)}" data-qa="voferojeve"></div> <div class="loader Pos(a) T(50%) Start(50%) Translate(-50%,-50%) ng-hide" ng-show="isGeneratingQuickScreenshot" data-qa="hirofefare"></div> <div ng-class="{'screenshot-thumb__show-msg' : (isHeatmapAvailable || isHeatmapAvailable === false), 'screenshot-thumb__click-msg' : (isHeatmapAvailable === undefined) }" evaluation-product="insights" data-qa="meqeqiwiwe" vwo-upgrade-new="(campaign.type === CampaignTypeEnum.ANALYZE_HEATMAP || campaign.type === CampaignTypeEnum.HEATMAP || campaign.isHeatmapEnabled) ? false : $root.FeatureFlags.HEATMAP_VARIATION_HEATMAPS"
// class="ng-binding screenshot-thumb__click-msg"> View Heatmap </div> </div> </div> </li>
    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}


