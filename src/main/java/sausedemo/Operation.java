package sausedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Operation {
    private WebDriver driver;
    @BeforeTest
            public void beforeTest() {
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    @Test
    public void loadPage(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
}
