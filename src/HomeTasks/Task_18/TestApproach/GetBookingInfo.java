package HomeTasks.Task_18.TestApproach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

/**
 * Created by kotok_artem on 12.11.2018.
 */
public class GetBookingInfo {
    static WebDriver driver;

    public static WebDriver createDriver(String pathToExe) {
        System.setProperty("webdriver.chrome.driver", pathToExe);
        driver = new ChromeDriver();
        return driver;
    }

    public static void findAndClick(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void findAndClickSeveral(String... xpath) {
        for (String path : xpath) {
            driver.findElement(By.xpath(path)).click();
        }
    }

    public static boolean isHotels() {
        driver.get("http://booking.com");
        WebElement enterCity = driver.findElement(By.xpath(".//input[@id='ss']"));
        enterCity.sendKeys("Москва");
        findAndClick(".//div[@class='xp__dates-inner xp__dates__checkin']");
        findAndClick(".//td[@data-date='2018-12-14']");
        findAndClick(".//td[@data-date='2018-12-15']");
        findAndClick(".//span[text()='Проверить цены']");
        ArrayList<WebElement> hotelList = new ArrayList<>(driver.findElements(By.xpath(".//span[@class[contains(.,'sr-hotel__name')]]")));
        return (hotelList.size() > 0);
    }

    public static double getRating(){
        driver.get("http://booking.com");
        WebElement enterCity = driver.findElement(By.xpath(".//input[@id='ss']"));
        enterCity.sendKeys("Москва");
        findAndClickSeveral(".//div[@class='xp__dates-inner xp__dates__checkin']", ".//td[@data-date='2018-12-14']", ".//td[@data-date='2018-12-15']",
                ".//span[text()='Проверить цены']", ".//a[@data-category=\"review_score_and_price\"]");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findAndClick("(.//a[@class='hotel_name_link url'])[1]");
        ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handles.get(handles.size() - 1));
        WebElement rating = driver.findElement(By.xpath("(.//div[@aria-label=\"10\"])[1]"));
        return Double.parseDouble(rating.getText().trim());

    }
}

