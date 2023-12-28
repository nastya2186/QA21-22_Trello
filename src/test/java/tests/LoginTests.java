package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void LoginPositiveTest(){
        app.getHelperUser().login("nastyakudriashev@gmail.com","maksliza1914");
        Assert.assertTrue(app.getHelperUser().isLogged());

    }

}
