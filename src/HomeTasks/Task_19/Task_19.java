package HomeTasks.Task_19;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


/**
 * Created by Kotok_Artem on 13.11.2018.
 */
public class Task_19 {

    public static WebDriver driver;
    String cityToTravel = "Paris";
    int dayToDeparture = 3;
    int daysToStay = 7;
    int filterPricePerNight;
    int numberOfRooms = 2;
    int numberOfAdults = 4;



    public WebDriver createDriver() {
        driver = new ChromeDriver();
        return driver;
    }

    public void findAndClick(String xpath) {

        driver.findElement(By.xpath(xpath)).click();
    }

    public String setDate(int dayToAdd) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        calendar.add(Calendar.DAY_OF_MONTH, dayToAdd);
        return sdf.format(calendar.getTime());
    }

    public int getPriceFromElement(String xpath) {
        return Integer.parseInt(driver.findElement(By.xpath(xpath)).getText().replaceAll("\\D", ""));
    }

    public int getPriceFromElement(WebElement element) {
        return Integer.parseInt(element.getText().replaceAll("\\D", ""));
    }

    public void waitForPopupVanish() {
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(By.xpath("//*[@id=\"utag_59_iframe\"]"))));
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(By.xpath(".//div[@class='sr-usp-overlay sr-usp-overlay--wide']"))));
    }

    public void setBasicConditions() {
        driver.get("https://www.booking.com");
        driver.manage().window().maximize();
        WebElement enterCity = driver.findElement(By.xpath(".//input[@id='ss']"));
        enterCity.sendKeys(cityToTravel);
        findAndClick(".//div[@class='xp__dates-inner xp__dates__checkin']");
        findAndClick(".//td[@data-date='" + setDate(dayToDeparture) + "']");
        findAndClick(".//td[@data-date='" + setDate(dayToDeparture + daysToStay) + "']");
    }

    public boolean isHotels() {
        findAndClick(".//span[text()='Проверить цены']");
        findAndClick("//*[@id=\"filter_price\"]/div[2]/a[1]/div/span[1]");
        filterPricePerNight = getPriceFromElement("//*[@id=\"filter_price\"]/div[2]/a[1]/div/span[1]");
        ArrayList<WebElement> separatorList = new ArrayList<>(driver.findElements(By.xpath(".//div[@class=\"sr_item sr_separator u-font-weight-bold sr_separator_first sr_autoextend_divider sr_autoextend_divider__container\"]")));
        if (separatorList.size() < 1) {
            return true;
        }
        WebElement firstHotel = driver.findElement(By.xpath("(.//a[@class='hotel_name_link url'])[1]"));
        return firstHotel.getLocation().getY() < separatorList.get(0).getLocation().getY();
    }

    public boolean isPriceMatchRating() {
        findAndClick(".//a[@data-category=\"review_score_and_price\"]");
        waitForPopupVanish();
        findAndClick("(.//a[@class='hotel_name_link url'])[1]");
        ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handles.get(handles.size() - 1));
        return (getPriceFromElement("(.//span[@class=\"hprt-price-price-standard jq_tooltip \"])[1]") / daysToStay) <= filterPricePerNight;
    }

    public boolean isHighPrice() {
        findAndClick(".//span[@class=\"xp__guests__count\"]");

        ArrayList<WebElement> selectors = new ArrayList<>(driver.findElements(By.xpath(".//select[@id='no_rooms']")));
        if (selectors.size() > 0) {
            Select roomsNumber = new Select(selectors.get(0));
            roomsNumber.selectByIndex(numberOfRooms - 1);
        } else {
            while (Integer.parseInt(driver.findElement(
                    By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/span")).getText())<numberOfRooms){
                driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/button[2]")).click();
            }
        }

        selectors = new ArrayList<>(driver.findElements(By.xpath("//select[@id=\"group_adults\"]")));
        if (selectors.size() > 0) {
            Select roomsNumber = new Select(selectors.get(0));
            roomsNumber.selectByIndex(numberOfAdults - 1);
        }else {
            while (Integer.parseInt(driver.findElement(
                    By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[2]/div/div[2]/span")).getText())<numberOfAdults){
                driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[2]/div/div[2]/button[2]")).click();
            }
        }
        findAndClick(".//span[text()='Проверить цены']");
        ArrayList<WebElement> priceOptions = new ArrayList<>(driver.findElements(By.xpath("//*[@id='filter_price']/div[2]/a/div/span[contains(text(),'BYN')]")));
        filterPricePerNight = getPriceFromElement(priceOptions.get(priceOptions.size() - 1));
        priceOptions.get(priceOptions.size() - 1).click();
        waitForPopupVanish();
        findAndClick(".//a[@data-category=\"price\"]");
        waitForPopupVanish();
        findAndClick("(.//a[@class='hotel_name_link url'])[1]");
        ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handles.get(handles.size() - 1));
        return ((getPriceFromElement("(.//span[@class=\"hprt-price-price-standard jq_tooltip \"])[1]") / daysToStay)) * numberOfRooms >= filterPricePerNight;

    }

    public String bookHotel() {
        Select roomNumbers = new Select(driver.findElement(By.xpath("(.//select[@class=\"hprt-nos-select\"])[1]")));
        roomNumbers.selectByIndex((numberOfRooms - 1));
        new WebDriverWait(driver, 10).until(ExpectedConditions
                .visibilityOf(driver.findElement(By.xpath(".//div[@data-component=\"hotel/new-rooms-table/reservation-cta\"]"))));
        findAndClick(".//div[@data-component=\"hotel/new-rooms-table/reservation-cta\"]");
        Select bookerTitle = new Select(driver.findElement(By.xpath("//*[@id=\"booker_title\"]")));
        bookerTitle.selectByIndex(1);
        WebElement names = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
        names.sendKeys("TestName"+ Keys.TAB+"TestSurname"+Keys.TAB+"Test@email.com"+Keys.TAB+"Test@email.com");
        WebElement notes = driver.findElement(By.xpath("//*[@id=\"remarks\"]"));
        notes.sendKeys("TestNote");
        findAndClick("//*[@id=\"bookForm\"]/div[3]/div/div[2]");

        ArrayList<WebElement> addressData = new ArrayList<>(driver.findElements(By.xpath("//*[@id=\"address1\"]")));
        if(addressData.size()!=0) {

            addressData.get(0).sendKeys("TestAddress" + Keys.TAB + "TestCity" + Keys.TAB + Keys.TAB + "123456");
        }
        WebElement phone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        phone.sendKeys("291234567");

        Select creditCardType = new Select(driver.findElement(By.xpath("//*[@id=\"cc_type\"]")));
        creditCardType.selectByIndex(2);
        WebElement cardNumber = driver.findElement(By.xpath("//*[@id=\"cc_number\"]"));
        cardNumber.sendKeys("2424242424242424");
        Select cardValid = new Select(driver.findElement(By.xpath("//*[@id=\"cc_month\"]")));
        cardValid.selectByIndex(10);
        WebElement cvc = driver.findElement(By.xpath("//*[@id=\"cc_cvc\"]"));
        cvc.sendKeys("123");
        WebElement cardMessage = driver.findElement(By.xpath("//*[@id=\"bp_form_cc_number_msg\"]"));
        return cardMessage.getText().trim();
    }


}
