package Tests;

import DriverBase.Base;
import Pages.VirtualMeeting;
import org.testng.annotations.Test;

public class VMTCs extends Base {
    VirtualMeeting VMObj=new VirtualMeeting(driver);
    @Test(priority = 1)
    public void Creation() throws InterruptedException {
        VMObj=new VirtualMeeting(driver);
        VMObj.VMPage();
    }

}
