package org.example.testFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
    ChromeDriver driver;
//   Absulte Xpath
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
       driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/fieldset/label[2]/input")).click();
        Thread.sleep(4000);

                //html/body/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/fieldset/label[2]/input
                //copy from Inspect/Input Right click /copy/ full xpath
    }
    @After
    public void closeTest(){
        driver.close();
    }
}



