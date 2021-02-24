package Tests;

import DriverBase.Base;
import Pages.DiscussionRoom;
import Pages.PageBase;
import Pages.UserLogin;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DiscussionRoomTCs extends Base {

    @BeforeClass
    public void setupBrowserBeforeClass(){
        UserLogin Login=new UserLogin(driver);
        Login.LoginPage();
    }
    DiscussionRoom DissRoom;
    @Test(description = "User can Add Discussion Room After Fill Required fields Shared to Student",priority = 1,alwaysRun = true)
    public void ClickOnTheCourse() {
        DissRoom=new DiscussionRoom(driver);
        DissRoom.Course();
        String DiscussionRoomTitle = "AutomationDissroom" +PageBase.randomNumber(4);
        DissRoom.CreateDiscussionRoom(DiscussionRoomTitle);
        Assert.assertEquals(DissRoom.FlashMsg.getText(),"Your discussion room has been created");
        //Message In Arabic
        //تم إنشاء غرفة النقاش
        Assert.assertTrue(DissRoom.matchedDiscussionRooms.isDisplayed());
    }
    @Test(description = "User can Create Discussion Room With Hide All New Topics Option ",priority = 2,dependsOnMethods = "ClickOnTheCourse")
    public void CreateDiscussionRooms(){
        DissRoom=new DiscussionRoom(driver);
        String DiscussionRoomWithHideOptionTitle = "AutomationDisroomWithHideAllOption" +PageBase.randomNumber(4);
        DissRoom.CreateDisRoomWithHideAllTopics(DiscussionRoomWithHideOptionTitle);
    }
//    @Test(priority = 4)
//    public void DiscussionRoomPage(){
//        DissRoom=new DiscussionRoom(driver);
//        DissRoom.SearchInDiscussionRoomModule();
//        Assert.assertTrue(DissRoom.SearchResults.isDisplayed());
//    }
    @Test(description = "Check User can view the Discussion room either when clicking on room title or click on preview Action",priority = 5)
    public void TestViewDiscussionRoom(){
        DissRoom=new DiscussionRoom(driver);
        DissRoom.ViewDiscussionRooms();
        Assert.assertTrue(DissRoom.ShowAllButton.isDisplayed());
    }
    @Test(description = "Check User Can Edit Discussion Room Successfully ",priority = 6)
    public void TestEditDiscussionRoom(){
        DissRoom=new DiscussionRoom(driver);
        DissRoom.EditDiscussionRoom();
        Assert.assertTrue(DissRoom.CreatePost.isDisplayed());
    }
    @Test(description = "Check When Click on posts list Action it redirect successfully",priority = 7)
    public void TestPostsList(){
        DissRoom=new DiscussionRoom(driver);
        DissRoom.PostListAction();
        Assert.assertTrue(DissRoom.ShowAllButton.isDisplayed());
    }
    @Test(description = "Check User Can create Discussion Rooms From Module Page and Delete one and Check if it displayed successfully",priority = 8)
    public void TestModulePage(){
        DissRoom=new DiscussionRoom(driver);
        String  DiscussionRoomWithHideOptionTitle = "Create From Module" +PageBase.randomNumber(4);
        DissRoom.CreateFromModulePage(DiscussionRoomWithHideOptionTitle);
        Assert.assertEquals(DissRoom.FlashMsg.getText(),"Your discussion room has been created");
        //Message In Arabic
        //تم إنشاء غرفة النقاش
//        DissRoom.SearchForCreatedDiscussionRoomInModulePage();
//        Assert.assertEquals(DissRoom.SearchInModulePage.getText(), "xml CreateFromModuleTitle value");
//        DissRoom.SearchForCreatedDiscussionRoomInBrowseContent();
//        Assert.assertTrue(DissRoom.matchedDiscussionRooms.isDisplayed());
    }


}
