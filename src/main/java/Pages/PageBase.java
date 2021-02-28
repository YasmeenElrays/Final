package Pages;

import DriverBase.Base;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class PageBase extends Base {
    protected WebDriver driverAll;
    public JavascriptExecutor scroll;

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    //    public static void scrollTo(WebElement element) {
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
//    }}
    public void ScrollDown() {
        scroll.executeScript("window.scrollBy(0,350)");
    }

    public void ScrollUp() {
        scroll.executeScript("window.scrollBy(0,-350)");
    }

    public static void waitForElement(WebElement element, int Time) {
        WebDriverWait wait = new WebDriverWait(driver, Time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static BigInteger randomNumber(long NoOfIntegers) {
        long count = Math.abs(NoOfIntegers);
        if (count > 999999999)
            Assert.fail("You provided a huge number to be generated");
        Random random = new Random();
        String number = null;
        for (int i = 0; i < count; i++) {
            number += random.nextInt(10);
        }
        return new BigInteger(number.replaceAll("[\\D+]", ""));
    }

    public void selectDateFromDatePicker(WebDriver driver, WebElement dateFieldSelector) throws InterruptedException {
        DateFormat df = new SimpleDateFormat("dd");
        DateFormat df2 = new SimpleDateFormat("d");
        Date date = new Date();
        String formattedDate = df.format(date);
        dateFieldSelector.click();
        int numOfDays = driver.findElements(By.xpath("//td[contains(@class, \"day\")]")).size();
        for (int i = 1; i < numOfDays; i++) {
            String dayValue = driver.findElements(By.xpath("//td[contains(@class, \"day\")]")).get(i).getText();
            try{
                i = Integer.parseInt(dayValue);
                if (Integer.parseInt(dayValue) < 10) {
                    formattedDate = df2.format(date);
                }
            } catch(NumberFormatException ex){ // handle your exception

            }

            if (dayValue.equals(formattedDate) && driver.findElements(By.xpath("//td[contains(@class, \"day\")]")).get(i).getAttribute("class").contains("active")) {
                driver.findElements(By.xpath("//td[contains(@class, \"day\")]")).get(i + 1).click();
                clickElementByText("hour active", driver, "span");
                clickElementByText("minute active", driver, "span");
                return;


            }

        }
    }

    public void clickElementByText(String expectedText, WebDriver driver, String tagName) {
        List<WebElement> anchors = driver.findElements(By.tagName(tagName));
        for (WebElement anchor : anchors) {
            if (anchor.getAttribute("class").contains(expectedText)) {
                safeJavaScriptClick(anchor);
                break;
            }

        }
    }
    public void safeJavaScriptClick(WebElement element) {
        try {
            if (element.isEnabled() && element.isDisplayed()) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            }
        }catch (Exception e) {
            System.out.println("Unable to click on element " + Arrays.toString(e.getStackTrace()));
        }
    }
}