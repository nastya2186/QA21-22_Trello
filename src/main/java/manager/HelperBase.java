package manager;

import org.openqa.selenium.*;

import java.util.List;

public class HelperBase {

    WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public void pause(){

        try {
            Thread.sleep(time * 1000L);
        }catch(InterruptedException e){
            throw new RuntimeException(e);

        }
    }

    public void clickBase(By locator){
        WebElement element = driver.findElement(locator);
        element.click();
            }

}
