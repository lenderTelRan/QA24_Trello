package tests;

import models.UserDto;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @Test
    public void loginPositiveTest() {
//        String email = "eo133@ukr.net";
//        String password = "12345678test";
        app.getHelperUser().login(user.getEmail(), user.getPassword());

        Assert.assertTrue(app.getHelperUser().isElementPresent_btnAccount());
    }
}
