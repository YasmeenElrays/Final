package Tests;

import DriverBase.Base;
import Pages.LoginPageTask;
import Pages.UserLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTCs extends Base {

    @Test(alwaysRun = true ,description = " Check if the validation message displayed when Login With Wrong Credentials ")
    public void Login(){
        LoginPageTask Login=new LoginPageTask(driver);
        Login.LoginWithInvalidCredentials();
        Assert.assertEquals(Login.flashMsg.getText(),"Username or password is incorrect");

    }
}
