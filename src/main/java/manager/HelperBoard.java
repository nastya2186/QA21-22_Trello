package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBoard extends HelperBase{
    public HelperBoard(WebDriver driver) {
        super(driver);
    }

    By buttonCreateNewBoard = By.xpath("//span[text()='Create new board']");

    By inputBoardTitle = By.xpath("//input[@data-testid='create-board-title-input']");
    By buttonCreateBoard = By.xpath("//button[@data-testid='create-board-submit-button']");

    By textBoardTittle = By.xpath("//h1[@data-testid='board-name-display']");




    public void createNewBoard(String boardTitle) {
        clickBase(buttonCreateNewBoard);
        typeBase(inputBoardTitle,boardTitle);
        clickBase(buttonCreateBoard);
    }


    public boolean isBoardTittlePresent(String text){
        return isTextInElementEquals(textBoardTittle,text);
    }




}
