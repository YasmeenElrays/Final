package Tests;

import DriverBase.Base;
import Pages.UserLogin;
import org.testng.annotations.Test;

public class LoginTCs extends Base {
    @Test(alwaysRun = true)
    public void Login(){
        UserLogin Login=new UserLogin(driver);
        Login.LoginPage();

        
       // Login.newPopupCloseBtn.click();
    }

}
