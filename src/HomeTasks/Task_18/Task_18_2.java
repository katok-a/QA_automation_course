package HomeTasks.Task_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task_18_2 {
    static WebDriver driver;

    public static WebDriver createDriver() {
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

    public static void main(String[] args) throws InterruptedException {
        Double minRating = 9.0;
        WebDriver driver = createDriver();
        driver.manage().window().maximize();
        driver.get("http://booking.com");
        WebElement enterCity = driver.findElement(By.xpath(".//input[@id='ss']"));
        enterCity.sendKeys("Москва");
        findAndClickSeveral(".//div[@class='xp__dates-inner xp__dates__checkin']", ".//td[@data-date='2018-12-14']", ".//td[@data-date='2018-12-15']",
                ".//span[text()='Проверить цены']", ".//a[@data-category=\"review_score_and_price\"]");

        Thread.sleep(3000);
        WebElement topHotel = driver.findElement(By.xpath("(.//a[@class='hotel_name_link url'])[1]"));
        topHotel.click();
        ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handles.get(handles.size() - 1));
        WebElement rating = driver.findElement(By.xpath("(.//div[@class='bui-review-score__badge'])[1]"));

        System.out.println(Double.parseDouble(rating.getText().trim()) >= minRating ? "Rating 9+" : "Not gona come");
        //driver.quit();
    }
}
