package tests;

import manager.ApplicationManager;
import models.UserDto;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    static ApplicationManager app = new ApplicationManager();
    UserDto user = new UserDto("eo133@ukr.net", "12345678test");

    @BeforeSuite
    public void setUp() {
        app.init();
    }

    @AfterSuite
    public void rearDown() {
        //app.stop();
    }
}
