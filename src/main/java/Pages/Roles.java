package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Roles extends PageBase {
    public Roles(WebDriver driver) {
        super(driver);
        scroll = (JavascriptExecutor)driver;
    }
    DiscussionRoom DisObj=new DiscussionRoom(driver);
    UserLogin LoginTest=new UserLogin(driver);
    @FindBy(xpath = "/html/body/div[5]/div/div/div[3]/div/ul/li[6]/a/div/img")
    WebElement ClickOnImg;
    @FindBy(xpath = "/html/body/div[5]/div/div/div[3]/div/ul/li[5]/a/div/img")
    WebElement LogoutFromStudent;
    @FindBy(xpath = "//a[@href='/users/logout']")
    WebElement Logout;
    @FindBy(xpath = "//a[@href='/student']")
    WebElement HomeStudent;
    @FindBy(xpath = "//*[@id=\"box8\"]/div/div[1]")
    WebElement HoverOnDiscussionRoomsStudents;
    @FindBy(xpath = "//a[@href='/student/posts/view']")
    WebElement ShowAll;
    @FindBy(xpath = "//*[@id=\"content_wrapper\"]/div/div/div/a/div[1]/h3")
    public WebElement SearchResultsFromStudent;
    @FindBy(xpath ="//a[@href='/parent/courses/get_menu/sid:LJIpJEgu6Bq6z1p2vREfIwC1E9']" )
    WebElement ViewProfileStudent;
    @FindBy(xpath = "//body/div[6]/div[1]/div[3]/div[5]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]")
    WebElement HoverOnDiscussionRoomGuardian;
    @FindBy(xpath = "//a[@href='/parent/posts/view']")
    WebElement ShowAllGuardian;
    @FindBy(xpath = "//a[@href='/manager']")
    WebElement HomeManager;
    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul[1]/li[3]/a")
    WebElement TeacherPageManager;
    @FindBy(id = "_m_teacher_full_name_grid")
    WebElement SearchForTeacher;
    @FindBy(xpath = "//*[@id=\"grid_grid\"]/tbody/tr/td[3]/div/div/button/span")
    WebElement MoreActionManager;
    @FindBy(xpath = "//*[@id=\"grid_grid\"]/tbody/tr/td[3]/div/div/ul/li[3]/a")
    WebElement CoursesManager;
    @FindBy(id="_m_course_title_grid")
    WebElement CourseName;
    @FindBy(xpath = "//*[@id=\"grid_grid\"]/tbody/tr/td[3]/div/a[1]")
    WebElement BrowseContentManager;
    @FindBy(id="discussion_autosearch")
    WebElement SearchFieldInModulePage;
    @FindBy(xpath = "//*[@id=\"childModalBody\"]/button")
    WebElement CloseCallPopUp;
    @FindBy(xpath = "//h3[contains(text(),'AutomationDisroomWithHideAllOptionEdit')]")
    WebElement OpenHideAllNewTopicDiscussionRoom;
    @FindBy(xpath = "//*[@id=\"posts-count\"]")
    public WebElement TotalPostCheck;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/div[1]/div/span[3]")
    WebElement ClickOnDisRoomManager;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[3]/h2")
    WebElement ArrowDown;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[3]/div/div/div[2]/div/div[2]/h3/a")
    WebElement HideAllNewTopicsDiscussionRoomManager;
    @FindBy(xpath = "//a[@href='/schadmin/students']")
    WebElement ClickOnUsersAdmin;
    @FindBy(xpath = "//a[@href='/schadmin/teachers']")
    WebElement ClickOnTeacherAdmin;
    @FindBy(xpath = "//*[@id=\"_m_UserTeacherView__teacher_full_name_grid\"]")
    WebElement SearchForTeacherAdmin;
    @FindBy(xpath = "//*[@id=\"grid_grid\"]/tbody/tr/td[7]/div/div/button")
    WebElement MoreActionsAdmin;
    @FindBy(xpath = "//a[@href='/schadmin/courses/list_teacher_courses/tid:Mqp4rDbJf0SSIedAYYlmUAC1E9']")
    WebElement CoursesAdmin;
    @FindBy(xpath = "//*[@id=\"grid_grid\"]/tbody/tr/td[3]/div/a[1]")
    WebElement BrowseContentAdmin;
    @FindBy(xpath = "//*[@id=\"content_wrapper\"]/div/div[1]/div/div/div[1]")
    WebElement HoverOnCourseTeacherSupervisor;
    @FindBy(xpath = "//a[@href='/teacher/courses/browse_content/cid:ofCBDzm_AT2SlIdft15XDgC1E9']")
    WebElement ManageContentTeacherSupervisor;
    @FindBy(xpath = "//i[contains(text(),'0')]")
    public WebElement DiscussionForOtherTeacher;
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div[3]/div[1]/button")
    WebElement ClickOnRoleSwitcher;
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div[3]/div[1]/ul/li[2]/a")
    WebElement SwitchToTeacherSupervisor;
    @FindBy(xpath = "//*[@id=\"_m_teacher_full_name_grid\"]")
    WebElement SearchNameTeacherSupervisor;
    @FindBy(xpath = "//*[@id=\"grid_grid\"]/tbody/tr/td[5]/div/div/button")
    WebElement MoreActionsTeacherSupervisor;
    @FindBy(xpath = "//a[@href='/tsupv/posts/teacher_discussions/tid:Mqp4rDbJf0SSIedAYYlmUAC1E9']")
    WebElement DiscussionTeacherSupervisor;
    @FindBy(xpath = "//*[@id=\"content_wrapper\"]/div[1]/div/div[1]/div/div/a[2]")
    WebElement DeleteModulePageButton;
    @FindBy(xpath = "//i[contains(text(),'0')]")
   public WebElement ClickOnDiscussionRoomDeleteResults;


    public void RoleStudent(){
        ClickOnImg.click();
        Logout.click();
        LoginTest.UserName.clear();
        LoginTest.UserName.sendKeys("Student6");
        LoginTest.Password.clear();LoginTest.Password.sendKeys("12sudo4");
        LoginTest.LoginBtn.click();
//        waitForElement(CloseCallPopUp,20);
//        driver.switchTo().activeElement();
//        CloseCallPopUp.click();
        LoginTest.newPopupCloseBtn.click();
        HomeStudent.click();
//        driver.switchTo().activeElement();
//        CloseCallPopUp.click();
//        ScrollDown();
        HoverOnDiscussionRoomsStudents.click();
        ShowAll.click();
        SearchFieldInModulePage.sendKeys("xml CreateFromModuleTitle value");
        Assert.assertEquals(SearchResultsFromStudent.getText(),"xml CreateFromModuleTitle value");
        SearchFieldInModulePage.clear();
        SearchFieldInModulePage.sendKeys("Xml DiscussionRoomWithHideOptionTitle Value ");
        OpenHideAllNewTopicDiscussionRoom.click();
    }
    public void RoleGuardian(){
        LogoutFromStudent.click();
        Logout.click();
        LoginTest.UserName.clear();
        LoginTest.UserName.sendKeys("guradian6");
        LoginTest.Password.clear();LoginTest.Password.sendKeys("12sudo4");
        LoginTest.LoginBtn.click();
        LoginTest.newPopupCloseBtn.click();
        ViewProfileStudent.click();
        ScrollDown();
        ScrollDown();
        HoverOnDiscussionRoomGuardian.click();
        ShowAllGuardian.click();
        SearchFieldInModulePage.sendKeys("xml CreateFromModuleTitle value");
        Assert.assertEquals(SearchResultsFromStudent.getText(),"xml CreateFromModuleTitle value");
        SearchFieldInModulePage.clear();
        SearchFieldInModulePage.sendKeys("Xml DiscussionRoomWithHideOptionTitle Value ");
        OpenHideAllNewTopicDiscussionRoom.click();
    }
    public void RoleManager() throws InterruptedException {
        ClickOnImg.click();
        Logout.click();
        LoginTest.UserName.clear();
        LoginTest.UserName.sendKeys("demom224");
        LoginTest.Password.clear();LoginTest.Password.sendKeys("12sudo4");
        LoginTest.LoginBtn.click();
        //LoginTest.newPopupCloseBtn.click();
        HomeManager.click();
        TeacherPageManager.click();
        waitForElement(SearchForTeacher,20);
        SearchForTeacher.sendKeys("Teacher2 Test");
        Thread.sleep(2000);
        ScrollDown();
        MoreActionManager.click();
        ScrollDown();
        waitForElement(CoursesManager,10);
        CoursesManager.click();
        waitForElement(CourseName,10);
        CourseName.sendKeys("English Course");
        Thread.sleep(2000);
        waitForElement(BrowseContentManager,20);
        BrowseContentManager.click();
        DisObj.SearchFieldManager.sendKeys("xml CreateFromModuleTitle value");
        Assert.assertTrue(DisObj.matchedDiscussionRooms.isDisplayed());
        DisObj.SearchFieldManager.clear();
        DisObj.SearchFieldManager.sendKeys("Xml DiscussionRoomWithHideOptionTitle Value");
        ClickOnDisRoomManager.click();
        waitForElement(ArrowDown,20);
        ArrowDown.click();
        HideAllNewTopicsDiscussionRoomManager.click();
    }
    public void RoleAdmin() throws InterruptedException {
        ClickOnImg.click();
        Logout.click();
        LoginTest.UserName.clear();
        LoginTest.UserName.sendKeys("demoad223");
        LoginTest.Password.clear();LoginTest.Password.sendKeys("12sudo4");
        LoginTest.LoginBtn.click();
        ClickOnUsersAdmin.click();
        ClickOnTeacherAdmin.click();
        SearchForTeacherAdmin.sendKeys("Teacher2 Test");
        Thread.sleep(3000);
        MoreActionsAdmin.click();
        CoursesAdmin.click();
        CourseName.sendKeys("English Course");
        Thread.sleep(4000);
        BrowseContentAdmin.click();
        DisObj.SearchField.sendKeys("xml CreateFromModuleTitle value");

//        Assert.assertTrue(DisObj.ClickOnDiscussionRooms.isDisplayed());
//        DisObj.SearchField.clear();
//        DisObj.SearchField.sendKeys("AutomationDisroomWithHideAllOption");
//        ClickOnDisRoomManager.click();
//        ArrowDown.click();
//        HideAllNewTopicsDiscussionRoomManager.click();
//        Assert.assertTrue(TotalPostCheck.isDisplayed());
    }
    public void OtherTeacherRoleTest(){
        ClickOnImg.click();
        Logout.click();
        LoginTest.UserName.clear();
        LoginTest.UserName.sendKeys("demote223 ");
        LoginTest.Password.clear();
        LoginTest.Password.sendKeys("12sudo4");
        LoginTest.LoginBtn.click();
        HoverOnCourseTeacherSupervisor.click();
        waitForElement(ManageContentTeacherSupervisor, 20);
        ManageContentTeacherSupervisor.click();
        DisObj.SearchField.sendKeys("Xml DiscussionRoomTitle value");
    }
    public void SupervisorRole() throws InterruptedException {
        ClickOnRoleSwitcher.click();
        SwitchToTeacherSupervisor.click();
        SearchNameTeacherSupervisor.sendKeys("Teacher2 Test");
        Thread.sleep(3000);
        ScrollDown();
        MoreActionsTeacherSupervisor.click();
        DiscussionTeacherSupervisor.click();
        SearchFieldInModulePage.sendKeys("xml CreateFromModuleTitle value");
        Assert.assertEquals(SearchResultsFromStudent.getText(),"xml CreateFromModuleTitle value");
        SearchFieldInModulePage.clear();
        SearchFieldInModulePage.sendKeys("DiscussionRoomWithHideOptionTitle Value");
        OpenHideAllNewTopicDiscussionRoom.click();
    }
    public void RoleTeacherFotDelete(){
        ClickOnImg.click();
        Logout.click();
        LoginTest.UserName.clear();
        LoginTest.UserName.sendKeys("demote224 ");
        LoginTest.Password.clear();LoginTest.Password.sendKeys("12sudo4");
        LoginTest.LoginBtn.click();
        ScrollDown();
        DisObj.DiscussionSideMenu.click();
        SearchFieldInModulePage.sendKeys("xml createFromModule Value");
        DeleteModulePageButton.click();
        driver.switchTo().alert().accept();
        DisObj.Home.click();
        DisObj.englishCourse.click();
        DisObj.SearchField.sendKeys("xml createFromModule Value");
    }


}
