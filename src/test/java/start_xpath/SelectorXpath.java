package start_xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectorXpath {

    WebDriver driver;

    @BeforeClass
    public void preCondition(){
        driver = new ChromeDriver();
        driver.get("https://trello.com/");
        System.out.println("before class");

    }

    @Test
    public void start(){
        System.out.println("Hi test 1 ======");
    }

    @Test
    public void start1(){
        System.out.println("Hi test 2 ======");
    }

    @AfterClass
    public void tearDown(){
       // driver.quit();
    }


}
