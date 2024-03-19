package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class BoardsTests extends TestBase {
    @BeforeClass
    public void loginWithData() {
        app.getHelperUser().login(user.getEmail(), user.getPassword());
    }
    @Test
    public void createNewBoardPositiveTest() {
        int i = new Random().nextInt(1000);
        String boardTitle = "qa24_" + i;
        app.getHelperBoards().createNewBoard(boardTitle);
        Assert.assertTrue(app.getHelperBoards().isElementInBoardEqualsBoardTitle(boardTitle)); //???
    }
    @AfterMethod
    public void afterTest() {
        app.getHelperBoards().clickBtnBoards();
    }
}
