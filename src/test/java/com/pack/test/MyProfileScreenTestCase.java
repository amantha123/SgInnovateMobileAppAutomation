package com.pack.test;

import io.appium.java_client.MobileElement;
import org.junit.Test;

public class MyProfileScreenTestCase extends BaseConfig{

    @Test
    public void VerifyMyProfileScreen() throws InterruptedException {

        Thread.sleep(4000);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
        el1.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("+1");
        el2.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.widget.EditText");
        el3.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);
        el3.sendKeys("Sri Lanka");
        System.out.println("Text is entered");
        Thread.sleep(2000);

        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sri Lanka");
        el4.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el4.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
        el5.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);
        el5.sendKeys("774848813");
        System.out.println("Text is entered");
        Thread.sleep(2000);
        driver.hideKeyboard();

        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
        el6.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);
        el6.sendKeys("Test@1984");
        System.out.println("Text is entered");
        Thread.sleep(2000);
        driver.hideKeyboard();

        MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Login\"]");
        el7.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("My Profile");
        el8.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("About Me");
        el9.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("My QR Codes & Links");
        el10.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Private Chats");
        el11.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Notifications");
        el12.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("Preferences");
        el13.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("Help Centre");
        el14.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("Log Out");
        el15.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el15.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View");
        el16.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el17 = (MobileElement) driver.findElementByAccessibilityId("LOGOUT");
        el17.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

    }
}