package sausedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class SausLog { ;
    public WebDriver driver;

    public SausLog(WebDriver driver) {
        this.driver = driver;
    }

    public void SetLogSearch(){
        WebElement searchLog=driver.findElement(By.id("user-name"));
        searchLog.sendKeys("standard-user");
        WebElement searchPass= driver.findElement(By.className("form_group"));
        searchPass.sendKeys("secret_sauce");
        WebElement buttonLogin= driver.findElement(By.id("login-button"));
        buttonLogin.click();
        System.out.println("Log In Successfully");
    }

}


