package org.example.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLwithJunit {
ChromeDriver driver;

@Before  // Before the test open webdriver the  Chrome breowser
    public void setUpChrome() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
}
        @Test  // test  open the website
    public void openNextWebsite() {
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk/");
    }

    @Test
    public void openNetflix() {
        driver.manage().window().maximize();
        driver.get("https://www.netflix.com/");
    }

    @Test
    public void openBandQWebsite(){
    driver.get("https://www.diy.com");

    }

    @After  // after test close webdriver
    public void closeTest(){
        driver.close();
    }

}
