package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageTitleTest {
    public void testGooglePageTitle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.google.com");
            String title = driver.getTitle();
            System.out.println("Page Title: " + title);
            
            if(!"Google".equals(title)) {
                System.out.println("Test Failed: Expected title 'Google' but got '" + title + "'");
            }
            else{
                System.out.println("Test Passed: Page title is 'Google'");
            }
            // Wait for 60 seconds
            Thread.sleep(60000);
        } finally {
            driver.quit();
        }
}

}
