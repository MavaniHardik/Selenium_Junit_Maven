package org.example.testFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTab {

    ChromeDriver driver;

    @Before
    public void setUpChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test
    public void openTestWebsite() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");


    }
    @After
    public void closeTest(){
        driver.close();
    }
}