package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class HelperBoards extends HelperBase {

    public HelperBoards(WebDriver wd) {
        super(wd);
    }
    By btnCreateNewBoard = By.xpath("//div[@class='board-tile mod-add']");
    By inputBoardTitle = By.cssSelector("input[data-testid='create-board-title-input']");
    By btnCreateSubmit = By.cssSelector("button[data-testid='create-board-submit-button']");
    By boardTitle = By.cssSelector("h1[data-testid='board-name-display']");

    public void createNewBoard(String boardTitle) {
        clickBase(btnCreateNewBoard);
        typeBase(inputBoardTitle, boardTitle);

        pause();
        clickBase(btnCreateSubmit);
    }
    public  boolean isElementInBoardEqualsBoardTitle(String text) {
        return isTextInElementEquals(boardTitle, text);
    }

}
