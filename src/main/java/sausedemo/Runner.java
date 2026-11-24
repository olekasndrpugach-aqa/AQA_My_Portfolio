package sausedemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.time.Duration;

public class Runner {
    public WebDriver driver;
        @BeforeTest
        public void beforeTest () {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        @AfterTest
        public void afterTest () {
            driver.quit();
        }

    }

