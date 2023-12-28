package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver driver;


    HelperUser helperUser;
    HelperBoard helperBoard;


    public void init(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://trello.com/");
        helperUser = new HelperUser(driver);
        helperBoard = new HelperBoard(driver);
    }

    public HelperBoard getHelperBoard(){
        return helperBoard;
    }

    public HelperUser getHelperUser(){
        return helperUser;
    }

    public void stop(){
        //driver.quit();
    }
}
