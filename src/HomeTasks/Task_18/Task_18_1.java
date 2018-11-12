package HomeTasks.Task_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class Task_18_1 {
    public static void main(String[] args) {


        String exePath = "C:\\Java\\Chrome_Server\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://booking.com");
        WebElement enterCity = driver.findElement(By.xpath(".//input[@id='ss']"));
        enterCity.sendKeys("Москва");
        WebElement calendar = driver.findElement(By.xpath(".//div[@class='xp__dates-inner xp__dates__checkin']"));
        calendar.click();
        WebElement checkInDate = driver.findElement(By.xpath(".//td[@data-date='2018-12-14']"));
        checkInDate.click();
        WebElement checkOutDate = driver.findElement(By.xpath(".//td[@data-date='2018-12-15']"));
        checkOutDate.click();
        WebElement submit = driver.findElement(By.xpath(".//span[text()='Проверить цены']"));
        submit.click();
        ArrayList<WebElement> hotelList = new ArrayList<>(driver.findElements(By.xpath(".//span[@class[contains(.,'sr-hotel__name')]]")));
        System.out.println(hotelList.size() != 0 ? "Hotels found" : "None hotels found");
        driver.quit();
    }
}
