package org.example.testFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReletiveXpath {
    ChromeDriver driver;

    @Before
    public void setUpChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    //Find BY ID Locator
    @Test
    public void openTestWebsite() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();

        Thread.sleep(4000);

        //Relatevie Xpath  this is created by us and check by CtRL+F in Inspect and past if match from HTML file then we can run
        //     //Input[@id="bmwcheck"]


    }
    @After
    public void closeTest(){
        driver.close();
    }
}

