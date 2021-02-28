package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AdditionalLibrariesPage  extends PageBase {
    public AdditionalLibrariesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[7]/h2/div/div/a[11]/i")
    WebElement addLibraryButtonBC;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bshows/cid:1317651/prep:0']")
    WebElement addPresentationIconBC;
    @FindBy(id="AttachmentTitle")
    WebElement presentationTitle;
    @FindBy(id = "UploadedFileFile")
    WebElement UploadPresentationFile;
    @FindBy(id = "publish_date")
    WebElement publishDate;
    @FindBy(id = "LectureCheckbox2830088")
    WebElement shareToOneSection;
    @FindBy(id = "publish_to_students")
    WebElement shareToStudentsTab;
    @FindBy(id = "UserSelectedStudents4467608")
    WebElement shareToOneStudent;
    @FindBy(id = "submission_button")
    WebElement UploadButtonBC;
    @FindBy(id = "flashMessage")
    WebElement uploadPresentationSuccessMessage;
    @FindBy(xpath = "//*[@id=\"AttachmentUploadForm\"]/fieldset/div[7]/div/div")
    WebElement PreparationDropBox;
    @FindBy(xpath = "//*[@id=\"AttachmentUploadForm\"]/fieldset/div[7]/div/ul/li[2]")
    WebElement selectPreparation;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/BVideo/cid:1317651/prep:0']")
    WebElement addVideoLibraryIconBC;
    @FindBy(xpath = "//*[@id=\"AttachmentUploadForm\"]/fieldset/ul/li[1]")
    WebElement youtubeButton;
    @FindBy(id="YoutubeUrl")
    WebElement YoutubeLink;
    @FindBy(xpath = "//*[@id=\"AttachmentUploadForm\"]/fieldset/ul/li[2]")
    WebElement vimeoButton;
    @FindBy(id = "VimeoUrl")
    WebElement vimeoLink;
    @FindBy(xpath = "//*[@id=\"AttachmentUploadForm\"]/fieldset/ul/li[3]")
    WebElement UploadVideoButton;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bdocument/cid:1317651/prep:0']")
    WebElement addDocumentLibraryIcon;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Scorm/cid:1317651/prep:0']")
    WebElement addInteractiveLessonIcon;
    @FindBy(id = "AttachmentInteractiveLessonType1")
    WebElement scormFile;
    @FindBy(id = "AttachmentInteractiveLessonType2")
    WebElement HTML5File;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bflash/cid:1317651/prep:0']")
    WebElement addFlashLibraryIcon;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bmp3/cid:1317651/prep:0\"']")
    WebElement addAudioLibraryIcon;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bpgm/cid:1317651/prep:0']")
    WebElement addSoftwareLibraryIcon;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bgame/cid:1317651/prep:0']")
    WebElement addGameLibraryIcon;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bweb/cid:1317651/prep:0']")
    WebElement addWebsiteLibraryIcon;
    @FindBy(id = "AttachmentComments")
    WebElement websiteLink;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bphoto/cid:1317651/prep:0']")
    WebElement addPhotoLibraryIcon;
    @FindBy(xpath = "//a[@href='/teacher/attachments/view/24175386']")
    WebElement libraryTitle;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[7]/div/div/div[1]/div/div[2]/a")
    WebElement moreActionBC;
    @FindBy(xpath = "//a[@href='/teacher/attachments/statistics/cid:1317651/aid:24175386']")
    WebElement statisticsAction;
    @FindBy(xpath = "//a[@href='/teacher/htmx/manage_htmx/Attachment/aid:24175386']")
    WebElement QuestionAction;
    @FindBy(xpath = "//a[@href='/teacher/attachments/edit/Bshows/cid:1317651/aid:24175386/prep:0']")
    WebElement editLibraryButtonBC;
    @FindBy(xpath = "//a[@href='https://me.classera.com/teacher/attachments/view/24175386/']")
    WebElement ViewLibraryButtonBC;
    @FindBy(xpath = "//*[@id=\"view_attachment\"]/div/div/div[3]/a[4]")
    WebElement deleteLibraryButtonBC;
    @FindBy(xpath = "//*[@id=\"browseContent\"]/div/div/div[2]/div/section[7]/h2")
    WebElement AdditionalLibrarySectionBC;
    @FindBy(xpath = "//*[@id=\"teacherCoursesTitle\"]/li[1]/a")
    WebElement englishCourse;
    @FindBy(xpath ="//a[@href='/teacher']")
    WebElement Home;
    @FindBy(xpath = "//*[@id=\"paged_block-1\"]/div[3]/a[2]")
    WebElement nextButtonOnCourseCard;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bshows/cid:ofCBDzm_AT2SlIdft15XDgC1E9']")
    WebElement createPresentationLibraryButtonOnCourseCard;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bdocument/cid:ofCBDzm_AT2SlIdft15XDgC1E9']")
    WebElement createDocumentLibraryButtonOnCourseCard;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Scorm/cid:ofCBDzm_AT2SlIdft15XDgC1E9']")
    WebElement createInterActiveLessonLibraryButtonOnCourseCard;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bpgm/cid:ofCBDzm_AT2SlIdft15XDgC1E9']")
    WebElement createSoftwareLibraryButtonOnCourseCard;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/BVideo/cid:ofCBDzm_AT2SlIdft15XDgC1E9']")
    WebElement createVideoLibraryButtonOnCourseCard;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bmp3/cid:ofCBDzm_AT2SlIdft15XDgC1E9']")
    WebElement createAudioLibraryButtonOnCourseCard;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bflash/cid:ofCBDzm_AT2SlIdft15XDgC1E9']")
    WebElement createFlashLibraryButtonOnCourseCard;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bgame/cid:ofCBDzm_AT2SlIdft15XDgC1E9']")
    WebElement createGameLibraryButtonOnCourseCard;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bweb/cid:ofCBDzm_AT2SlIdft15XDgC1E9']")
    WebElement createWebSiteLibraryButtonOnCourseCard;
    @FindBy(xpath = "//a[@href='/teacher/attachments/upload/Bphoto/cid:ofCBDzm_AT2SlIdft15XDgC1E9']")
    WebElement createPhotoLibraryButtonOnCourseCard;
    @FindBy(xpath = "//*[@id=\"grid_grid\"]/tbody/tr/td[4]/a[1]")
    WebElement viewButtonOnModulePage;
    @FindBy(xpath = "//*[@id=\"grid_grid\"]/tbody/tr/td[4]/a[4]")
    WebElement editButtonOnModulePage;
    @FindBy(xpath = "//*[@id=\"grid_grid\"]/tbody/tr/td[4]/a[5]")
    WebElement deleteButtonOnModulePage;




































}
