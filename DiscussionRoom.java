package Pages;

import DriverBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class DiscussionRoom extends PageBase{

    public DiscussionRoom(WebDriver driver) {
        super(driver);
        scroll = (JavascriptExecutor)driver;
    }
   // @FindBy(xpath = "//*[@id=\"teacherCoursesTitle\"]/li[1]/a")
    @FindBy(xpath = "//a[@href='https://me.classera.com/teacher/courses/browse_content/cid:1317651']")
    WebElement englishCourse;
    //@FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[3]/h2/div/div/a")
    @FindBy(xpath = "//a[@class='dontOpenWidget discussion'][@data-target='#add_discussion_room']")
    WebElement addDiscussionRoomButton;
    @FindBy(id = "PostTitle")
    WebElement Title;
    @FindBy(id = "submit_button")
    WebElement Next;
    @FindBy(id = "UserCheckbox33447245")
    WebElement ChooseStudent;
    @FindBy(id = "back_button")
    WebElement Previous;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/div[1]/input")
    WebElement SearchField;
    @FindBy(xpath = "/html/body/div[6]/div/div[3]/div[5]/div/div[2]/section/section/div/div/div[2]/div/div[1]/input")
    WebElement SearchFieldManager;
    //@FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[3]/h2")
    @FindBy(xpath = "(//i[@class='fa fa-caret-up'])[4]")
    WebElement ArrowDown;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[3]")
    WebElement Arrow2;
    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul[1]/li[9]/a")
    WebElement DiscussionSideMenu;
    @FindBy(id="discussion_autosearch")
    WebElement SearchFieldInModulePage;
    @FindBy(xpath ="//a[@href='/teacher']")
    WebElement Home;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[3]/div/div/div[1]/div/div[3]/h3/a")
    WebElement DisTitle;
    @FindBy(xpath = "//*[@id=\"content_wrapper\"]/div[3]/div[5]/ul/li[1]/a")
    public WebElement ShowAllButton;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[3]/div/div/div[1]/div/div[1]/a")
    WebElement MoreActions;
    @FindBy( xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[3]/div/div/div[1]/div/div[1]/ul/li[2]/a")
    WebElement Preview;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[3]/div/div/div[1]/div/div[1]/ul/li[1]/a")
    WebElement Edit;
    @FindBy(xpath = "//a[@href='/teacher/posts/edit/25703330']")
    WebElement EditTry;
    @FindBy(xpath = "//a[@href='/teacher/posts/view']")
    WebElement AllDiscussion;
    @FindBy(xpath ="//body/div[6]/div[1]/div[3]/div[5]/div[1]/div[1]/form[1]/a[1]")
    public WebElement CreatePost;
    @FindBy(linkText = "Posts List")
    WebElement PostsList;
    @FindBy(id="flashMessage")
    public WebElement FlashMsg;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/div[1]/input")
    WebElement SearchFieldInBrowseContent;
    @FindBy(xpath = "/html/body/div[6]/div/div[3]/div[5]/div[1]/div[1]/div/div/div/a/h3\n")
    public  WebElement SearchResults;
    @FindBy(xpath = "//i[contains(text(),'1')]")
    public WebElement matchedDiscussionRooms;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/div[1]/div/span[3]")
    WebElement matchedDiscussionRoom;
    @FindBy(id = "PostHideComments")
    WebElement HideAllNewTopics;
    @FindBy(xpath = "//*[@id=\"content_wrapper\"]/div[3]/div[3]/label")
    WebElement AddPost;
    @FindBy(xpath = "/html/body")
    WebElement InsideFrame;
    @FindBy(xpath = "//*[@id=\"PostReplyForm\"]/button")
    WebElement AddPostButton;
    @FindBy(xpath = "//*[@id=\"finishExamPopUp\"]/div/div/div[1]/button")
    WebElement CloseCongratulationFrame;
    @FindBy(xpath = "//h3[contains(text(),'CreateFromModule')]")
    public WebElement SearchInModulePage;
    //*[@id="competitionModal"]/div/div/div[2]/button

    public void Course(){
        englishCourse.click();
    }
    public void CreateDiscussionRoom(String DiscussionRoomTitle){
        ScrollDown();
        addDiscussionRoomButton.click();
        Title.sendKeys(DiscussionRoomTitle);
        Next.click();
        ChooseStudent.click();
        Previous.click();
        Next.click();
        Next.click();
        ScrollUp();
        SearchField.sendKeys(DiscussionRoomTitle);
    }
    public void CreateDisRoomWithHideAllTopics(String DiscussionRoomWithHideOptionTitle){
        Home.click();
        englishCourse.click();
        ScrollDown();
        addDiscussionRoomButton.click();
        Title.sendKeys(DiscussionRoomWithHideOptionTitle);
        HideAllNewTopics.click();
        Next.click();
        ChooseStudent.click();
        Next.click();
        ScrollDown(); 
        ScrollDown();
        ArrowDown.click();
        MoreActions.click();
        Preview.click();
        AddPost.click();
        driver.switchTo().frame(0);
        InsideFrame.sendKeys("Post hide test");
        driver.switchTo().defaultContent();
        AddPostButton.click();
        CloseCongratulationFrame.click();
        driver.navigate().back();
//        ScrollUp();




    }
//    public void SearchInDiscussionRoomModule(){
////        ScrollDown();
//        DiscussionSideMenu.click();
//        SearchFieldInModulePage.sendKeys("xml DiscussionRoomTitle value");
//    }
    public void ViewDiscussionRooms(){
        Home.click();
        englishCourse.click();
        ScrollDown();
        ScrollDown();
        waitForElement(ArrowDown,20);
        ArrowDown.click();
        DisTitle.click();
        driver.navigate().back();
        ArrowDown.click();
        MoreActions.click();
        Preview.click();
        waitForElement(ShowAllButton,30);
    }
    public void EditDiscussionRoom(){
        Home.click();
        englishCourse.click();
        //SearchField.sendKeys("xml DiscussionRoomWithHideOptionTitle value");
        SearchField.sendKeys("AutomationDisroomWithHideAllOption");
        matchedDiscussionRoom.click();
        waitForElement(Arrow2,40);
        Arrow2.click();
        MoreActions.click();
        Edit.click();
        Title.sendKeys("Edit");
        ScrollDown();
        Next.click();
        driver.navigate().back();
        ScrollUp();
        AllDiscussion.click();
        waitForElement(CreatePost,30);
    }
    public void PostListAction(){
        driver.navigate().back();
        driver.navigate().back();
        ArrowDown.click();
        MoreActions.click();
        PostsList.click();
        waitForElement(ShowAllButton,30);
    }
    public void CreateFromModulePage(String CreateFromModuleTitle){
        ScrollDown();
        DiscussionSideMenu.click();
        CreatePost.click();
        Title.sendKeys(CreateFromModuleTitle);
        Next.click();
        ChooseStudent.click();
        Next.click();
    }
//    public void SearchForCreatedDiscussionRoomInModulePage() {
//        SearchFieldInModulePage.sendKeys("xml CreateFromModuleTitle value ");
//    }
//    public void SearchForCreatedDiscussionRoomInBrowseContent(){
//        Home.click();
//        englishCourse.click();
//        SearchFieldInBrowseContent.sendKeys("xml CreateFromModuleTitle value");
//    }





}
