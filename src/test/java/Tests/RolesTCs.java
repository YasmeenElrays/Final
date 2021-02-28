package Tests;

import DriverBase.Base;
import Pages.DiscussionRoom;
import Pages.Roles;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RolesTCs extends Base {

    Roles RolesObj=new Roles(driver);
    @Test(description = "Check the created discussion Room Displayed for the selected Students ",priority = 11)
    public void CheckStudentRole(){
        RolesObj=new Roles(driver);
        RolesObj.RoleStudent();
        Assert.assertTrue(RolesObj.TotalPostCheck.isDisplayed());
    }
    @Test(description = "Check the created Discussion Room Displayed to Guardian",priority = 12)
    public void CheckGuardianRole(){
        RolesObj=new Roles(driver);
        RolesObj.RoleGuardian();
        Assert.assertTrue(RolesObj.TotalPostCheck.isDisplayed());
    }
    @Test(description = "Check the created Discussion Room Displayed to managers",priority = 13)
    public void CheckManagerRole() throws InterruptedException {
        RolesObj=new Roles(driver);
        DiscussionRoom DissRoom=new DiscussionRoom(driver);
        RolesObj.RoleManager();
//        Assert.assertTrue(DissRoom.ClickOnDiscussionRooms.isDisplayed());
        Assert.assertTrue(RolesObj.TotalPostCheck.isDisplayed());
    }
    @Test(description = "Check The created Discussion Room Displayed to admin",priority = 14)
    public void CheckAdminRole() throws InterruptedException {
        RolesObj = new Roles(driver);
        DiscussionRoom DissRoom=new DiscussionRoom(driver);
        RolesObj.RoleAdmin();
        Assert.assertTrue(DissRoom.matchedDiscussionRooms.isDisplayed());
    }
    @Test(description = " Check Discussion room not displayed when Login as other teacher on same Course ",priority = 15)
    public void CheckOtherTeacherRole() {
        RolesObj = new Roles(driver);
        RolesObj.OtherTeacherRoleTest();
        Assert.assertTrue(RolesObj.DiscussionForOtherTeacher.isDisplayed());
    }
    @Test(description = "Check the created Discussion Room Displayed For Teacher supervisor")
       public void CheckSupervisorRole() throws InterruptedException {
        RolesObj.SupervisorRole();
        Assert.assertEquals(RolesObj.SearchResultsFromStudent.getText(),"Xml DiscussionRoomTitle value");
        Assert.assertTrue(RolesObj.TotalPostCheck.isDisplayed());
    }
    @Test(description = "Check Delete Case From TeacherRole",priority = 16)
    public void CheckDeleteCase(){
        RolesObj = new Roles(driver);
        RolesObj.RoleTeacherFotDelete();
        DiscussionRoom DissRoom=new DiscussionRoom(driver);
        Assert.assertEquals(DissRoom.FlashMsg.getText(),"Post deleted");
        //Message in Arabic
        //تم حذف الموضوع
        Assert.assertTrue(RolesObj.ClickOnDiscussionRoomDeleteResults.isDisplayed());
    }
}

