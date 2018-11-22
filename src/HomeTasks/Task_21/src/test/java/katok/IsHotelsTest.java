package katok;

import katok.BookingHomePage;
import katok.BookingResultPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IsHotelsTest {
    private final String CITY = "Москва";
    private BookingHomePage bookingHomePage;
    private BookingResultPage bookingResultPage;
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.booking.com");
        driver.manage().window().maximize();
    }

    @Test
    public void isHotelTest() {
        bookingHomePage = new BookingHomePage(driver);
        bookingResultPage = new BookingResultPage(driver);
        bookingHomePage.doBasicSetUp(driver, CITY);
        Assert.assertTrue(bookingResultPage.isHotels(driver));
    }

    @AfterClass
    public static void Close() {
        driver.close();
    }
}
