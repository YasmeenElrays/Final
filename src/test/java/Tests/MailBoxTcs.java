package Tests;

import DriverBase.Base;
import Pages.MailBoxFeature;
import Pages.UserLogin;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class MailBoxTcs extends Base {

    MailBoxFeature mailBoxObj;
    @Test(priority = 1)
    public void ClickOnMailboxModule(){
        mailBoxObj=new MailBoxFeature(driver);
        mailBoxObj.MailBoxModule();

    }
    @Test(priority = 2)
    public void ComposeTheMessage() throws AWTException {
        mailBoxObj=new MailBoxFeature(driver);
        mailBoxObj.ComposeMessageWithAttachment();

    }



}


