package sausedemo;
import org.testng.annotations.Test;

public class Operation extends Runner{

    @Test
    public void loadPage(){
        driver.get("https://www.saucedemo.com/");
        SausLog sausLog=new SausLog(driver);
        sausLog.SetLogSearch();
    }
}



