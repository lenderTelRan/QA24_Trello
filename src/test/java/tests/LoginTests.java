package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {
        String email = "eo133@ukr.net";
        String password = "12345678test";
        app.getHelperUser().login(email, password);
        Assert.assertTrue(app.getHelperUser().isElementPresent_btnAccount());
    }
}
