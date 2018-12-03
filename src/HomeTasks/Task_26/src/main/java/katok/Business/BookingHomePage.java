package katok.Business;

import katok.Core.GetDataFromSQL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookingHomePage {
    public BookingHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//input[@id='ss']") //1
    private WebElement searchLine;

    @FindBy(xpath = ".//div[@class='xp__dates-inner xp__dates__checkin']") //2
    private WebElement datesDialogue;

    @FindBy(xpath = ".//span[text()='Проверить цены']") //3
    private WebElement submitButton;

    @FindBy(xpath = ".//td[@data-date='2018-12-14']") //4
            WebElement checkInDate;

    @FindBy(xpath = ".//td[@data-date='2018-12-15']") //5
            WebElement checkOutDate;

    public BookingHomePage() throws SQLException {
    }

    public void enterCity(String city) {
        searchLine.clear();
        searchLine.sendKeys(city);
    }

    public void setDates() {
        datesDialogue.click();
        checkInDate.click();
        checkOutDate.click();
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public void doBasicSetUp(String city) {
        enterCity(city);
        setDates();
        clickSubmit();
    }
}
